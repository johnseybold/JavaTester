package com.example.javatester.MoneyExample;

import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest3 {

    @Test
    public void canSpend() {
        Wallet w = new Wallet();
        USDollar d = new USDollar(1, 25);
        assertFalse(w.canSpend(d));

    }
}