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