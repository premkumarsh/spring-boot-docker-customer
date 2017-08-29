package com.cor;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.cor.service.CustomerRest;

/**
 * Created by adrianmilne on 04/08/2016.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CustomerRest.class);
    }


}
