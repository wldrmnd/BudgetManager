package com.wldrmnd.contoller;

import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.User;
import com.wldrmnd.entity.budget.CreditCard;
import com.wldrmnd.service.AccountService;
import com.wldrmnd.service.AuthorizationService;

import java.util.List;

public class AccountController {

    private AccountService accountService;
    private AuthorizationService authorizationService;

    public AccountController() {
        accountService = new AccountService();
        authorizationService = new AuthorizationService();
    }

    public boolean signUp(Account accountFromMenu) {
        return authorizationService.signUp(accountFromMenu);
    }

    public boolean signIn(Account accontFromMenu) {

        return authorizationService.signIn(accontFromMenu);
    }

    public boolean setAccountName(User userCredentialsFromMenu, String name) {
        return accountService.setName(userCredentialsFromMenu, name);
    }

    public boolean setAccountSurname(User userCredentialsFromMenu, String surname) {
        return accountService.setSurname(userCredentialsFromMenu, surname);
    }

    public boolean setAccountCreditCard(User userCredentialsFromMenu, CreditCard card) {
        return accountService.addCreditCard(userCredentialsFromMenu, card);
    }

    public List<Account> getAll() {
        return accountService.getAll();
    }
}
