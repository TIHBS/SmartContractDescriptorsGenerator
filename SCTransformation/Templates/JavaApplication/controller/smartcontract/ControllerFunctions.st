€functionArray:{function|
    @CrossOrigin
    @RequestMapping(value = "/invoke/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public InvokeResponse invoke€function.FirstCapital€(@RequestBody €functionParameter€Parameter parameter) throws ExecutionException, InterruptedException {
       List<Parameter> inputParameters = new ArrayList<Parameter>(){
            €inputparameterarray:{it|{add(Parameter.builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").value(parameter.get€it.FirstCapital€()).build());\}};separator="\n"€
       \};
       List<Parameter> outputParameters = new ArrayList<Parameter>(){
            €outputparameterarray:{it|{add(new Parameter().builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").build());\}};separator="\n"€
       \};
       return scipClientFunctions.performInvoke("€function.Name€",inputParameters,outputParameters,parameter.getDegreeOfConfidence()).get();
    \}
    
    @CrossOrigin
    @RequestMapping(value = "/query/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public List<Occurrence> query€function.FirstCapital€(@RequestBody QueryInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){
            €inputparameterarray:{it|{add(Parameter.builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").build());\}};separator="\n"€
        \};
        return scipClientFunctions.performQuery("€function.Name€",null,parameters,input.getFilter(),input.getTimeFrame());
    \}

    @CrossOrigin
    @RequestMapping(value = "/subscribe/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public Observable<SubscribeResponse> subscribe€function.FirstCapital€(@RequestBody SubscribeInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){
            €inputparameterarray:{it|{add(Parameter.builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").build());\}};separator="\n"€
        \};
        return scipClientFunctions.performSubscribe("€function.Name€",null,parameters,input.getFilter(),input.getCorrelationIdentifier(),input.getDegreeOfConfidence());
   \}
    
   @CrossOrigin
   @RequestMapping(value = "/unsubscribe/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
   public UnsubscribeResponse unsubscribe€function.FirstCapital€() {
        List<Parameter> parameters= new ArrayList<Parameter>(){
            €inputparameterarray:{it|{add(Parameter.builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").build());\}};separator="\n"€
        \};
        return scipClientFunctions.performUnsubscribe(null,"€function.Name€",parameters,null);
   \}
};separator="\n"€