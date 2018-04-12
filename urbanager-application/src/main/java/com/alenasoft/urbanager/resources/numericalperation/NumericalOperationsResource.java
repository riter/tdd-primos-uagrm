package com.alenasoft.urbanager.resources.numericalperation;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("primo")
public class NumericalOperationsResource {

    @Inject
    private NumericalOperationsService service;

    @GET
    public String pin() {
        return "/primo";
    }

    @GET
    @Path("{entero}")
    public String getResult(@PathParam("entero") int entero) {
        return this.service.isPrime(entero);
    }
}

