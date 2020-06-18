package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/employee/1")
@RegisterRestClient(configKey = "users-service")
public interface UsersService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String get();
}