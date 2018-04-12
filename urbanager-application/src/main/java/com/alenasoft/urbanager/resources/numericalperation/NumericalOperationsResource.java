package com.alenasoft.urbanager.resources.numericalperation;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("primo")
public class NumericalOperationsResource {

    @GET
    public String pin() {
        return "/primo";
    }

}

