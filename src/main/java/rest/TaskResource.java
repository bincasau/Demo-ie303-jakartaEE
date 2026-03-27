package rest;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import service.TaskService;

import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
public class TaskResource {

    @Inject
    TaskService service;

    @GET
    public List<?> list() { return service.getAll(); }

    @POST
    public String create(@QueryParam("title") String title) {
        service.add(title);
        return "Đã thêm nhiệm vụ!";
    }

    @PUT
    @Path("/{id}")
    public String update(@PathParam("id") Long id, @QueryParam("done") boolean done) {
        service.updateStatus(id, done);
        return "Nhiệm vụ ID " + id + " đã được cập nhật thành " + done;
    }

    @GET
    @Path("/admin")
    @RolesAllowed("ADMIN")
//    @PermitAll
    public String ping() {
        return "Server đang chạy!";
    }
}