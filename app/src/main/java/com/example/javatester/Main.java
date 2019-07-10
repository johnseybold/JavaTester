package com.example.javatester;

import com.example.javatester.MoneyExample.JapaneseYen;
import com.example.javatester.MoneyExample.USDollar;
import com.example.javatester.MoneyExample.Wallet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, I'm a main method!  And I print stuff!");


        final USDollar d1 = new USDollar(3, 45);
        System.out.println(d1);
        USDollar d2 = new USDollar(2,37);
        JapaneseYen y1 = new JapaneseYen(234);

        Wallet w = new Wallet();
        w.add(d1);
        w.add(d2);

        System.out.println("Can I spend " + d1 + "?");
        System.out.println(w.canSpend(d1) ? "Yes!" : "No!");

        System.out.println("My wallet has " + w.getDollarTotal());
    }

}
