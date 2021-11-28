package com.config.demo;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {
    @ConfigProperty(name = "Ifrs.pw2",  defaultValue="" )
    String message;

    @GET
    public String sayHello() {
        return this.message;
    }
}
