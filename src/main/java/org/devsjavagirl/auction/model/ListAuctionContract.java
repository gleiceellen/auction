package org.devsjavagirl.auction.model;

import java.util.ArrayList;
import java.util.List;

public class ListAuctionContract {
    private List<AuctionContract> listAuctionContract = new ArrayList<>();

    public List<AuctionContract> getListAuctionContract() {
        return listAuctionContract;
    }

    public void setListAuctionContract(List<AuctionContract> listAuctionContract) {
        this.listAuctionContract = listAuctionContract;
    }
}
