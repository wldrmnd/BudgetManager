package com.wldrmnd.entity.budget;

import java.io.Serializable;

public class Cash implements Serializable {

    private Money moneyCash;

    public Cash() {
        this.moneyCash = new Money();
    }
}
