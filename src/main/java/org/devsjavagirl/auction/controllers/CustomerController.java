package org.devsjavagirl.auction.controllers;

import org.devsjavagirl.auction.model.AllPokemonResponse;
import org.devsjavagirl.auction.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public ResponseEntity<AllPokemonResponse> getCustomer() {
        return ResponseEntity.ok(customerService.getAllPokemon());
    }

}
