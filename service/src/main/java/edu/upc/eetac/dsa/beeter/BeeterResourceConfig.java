package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Guillermo on 28/09/2015.
 */
public class BeeterResourceConfig extends ResourceConfig {
    public BeeterResourceConfig(){
        packages("edu.upc.eetac.dsa.beeter");
    }
}