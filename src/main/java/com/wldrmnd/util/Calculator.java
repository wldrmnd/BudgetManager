package com.wldrmnd.util;

import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.budget.Balance;
import com.wldrmnd.entity.budget.Currency;
import com.wldrmnd.entity.budget.Money;

public class Calculator {

    public static double avilableBalance(Balance balance) {
        double moneyFromCash = balance.getCash().getMoneyCash().getAmount();
        double moneyFromCreaditCard = balance.getCreditCard().getMoney().getAmount();
        double totalAmount = moneyFromCash + moneyFromCreaditCard;

        return totalAmount;
    }

    public static double deductionOfExpensesFromIncone(Money price, Account account) {
        double creditCardMoney = account.getBalance().getCreditCard().getMoney().getAmount();
        account.getBalance().getCash().setMoneyCash(new Money(Currency.BYN,creditCardMoney - price.getAmount()));
        return account.getBalance().getCreditCard().getMoney().getAmount();
    }
}
