package com.example.javatester.MoneyExample;

public abstract class Currency {

    public abstract void add(Currency c);


    public abstract String getCode();

    public abstract int getAmount();
/*
    protected abstract Denomination[] getDenominations();


    protected abstract int getRawAmount();

    protected abstract double getExchangeRate(Currency c);

    public String getFewestDenominations() {
        int remainder = getRawAmount();
        String result= "";
        final Denomination[] denominations = getDenominations();
        for (int i = 0; i < denominations.length; i++) {
            final int value = denominations[i].getValue();
            if (remainder >= value) {
                int count = remainder / value;
                remainder = remainder % (count * value);
                result += count + " ";
                result += (count > 1 ? denominations[i].getPluralName() : denominations[i].getSingularName());
                if (remainder > 0) {
                    result += ", ";
                }
            }

        }
        return result;
    }

    public abstract String getFormattedAmount();

    */
}
