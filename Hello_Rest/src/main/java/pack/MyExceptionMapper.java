package pack;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.core.MediaType;


public class MyExceptionMapper implements ExceptionMapper<Exception> {


    public Response toResponse(Exception exception) {

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                       .entity("An error occurred: " + exception.getMessage())
                       .type(MediaType.TEXT_PLAIN)
                       .build();
    }
}
