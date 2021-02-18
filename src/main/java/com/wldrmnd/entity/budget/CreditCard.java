package com.wldrmnd.entity.budget;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CreditCard implements Serializable {

    private String numberOfAccount;
    private int[] CVVCode = new int[3];
    private Calendar hiringDate;
    private Money money;

    public CreditCard() {
        numberOfAccount = "1234 1234 1234 1243";
        CVVCode[0] = 1;
        CVVCode[1] = 2;
        CVVCode[2] = 3;
        hiringDate = new GregorianCalendar();
        money = new Money();
    }
}
