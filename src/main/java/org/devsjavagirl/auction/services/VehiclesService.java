package org.devsjavagirl.auction.services;

import org.devsjavagirl.auction.components.StarWarsWebClient;
import org.devsjavagirl.auction.configuration.PokemonConfiguration;
import org.devsjavagirl.auction.model.AllPokemonResponse;
import org.devsjavagirl.auction.model.AllVehicleResponse;
import org.devsjavagirl.auction.model.VehicleResponse;
import org.devsjavagirl.auction.repositories.VehicleRepository;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class VehiclesService {
    private final VehicleRepository vehicleRepository;
    private final StarWarsWebClient starWarsWebClient;

    public VehiclesService(VehicleRepository vehicleRepository, StarWarsWebClient starWarsWebClient) {
        this.vehicleRepository = vehicleRepository;
        this.starWarsWebClient = starWarsWebClient;
    }

    public AllVehicleResponse getVehicles() {
        return starWarsWebClient.getAllVehicles();
    }

    public VehicleResponse getVehicle(Integer id) {
        return starWarsWebClient.getVehicle(id);
    }
}
