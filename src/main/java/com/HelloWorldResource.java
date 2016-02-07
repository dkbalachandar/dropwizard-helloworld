package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "hello")
public class HelloWorldResource {

    private final String message;

    public HelloWorldResource(String message) {
        this.message = message;
    }

    @GET
    public String sayHello() {
        return message;
    }

}
