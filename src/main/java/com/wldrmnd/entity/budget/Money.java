package com.wldrmnd.entity.budget;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Money implements Serializable {

    private Currency currency;
    private Double amount;

    public Money() {
        currency = Currency.BYN;
        amount = 0.0;
    }
}
