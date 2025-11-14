package org.acme.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.service.EchoService;

@Path("/echo")
public class EchoResource {

    private final EchoService echoService;

    @Inject
    public EchoResource(EchoService echoService) {
        this.echoService = echoService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{value}")
    public String hello(String value) {
        return echoService.echo(value);
    }
}
