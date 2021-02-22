package com.wldrmnd.entity.purchase;

import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.budget.Money;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Getter
@Setter
public class Purchase {

    private Catetegory catetegory;
    private String description;
    private LocalDate localDate;
    private Money price;
    private Account account;

    @Override
    public String toString(){
        return "Account{" +
                "Category='" + catetegory + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                " Account=" + account.getName() +
                '}';
    }

}
