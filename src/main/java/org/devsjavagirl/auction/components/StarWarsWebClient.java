package org.devsjavagirl.auction.components;

import org.devsjavagirl.auction.configuration.StarWarsConfiguration;
import org.devsjavagirl.auction.model.AllVehicleResponse;
import org.devsjavagirl.auction.model.VehicleResponse;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class StarWarsWebClient {

    private final String allVehiclesResource;
    private final String vehicleResource;
    private WebClient webClient;

    StarWarsWebClient(WebClient webClient, StarWarsConfiguration starWarsConfiguration) {
        this.webClient = webClient;
        this.allVehiclesResource = starWarsConfiguration.starWarsVehicles;
        this.vehicleResource = starWarsConfiguration.starWarsVehicle;
    }

    public AllVehicleResponse getAllVehicles() {
        return webClient
                .method(HttpMethod.GET)
                .uri(allVehiclesResource)
                .retrieve()
                .bodyToMono(AllVehicleResponse.class)
                .block();
    }

    public VehicleResponse getVehicle(Integer id) {
        return webClient
                .method(HttpMethod.GET)
                .uri(vehicleResource, id)
                .retrieve()
                .bodyToMono(VehicleResponse.class)
                .block();
    }
}