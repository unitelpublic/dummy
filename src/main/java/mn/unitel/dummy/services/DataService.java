/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.unitel.dummy.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 */
@Path("/data")
public class DataService {

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addData(Counter counter) {
        try {
            if (!counter.getPhoneno().matches("(^88|^89|^86)\\d{6}")) {

            }
        } catch (Exception ex) {
            return Response.ok(ex).build();
        }

        return Response.ok("SUCCESS").build();
    }

    @POST
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deductData() {
        return null;
    }
}
