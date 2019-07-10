package com.example.javatester.MoneyExample;

public class USDollar extends Currency {

    private static final Denomination[] denominations = {
            new Denomination("single", "singles", 100),
            new Denomination("quarter", "quarters", 25),
            new Denomination("dime", "dimes", 10),
            new Denomination("nickel", "nickels", 5),
            new Denomination("penny","pennies", 1)
    };

    private int amount; // in cents

    protected Denomination[] getDenominations() {
        return denominations;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", getDollars(), getCents());
    }

    public USDollar(int dollars, int cents) {
        amount = dollars * 100 + cents;
    }

    private USDollar(USDollar d) {
        this.amount = d.amount;
    }

    public USDollar add(USDollar d) {
        USDollar retval = new USDollar(this);
        retval.amount += d.amount;
        return retval;
    }

    public void subtract(USDollar d) {
        amount -= d.amount;
    }

    public int getDollars() {
        return amount / 100;
    }

    public int getCents() {
        return amount % 100;
    }

    @Override
    public void add(Currency c) {


    }

    @Override
    public String getCode() {
        return "USD";
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        USDollar d = (USDollar)obj;
        return d.amount == this.amount;
    }
}
