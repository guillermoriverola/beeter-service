package edu.upc.eetac.dsa.beeter.auth;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.ws.rs.container.ContainerRequestContext;
import java.io.IOException;

/**
 * Created by Guillermo on 21/10/2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ContainerRequestFilter {
    void filter(ContainerRequestContext requestContext) throws IOException;
}
