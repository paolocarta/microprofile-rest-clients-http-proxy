package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UsersResource {

    @Inject
    @RestClient
    UsersService usersService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String name() {

        return usersService.get();
    }
}
