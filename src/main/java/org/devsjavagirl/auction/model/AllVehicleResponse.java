package org.devsjavagirl.auction.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

@JsonAutoDetect
public class AllVehicleResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<VehicleResponse> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<VehicleResponse> getResults() {
        return results;
    }

    public void setResults(List<VehicleResponse> results) {
        this.results = results;
    }
}