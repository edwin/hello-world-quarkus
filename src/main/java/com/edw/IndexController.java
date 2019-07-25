package com.edw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "{\"Hello World\":\"Using Quarkus\"}";
    }
}
