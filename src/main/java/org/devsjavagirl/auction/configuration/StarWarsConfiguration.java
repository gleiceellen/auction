package org.devsjavagirl.auction.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:application.properties")
public class StarWarsConfiguration {

    @Value("${starwars.base-url}")
    public String starWarsBaseUrl;

    @Value("${starwars.vehicles}")
    public String starWarsVehicles;

    @Value("${starwars.vehicle}")
    public String starWarsVehicle;
}