€eventArray:{event|
    @CrossOrigin
    @RequestMapping(value = "/query/€event.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public List<Occurrence> query€event.FirstCapital€(@RequestBody QueryInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){
            €eventoutputparameterarray:{it|{add(new Parameter().builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").build());\}};separator="\n"€
        \};
        return scipClientFunctions.performQuery(null,"€event.Name€",parameters,input.getFilter(),input.getTimeFrame());
    \}

    @CrossOrigin
    @RequestMapping(value = "/subscribe/€event.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public Observable<SubscribeResponse> subscribe€event.FirstCapital€(@RequestBody SubscribeInput input) {
        List<Parameter> parameters= new ArrayList<Parameter>(){
            €eventoutputparameterarray:{it|{add(new Parameter().builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").build());\}};separator="\n"€
        \};
        return scipClientFunctions.performSubscribe(null,"€event.Name€",parameters,input.getFilter(),input.getCorrelationIdentifier(), input.getDegreeOfConfidence());
    \}

    @CrossOrigin
    @RequestMapping(value = "/unsubscribe/€event.Name€", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE\})
    public UnsubscribeResponse unsubscribe€event.FirstCapital€() {
        List<Parameter> parameters= new ArrayList<Parameter>(){
            €eventoutputparameterarray:{it|{add(new Parameter().builder().name("€it.Name€").type("{\"type\": \"€it.ParamType€\"\}").build());\}};separator="\n"€
        \};
        return scipClientFunctions.performUnsubscribe("€event.Name€",null,parameters,null);
    \}
};separator="\n"€