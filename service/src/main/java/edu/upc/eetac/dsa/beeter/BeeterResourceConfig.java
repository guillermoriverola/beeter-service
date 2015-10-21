package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

/**
 * Created by Guillermo on 28/09/2015.
 */
public class BeeterResourceConfig extends ResourceConfig {
    public BeeterResourceConfig() {
        register(RolesAllowedDynamicFeature.class);
        packages("edu.upc.eetac.dsa.beeter");
        packages("edu.upc.eetac.dsa.beeter.auth");
    }
}