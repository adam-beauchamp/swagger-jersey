
package com.swaggy.baggy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.util.MimeTypeUtils;

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
    @Produces(MimeTypeUtils.TEXT_PLAIN_VALUE)
    @ApiOperation(value = "Get it", response = String.class)
    public String getIt() {
        org.springframework.core.io.Resource foo;
        return "Hi there!";
    }
    @Path("/goodbye")
    @GET
    @Produces(MimeTypeUtils.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Good Bye", response = GoodBye.class)
    public GoodBye getBye() {
    	return new GoodBye().setMessage("I say hello");
    }
}
