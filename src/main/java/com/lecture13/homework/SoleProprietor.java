package com.lecture13.homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoleProprietor extends Company {
    protected String founderName;
    protected double originalFunds;
    protected double currentFunds;

    public SoleProprietor(String name, String dateEstablished, String identifier) {
        super(name, dateEstablished, identifier);
    }

    public SoleProprietor(String name, String dateEstablished, String identifier, String founderName,
                          double originalFunds, double currentFunds) {
        super(name, dateEstablished, identifier);
        this.founderName = founderName;
        this.originalFunds = originalFunds;
        this.currentFunds = currentFunds;

    }

    public double calculateProfit() {
        return currentFunds - originalFunds;
    }
}