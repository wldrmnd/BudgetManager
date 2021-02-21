package com.wldrmnd.entity.purchase;

import com.wldrmnd.entity.Account;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class purchase {

    private Catetegory catetegory;
    private String description;
    private LocalDate localDate = LocalDate.now();
    private Double sum;
    private Account account;

}
