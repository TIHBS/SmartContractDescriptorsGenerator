€functionArray:{function|
    @CrossOrigin
    @RequestMapping(value = "/invoke/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public CompletableFuture<InvokeResponse> invoke€function.FirstCapital€(@RequestBody €functionParameter€Parameter parameter) {
       
       List<Parameter> inputParameters = new ArrayList<Parameter>(){
       €inputparameterarray:{it|{add(Parameter.builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").value(parameter.get€it.FirstCapital€()).build());\}};separator="\n"€
       \};
       List<Parameter> outputParameters = new ArrayList<Parameter>(){
       €outputparameterarray:{it|{add(new Parameter().builder().name("€it.name€").type("{\"type\": \"€it.type€\"\}").build());\}};separator="\n"€
       \};
       return scipClientFunctions.performInvoke("€function.Name€",inputParameters,outputParameters,parameter.getDegreeOfConfidence());
    \}
    
    //TODO:
        @CrossOrigin
        @RequestMapping(value = "/query/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
        public List<Occurrence> query€function.FirstCapital€(@RequestBody QueryInput input) {
            List<Parameter> parameters= new ArrayList<Parameter>(){{
                //TODO: Generated parameters
                add(new Parameter().builder().name("name").type("type").value("value").build());
            \}\};
            return scipClientFunctions.performQuery("€function.Name€",null,parameters,input.getFilter(),input.getTimeFrame());
        \}

//TODO: Generate Mapping
    @CrossOrigin
    @RequestMapping(value = "/subscribe/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public Observable<SubscribeResponse> subscribe€function.FirstCapital€(@RequestBody SubscribeInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){{
            //TODO: Generated parameters
            add(new Parameter().builder().name("name").type("type").value("value").build());
        \}\};
        return scipClientFunctions.performSubscribe("€function.Name€",null,parameters,input.getFilter(),input.getCorrelationIdentifier(),input.getDegreeOfConfidence());
   \}
    
    //TODO: Generate Mapping
        @CrossOrigin
        @RequestMapping(value = "/unsubscribe/€function.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
        public UnsubscribeResponse unsubscribe€function.FirstCapital€() {
            List<Parameter> parameters= new ArrayList<Parameter>(){{
                //TODO: Generated parameters
                add(new Parameter().builder().name("name").type("type").value("value").build());
            \}\};
            return scipClientFunctions.performUnsubscribe(null,"€function.Name€",parameters,null);
        \}
};separator="\n"€