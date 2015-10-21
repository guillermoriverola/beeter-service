package edu.upc.eetac.dsa.beeter.auth;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Guillermo on 21/10/2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface Principal {
    String getName();
}
