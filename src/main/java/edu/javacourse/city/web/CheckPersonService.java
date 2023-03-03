package edu.javacourse.city.web;

import edu.javacourse.city.domain.PersonResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;



@Path("/check")
public class CheckPersonService {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PersonResponse checkPerson(@PathParam("id") int simpleId,
                                      @QueryParam("name") String simpleName){
        return new PersonResponse();
    }

}

//GET /city-register-1.0/rest/check/101/simple   ?name1=value1&name2=value2
