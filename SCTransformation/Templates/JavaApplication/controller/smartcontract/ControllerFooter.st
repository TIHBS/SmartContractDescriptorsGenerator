@CrossOrigin
    @RequestMapping(value = "/unsubscribe€contractName€/", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public UnsubscribeResponse unsubscribe(@RequestBody String correlationIdentifier) {
        return scipClientFunctions.performUnsubscribe(null,null,null, correlationIdentifier);
    }
}