package com.wldrmnd.util;

import com.wldrmnd.entity.budget.Currency;
import com.wldrmnd.entity.budget.Money;

import java.util.Scanner;


public class AddMoney {
    private static Scanner in = new Scanner(System.in);

    public static Money addMoney(){
        Money money = new Money();
        money.setAmount(in.nextDouble());
        money.setCurrency(Currency.BYN);
        return money;
    }
}
