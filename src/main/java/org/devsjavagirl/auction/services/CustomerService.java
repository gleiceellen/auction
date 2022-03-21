package org.devsjavagirl.auction.services;

import org.devsjavagirl.auction.components.PokemonWebClient;
import org.devsjavagirl.auction.configuration.PokemonConfiguration;
import org.devsjavagirl.auction.model.AllPokemonResponse;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CustomerService {

    private final WebClient webClient = WebClient.builder().build();
    private PokemonConfiguration pokemonConfiguration;


    public AllPokemonResponse getAllPokemon() {
        String url = "https://pokeapi.co/api/v2/pokemon";
        return webClient
                .method(HttpMethod.GET)
                .uri(url)
                .retrieve()
                .bodyToMono(AllPokemonResponse.class)
                .block();
    }
}
