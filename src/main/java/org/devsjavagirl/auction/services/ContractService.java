package org.devsjavagirl.auction.services;

import org.devsjavagirl.auction.configuration.PokemonConfiguration;
import org.devsjavagirl.auction.model.*;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ContractService {
    private final WebClient webClient = WebClient.builder().build();
    private PokemonConfiguration pokemonConfiguration;

    public ListAuctionContract listOfAllContract() {
        String url = "https://jsonplaceholder.typicode.com/comments";
        return webClient
                .method(HttpMethod.GET)
                .uri(url)
                .retrieve()
                .bodyToMono(ListAuctionContract.class)
                .block();
    }

    public AuctionContract publishAuctionContract() {
        String url = "https://jsonplaceholder.typicode.com/posts/1/comments/1";
        return webClient
                .method(HttpMethod.GET)
                .uri(url)
                .retrieve()
                .bodyToMono(AuctionContract.class)
                .block();
    }

    public ContractRequest contractCreate() {
        String url = "https://jsonplaceholder.typicode.com/posts/2";
        return webClient
                .method(HttpMethod.GET)
                .uri(url)
                .retrieve()
                .bodyToMono(ContractRequest.class)
                .block();
    }

    public ContractRequest updatingContract() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        return webClient
                .method(HttpMethod.DELETE)
                .uri(url)
                .retrieve()
                .bodyToMono(ContractRequest.class)
                .block();
    }

    public ListAuctionContract ContractClausulas() {
        String url = "https://jsonplaceholder.typicode.com/posts/2/comments";
        return webClient
                .method(HttpMethod.GET)
                .uri(url)
                .retrieve()
                .bodyToMono(ListAuctionContract.class)
                .block();
    }

    public Mono<List<ContractPartner>> contractPartners() {
        String url = "https://jsonplaceholder.typicode.com/albums";
        return webClient
                .method(HttpMethod.GET)
                .uri(url)
                .retrieve()
                .bodyToFlux(ContractPartner.class)
                .collectList();
    }

    public ContractPartner contractPartner() {
        String url = "https://jsonplaceholder.typicode.com/albums/1";
        return webClient
                .method(HttpMethod.GET)
                .uri(url)
                .retrieve()
                .bodyToMono(ContractPartner.class)
                .block();
    }
}
