package com.example.javatester.MoneyExample;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private List<Currency> currencies;

    public Wallet() {
        currencies = new ArrayList<Currency>();
    }

    public void add(Currency c) {
        currencies.add(c);
    }

    public boolean canSpend(Currency toSpend) {
        for (int i = 0; i < currencies.size(); i++) {
            Currency c = currencies.get(i);
            if (c.getCode().equals(toSpend.getCode())) {
                if (c.getAmount() >= toSpend.getAmount()) {
                    return true;
                }
            }
        }
        return false;
    }

    public USDollar getDollarTotal() {
        double total = 0.0;
        for (int i = 0; i < currencies.size(); i++) {
            Currency c = currencies.get(i);
            total += c.getAmount() * ExchangeService.getRate(c.getCode());
        }
        return new USDollar((int)(total / 100), (int)(total % 100));
    }



}
