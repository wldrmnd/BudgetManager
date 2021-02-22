package com.wldrmnd.service;

import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.User;

public class AccontVerification {
    public static boolean getAccont(Account account) {
        if (account.getLogin() != null && account.getPassword() != null &&
                account.getSurname() != null && account.getName() != null){
            return true;
        }
        return false;
    }
}
