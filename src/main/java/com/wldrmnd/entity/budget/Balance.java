package com.wldrmnd.entity.budget;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

public class Balance implements Serializable {

    private Cash cash;
    private CreditCard creditCard;

    public Balance() {
        this.cash = new Cash();
        this.creditCard = new CreditCard();
    }
}