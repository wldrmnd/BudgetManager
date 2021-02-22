package com.wldrmnd.service;

import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.User;
import com.wldrmnd.repo.AccountRepo;

public class AuthorizationService {

    private AccountRepo repo = new AccountRepo();

    public boolean signIn(Account account) {
        for (Account accountToSignIn : repo.getAll()) {
            if (account.getLogin().equals(accountToSignIn.getLogin()) &&
                account.getPassword().equals(accountToSignIn.getPassword())) {
                System.out.println("Всё круто");
                return true;
            }
        }
        return false;
    }

    public boolean signUp(Account accountFromMenu) {
        if(AccontVerification.getAccont(accountFromMenu)) {
            repo.add(accountFromMenu);
            return true;
        }
        return false;
    }
}
