/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger.app;

import io.swagger.jaxrs.config.BeanConfig;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author kazuki
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {
    private static final String RESOURCE_PACKAGE = UserResource.class.getPackage().getName();

    public ApplicationConfig() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("Swagger Sample");
        beanConfig.setDescription("デモ用 Glassfish JAX-RS project.");
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080"); // ex. "localhost:8002"
        beanConfig.setBasePath("www/swagger-sample/api");  // ex. "/api"
        beanConfig.setPrettyPrint(true);

        beanConfig.setResourcePackage(RESOURCE_PACKAGE); // ex. "io.swagger.resources"
        beanConfig.setScan(true);
    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);

        // enable Swagger
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        
        resources.add(com.swagger.app.CompanyResource.class);
        resources.add(com.swagger.app.RestResponseFilter.class);
        resources.add(com.swagger.app.UserResource.class);
        
        
        
    }

}
