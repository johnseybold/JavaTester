package com.example.javatester.MoneyExample;

import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    @Test
    public void add() {
        Wallet w = new Wallet();
        USDollar d1 = new USDollar(2, 15);
        USDollar d2 = new USDollar(1, 20);
        w.add(d1);
        USDollar total = w.getDollarTotal();
        assertEquals(d1, total);
        w.add(d2);
        total = w.getDollarTotal();
        USDollar sum = d1.add(d2);
        assertEquals(sum, total);


    }

    @Test
    public void canSpend() {
    }

    @Test
    public void getDollarTotal() {
    }
}