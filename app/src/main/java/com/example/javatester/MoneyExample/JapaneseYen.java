package com.example.javatester.MoneyExample;


public class JapaneseYen extends Currency {

    private int amount;

    public JapaneseYen(int amount) {
        this.amount = amount;
    }

    @Override
    public void add(Currency c) {

    }

    @Override
    public String getCode() {
        return "JPY";
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
