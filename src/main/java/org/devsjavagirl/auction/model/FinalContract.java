package org.devsjavagirl.auction.model;

import java.util.List;

public class FinalContract {
    private String CustomerName;
    private String VehicleName;
    private List<AuctionContract> listAuctionContract;
    private List<ContractPartner> contractPartners;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public List<AuctionContract> getListAuctionContract() {
        return listAuctionContract;
    }

    public void setListAuctionContract(List<AuctionContract> listAuctionContract) {
        this.listAuctionContract = listAuctionContract;
    }

    public List<ContractPartner> getContractPartners() {
        return contractPartners;
    }

    public void setContractPartners(List<ContractPartner> contractPartners) {
        this.contractPartners = contractPartners;
    }
}
