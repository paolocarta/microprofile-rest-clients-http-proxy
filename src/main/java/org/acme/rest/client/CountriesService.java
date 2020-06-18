package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/v2")
@RegisterRestClient(configKey = "countries-service")
public interface CountriesService {

    @GET
    @Path("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    Set<Country> getByName(@PathParam String name);
}
