package €packageName€.client_application.controller.€contractPackageName€;

import €packageName€.client_application.controller.€contractPackageName€.parameter.*;
import €packageName€.client_application.model.common.Occurrence;
import €packageName€.client_application.model.common.Parameter;
import €packageName€.client_application.model.input.QueryInput;
import €packageName€.client_application.model.input.SubscribeInput;
import €packageName€.client_application.model.response.scip.InvokeResponse;
import €packageName€.client_application.model.response.scip.SubscribeResponse;
import €packageName€.client_application.model.response.scip.UnsubscribeResponse;
import €packageName€.client_application.utils.GenericScipClientFunctions;
import io.reactivex.Observable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class €contractName€Controller {

    private final GenericScipClientFunctions scipClientFunctions;

    public €contractName€Controller(){
        scipClientFunctions = new GenericScipClientFunctions(
                "€sclAddress€","€callbackUrl€");
    }