package org.devsjavagirl.auction.controllers;

import org.devsjavagirl.auction.model.AuctionContract;
import org.devsjavagirl.auction.model.ContractRequest;
import org.devsjavagirl.auction.model.FinalContract;
import org.devsjavagirl.auction.services.ContractMaker;
import org.devsjavagirl.auction.services.ContractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    private final ContractService contractService;
    private final ContractMaker contractMaker;

    public ContractController(ContractService contractService, ContractMaker contractMaker) {
        this.contractService = contractService;
        this.contractMaker = contractMaker;
    }

    @GetMapping("/contract")
    public ResponseEntity<FinalContract> settingContract() {
        return ResponseEntity.ok(contractMaker.settingContractUp());
    }

    @GetMapping("/contract/publicity")
    public ResponseEntity<AuctionContract> publishAuctionContract() {
        return ResponseEntity.ok(contractService.publishAuctionContract());
    }

    @GetMapping("/contract/settle")
    public ResponseEntity<ContractRequest> contractCreate() {
        return ResponseEntity.ok(contractService.contractCreate());
    }
}
