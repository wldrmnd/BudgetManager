package com.wldrmnd.entity;

import com.wldrmnd.entity.budget.Balance;
import com.wldrmnd.entity.purchase.Purchase;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.List;


//зарегистрироваться
//логин
//добавить деньги (кеш или картa), если карта - то привязать кредитку (можно только одну)
//добавить трата (пицца, шлюха, квартира)
//добавить долг (мне должен кто-то)
//вывести траты за определеннный промежуток
@Setter
@Getter
public class Account extends User implements Serializable, Cloneable {

    private String name;
    private String surname;
    private Balance balance;
    private List<Purchase> purchaseList;
    private double totalAmout;

    public Account(User user) {
        setLogin(user.getLogin());
        setPassword(user.getPassword());
        name = "Undefined";
        surname = "Undefined";
        balance = new Balance();
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                "purchases=" + purchaseList +
                '}';
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }
}
