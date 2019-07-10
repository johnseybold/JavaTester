package com.example.javatester.MoneyExample;

import org.junit.Test;

import static org.junit.Assert.*;

public class USDollarTest {

    @Test
    public void add() {
        USDollar d1 = new USDollar(3,21);
        USDollar d2 = new USDollar(2, 45);
        d1.add(d2);
        assertEquals(5, d1.getDollars());
        assertEquals(66, d1.getCents());
    }

    @Test
    public void subtract() {
    }
}