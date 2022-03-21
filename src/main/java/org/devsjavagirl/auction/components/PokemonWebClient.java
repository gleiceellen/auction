package org.devsjavagirl.auction.components;

import org.devsjavagirl.auction.configuration.PokemonConfiguration;
import org.devsjavagirl.auction.model.AllPokemonResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.HttpMethod;


@Component
public class PokemonWebClient {

    private final String allPokemon;
    private WebClient webClientPokemon;

    PokemonWebClient(WebClient webClientPokemon, PokemonConfiguration pokemonConfiguration) {
        this.webClientPokemon = webClientPokemon;
        this.allPokemon = pokemonConfiguration.pokemonBaseUrl;
    }

    public AllPokemonResponse getAllPokemon() {
        return webClientPokemon
                .method(HttpMethod.GET)
                .uri(allPokemon)
                .retrieve()
                .bodyToMono(AllPokemonResponse.class)
                .block();
    }
}