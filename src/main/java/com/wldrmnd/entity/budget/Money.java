package com.wldrmnd.entity.budget;

import java.io.Serializable;

public class Money implements Serializable {

    private Currency currency;
    private Double amount;

    public Money() {
        currency = Currency.BYN;
        amount = 0.0;
    }
}
