package com.wldrmnd.repo;


import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepo {

    private static final String SERIALIZED_FILE = "accounts.dat";
    private List<Account> accounts;

    public AccountRepo() {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream(SERIALIZED_FILE))) {
            accounts = (List<Account>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            accounts = new ArrayList<>();
            accounts.add(new Account(new User("woldermind", "123")));
        }
    }

    public boolean isExists(Account account) {
        return accounts.contains(accounts);
    }

    public List<Account> getAll() {
        return accounts;
    }

    public void add(Account account) {
        this.accounts.add(account);
        serializeData();
    }

    public void remove(Account removedAccount) {
        this.accounts.remove(removedAccount);
        serializeData();
    }

    private void serializeData() {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream(SERIALIZED_FILE))) {
            outputStream.writeObject(accounts);
        } catch (IOException e) {
            System.out.println("сори чел создай сначала файл");
            e.printStackTrace();
        }
    }
}
