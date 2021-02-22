package com.wldrmnd.entity.budget;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Cash implements Serializable {

    private Money moneyCash;

    public Cash() {
        this.moneyCash = new Money();
    }
}
