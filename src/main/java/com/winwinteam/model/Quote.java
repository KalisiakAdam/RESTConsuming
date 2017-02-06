package com.winwinteam.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by kalisiaczki on 06.02.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String buy;
    private String sell;

    public Quote() {
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "buy='" + buy + '\'' +
                ", sell='" + sell + '\'' +
                '}';
    }
}
