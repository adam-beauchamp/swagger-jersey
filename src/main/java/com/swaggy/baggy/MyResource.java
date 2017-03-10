
package com.swaggy.baggy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Example resource class hosted at the URI path "/rest"
 */
@Path("/rest")
@Api(value = "/rest")
public class MyResource {

    /**
     * Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * 
     * @return String that will be send back as a response of type "text/plain".
     */
    @Path("/hi")
    @GET
    @Produces("text/plain")
    @ApiOperation(value = "Get it", response = String.class)
    public String getIt() {
        org.springframework.core.io.Resource foo;
        return "Hi there!";
    }
}
