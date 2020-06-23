package €packageName€.client_application.utils;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import €packageName€.client_application.model.common.Occurrence;
import €packageName€.client_application.model.common.Parameter;
import €packageName€.client_application.model.common.TimeFrame;
import €packageName€.client_application.model.request.scip.InvocationRequestMessage;
import €packageName€.client_application.model.request.scip.InvocationRequestMessage.InvocationRequestMessageBuilder;
import €packageName€.client_application.model.request.scip.QueryRequestMessage;
import €packageName€.client_application.model.request.scip.SubscriptionRequestMessage;
import €packageName€.client_application.model.request.scip.UnsubscriptionRequestMessage;
import €packageName€.client_application.model.response.scip.InvokeResponse;
import €packageName€.client_application.model.response.scip.SubscribeResponse;
import €packageName€.client_application.model.response.scip.UnsubscribeResponse;
import €packageName€.client_application.scipclient.ScipClient;
import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GenericScipClientFunctions {

    private final String scl;
    private final String callbackUrl;

    public GenericScipClientFunctions(String scl, String callbackUrl) {
        this.scl = scl;
        this.callbackUrl = callbackUrl;
    }

    //Ghareeb: inputs and outputs must be provided even if they are empty lists
    public CompletableFuture<InvokeResponse> performInvoke(String functionId,
                                                           List<Parameter> inputs,
                                                           List<Parameter> outputs,
                                                           @Nullable Double degreeOfConfidence) {
        InvocationRequestMessageBuilder msg = InvocationRequestMessage.builder()
                .inputs(inputs)//TODO: List of parameters based on thing has to be invoked
                .outputs(outputs)//TODO: Collection of specific type
                .functionIdentifier(functionId)
                .callbackUrl(callbackUrl)
                .correlationIdentifier(UUID.randomUUID().toString()) //TODO: Identifier GUID
                .signature("");
        if (degreeOfConfidence != null) {
            msg = msg.requiredConfidence(degreeOfConfidence);
        }
        // Ghareeb: invocation could be a very lengthy operation, so return a completable future
        return ScipClient.getInstance().invoke(scl, msg.build());
    }

    public List<Occurrence> performQuery(@Nullable String functionId,
                                         @Nullable String eventId,
                                         @Nullable List<Parameter> parameters,
                                         @Nullable String filter,
                                         @Nullable TimeFrame timeFrame) {
        try {
            QueryRequestMessage msg = QueryRequestMessage.builder()
                    .eventIdentifier(eventId)
                    .functionIdentifier(functionId)
                    .filter(filter)
                    .timeframe(timeFrame)
                    .parameters(parameters)
                    .build();
            return ScipClient.getInstance().query(scl, msg).get().getOccurrences();
        } catch (InterruptedException | ExecutionException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }


    public Observable<SubscribeResponse> performSubscribe(@Nullable String functionId,
                                                          @Nullable String eventId,
                                                          @Nullable List<Parameter> parameters,
                                                          @Nullable String filter,
                                                          @Nullable String correlationIdentifier,
                                                          @Nullable Double degreeOfConfidece) {
        if (correlationIdentifier == null) {
            correlationIdentifier = UUID.randomUUID().toString();
        }

        SubscriptionRequestMessage.SubscriptionRequestMessageBuilder msg = SubscriptionRequestMessage.builder()
                .parameters(parameters)
                .functionIdentifier(functionId)
                .eventIdentifier(eventId)
                .callbackUrl(callbackUrl)
                .filter(filter)
                .correlationIdentifier(correlationIdentifier);

        if (degreeOfConfidece != null) {
            msg = msg.degreeOfConfidence(degreeOfConfidece);
        }

        return ScipClient.getInstance().subscribe(scl, msg.build());
    }

    public UnsubscribeResponse performUnsubscribe(@Nullable String eventId, @Nullable String functionId, @Nullable List<Parameter> parameters, @Nullable String correlationIdentifier) {
        try {
            UnsubscriptionRequestMessage msg = UnsubscriptionRequestMessage.builder()
                    .parameters(parameters) //TODO: List of parameters based on thing has to be invoked
                    .functionIdentifier(functionId)
                    .eventIdentifier(eventId)
                    .callbackUrl(callbackUrl)
                    .correlationIdentifier(correlationIdentifier) //TODO: Identifier GUID
                    .build();
            return ScipClient.getInstance().unsubscribe(scl, msg).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}