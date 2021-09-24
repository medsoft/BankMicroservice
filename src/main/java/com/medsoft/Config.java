package com.medsoft;

import com.medsoft.entities.Compte;
import com.medsoft.web.CompteRestJaxrs;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//to deploy jersey we gonna use this configuration file
@Configuration
public class Config {
    //@Bean
    public ResourceConfig resourceConfig (){
        ResourceConfig jerseyServlet = new ResourceConfig() ;
        jerseyServlet.register(CompteRestJaxrs.class);
        return  jerseyServlet ;
    }
}
