package mn.unitel.dummy.services;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 */
@Path("")
public class UserService {

    @RolesAllowed("ADMIN")
    @GET
    @Path("/users/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserById(@PathParam("id") int id, @Context Request req) {
        Response.ResponseBuilder rb = Response.ok(UserDatabase.getUserById(id));
        return rb.build();
    }

    @RolesAllowed("ADMIN")
    @PUT
    @Path("/users/{id}")
    public Response updateUserById(@PathParam("id") int id) {
        //Update the User resource
        UserDatabase.updateUser(id);
        return Response.status(200).build();
    }
    
}
