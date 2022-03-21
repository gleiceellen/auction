package org.devsjavagirl.auction.services;

import org.devsjavagirl.auction.model.FinalContract;
import org.devsjavagirl.auction.model.ListAuctionContract;
import org.springframework.stereotype.Service;

@Service
public class ContractMaker {
    private VehiclesService vehiclesService;
    private ContractService contractService;
    private CustomerService customerService;

    public ContractMaker(VehiclesService vehiclesService, ContractService contractService, CustomerService customerService) {
        this.vehiclesService = vehiclesService;
        this.contractService = contractService;
        this.customerService = customerService;
    }

    public FinalContract settingContractUp() {
        FinalContract finalContract = new FinalContract();
        finalContract.setContractPartners(contractService.contractPartners().block());
        finalContract.setCustomerName(customerService.getAllPokemon().getResults().get(0).getName());
        finalContract.setVehicleName(vehiclesService.getVehicle(4).getName());
        return finalContract;
    }
}
