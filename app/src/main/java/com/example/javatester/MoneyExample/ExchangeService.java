package com.example.javatester.MoneyExample;

import java.util.HashMap;
import java.util.Map;

public class ExchangeService {

    private static Map<String, Double> rates;

    static {
        rates = new HashMap<String, Double>();
        rates.put("USD", 1.0);
        rates.put("JPY", 0.01);

    }

    // Nobody can instantiate this class
    private ExchangeService() {}

    public static double getRate(String code) {
        return rates.get(code);
    }


}
