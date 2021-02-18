package com.wldrmnd.entity.budget;

import java.io.Serializable;

public class Balance implements Serializable {

    private Cash cash;
    private CreditCard creditCard;

    public Balance() {
        this.cash = new Cash();
        this.creditCard = new CreditCard();
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
