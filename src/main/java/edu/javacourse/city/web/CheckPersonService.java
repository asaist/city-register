package edu.javacourse.city.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/check")
public class CheckPersonService {
    @GET
    @Path("/{id}")
    public String checkPerson(@PathParam("id") int simpleId, @QueryParam("name") String simpleName){
        return simpleId + ":" + "Simple String";
    }

}

//GET /city-register-1.0/rest/check/101/simple   ?name1=value1&name2=value2
