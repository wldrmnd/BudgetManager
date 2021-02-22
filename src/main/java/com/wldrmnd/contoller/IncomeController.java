package com.wldrmnd.contoller;

import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.budget.Balance;
import com.wldrmnd.util.Calculator;
import com.wldrmnd.repo.AccountRepo;

public class IncomeController {
    private AccountRepo accounts;
    
    public IncomeController(){
        accounts = new AccountRepo();
    }
    public int showAllMoney() {
        Account account = accounts.getAll().get(1);
        return (int) account.getTotalAmout();
    }
}
