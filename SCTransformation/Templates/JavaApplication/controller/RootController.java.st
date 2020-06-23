package €packageName€.client_application.controller;

import €packageName€.client_application.scipclient.ClientApplicationService;
import com.github.arteam.simplejsonrpc.server.JsonRpcServer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String performJsonRpcCall(@RequestBody String jsonRequest) {
        ClientApplicationService service = new ClientApplicationService();
        JsonRpcServer server = new JsonRpcServer();
        return server.handle(jsonRequest, service);
    }
}
