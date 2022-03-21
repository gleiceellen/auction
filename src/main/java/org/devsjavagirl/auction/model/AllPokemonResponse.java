package org.devsjavagirl.auction.model;

import java.util.List;

public class AllPokemonResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<PokemonResponse> results;

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

    public List<PokemonResponse> getResults() {
        return results;
    }

    public void setResults(List<PokemonResponse> results) {
        this.results = results;
    }
}
