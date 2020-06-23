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
€functionArray:{functionName|
    @CrossOrigin
    @RequestMapping(value = "/invoke/€functionName€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public CompletableFuture<InvokeResponse> invoke€functionName€(@RequestBody €functionParameter€Parameter parameter) {
       
       List<Parameter> inputParameters = new ArrayList<Parameter>(){
       €inputparameterarray:{it|{add(Parameter.builder().name("€it.name€").type("{\"type\": \"€it.type€\"\}").value(parameter.get€it.name€()).build());\}};separator="\n"€
       \};
       List<Parameter> outputParameters = new ArrayList<Parameter>(){
       €outputparameterarray:{it|{add(new Parameter().builder().name("€it.name€").type("{\"type\": \"€it.type€\"\}").build());\}};separator="\n"€
       \};
       return scipClientFunctions.performInvoke("€functionName€",inputParameters,outputParameters,parameter.getDegreeOfConfidence());
    \}
    
    //TODO:
        @CrossOrigin
        @RequestMapping(value = "/query/€functionName€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
        public List<Occurrence> query€functionName€(@RequestBody QueryInput input) {
            List<Parameter> parameters= new ArrayList<Parameter>(){{
                //TODO: Generated parameters
                add(new Parameter().builder().name("name").type("type").value("value").build());
            \}\};
            return scipClientFunctions.performQuery("€functionName€",null,parameters,input.getFilter(),input.getTimeFrame());
        \}

//TODO: Generate Mapping
    @CrossOrigin
    @RequestMapping(value = "/subscribe/€functionName€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public Observable<SubscribeResponse> subscribe€functionName€(@RequestBody SubscribeInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){{
            //TODO: Generated parameters
            add(new Parameter().builder().name("name").type("type").value("value").build());
        \}\};
        return scipClientFunctions.performSubscribe("€functionName€",null,parameters,input.getFilter(),input.getCorrelationIdentifier(),input.getDegreeOfConfidence());
   \}
    
    //TODO: Generate Mapping
        @CrossOrigin
        @RequestMapping(value = "/unsubscribe/€functionName€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
        public UnsubscribeResponse unsubscribe€functionName€() {
            List<Parameter> parameters= new ArrayList<Parameter>(){{
                //TODO: Generated parameters
                add(new Parameter().builder().name("name").type("type").value("value").build());
            \}\};
            return scipClientFunctions.performUnsubscribe(null,"€functionName€",parameters,null);
        \}
};separator="\n"€

€eventArray:{eventName|
    @CrossOrigin
    @RequestMapping(value = "/query/€eventName€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public List<Occurrence> query€eventName€(@RequestBody QueryInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){
        €eventoutputparameterarray:{it|{add(new Parameter().builder().name("€it.name€").type("{\"type\": \"€it.type€\"\}").build());\}};separator="\n"€
        \};
        return scipClientFunctions.performQuery(null,"€eventName€",parameters,input.getFilter(),input.getTimeFrame());
    \}

    //TODO: Generate Mapping
    @CrossOrigin
    @RequestMapping(value = "/subscribe/€eventName€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public Observable<SubscribeResponse> subscribe€eventName€(@RequestBody SubscribeInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){{
            //TODO: Generated parameters
            add(new Parameter().builder().name("name").type("type").value("value").build());
        \}\};
        return scipClientFunctions.performSubscribe(null,"€eventName€",parameters,input.getFilter(),input.getCorrelationIdentifier(), input.getDegreeOfConfidence());
    \}

    //TODO: Generate Mapping
    @CrossOrigin
    @RequestMapping(value = "/unsubscribe/€eventName€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public UnsubscribeResponse unsubscribe€eventName€() {
        List<Parameter> parameters= new ArrayList<Parameter>(){{
            //TODO: Generated parameters
            add(new Parameter().builder().name("name").type("type").value("value").build());
        \}\};
        return scipClientFunctions.performUnsubscribe("€eventName€",null,parameters,null);
    \}
};separator="\n"€
    @CrossOrigin
    @RequestMapping(value = "/unsubscribe€contractName€/", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public UnsubscribeResponse unsubscribe(@RequestBody String correlationIdentifier) {
        return scipClientFunctions.performUnsubscribe(null,null,null, correlationIdentifier);
    }
}
