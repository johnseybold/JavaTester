package com.example.javatester.MoneyExample;

import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest2 {

    @Test
    public void add() {
    }

    @Test
    public void canSpend() {
        Wallet w = new Wallet();
        USDollar d = new USDollar(10, 25);
        assertFalse(w.canSpend(d));
    }

    @Test
    public void getDollarTotal() {
    }
}