package org.devsjavagirl.auction.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class PokemonConfiguration {

    @Value("${pokemon.base-url}")
    public String pokemonBaseUrl;

}