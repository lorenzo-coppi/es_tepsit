package pack;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

public class MyRequestResponseFilter implements ContainerRequestFilter, ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        // Logica per la richiesta (ad esempio, logging, validazione, etc.)
        System.out.println("Request received: " + requestContext.getUriInfo().getRequestUri());
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        // Logica per la risposta (ad esempio, aggiungere header, logging, etc.)
        System.out.println("Response sent: " + responseContext.getStatus());
    }
}
