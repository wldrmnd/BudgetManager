package com.wldrmnd.menu;

import com.wldrmnd.contoller.AccountController;
import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.User;
import com.wldrmnd.entity.budget.Balance;
import com.wldrmnd.entity.budget.CreditCard;

import java.util.List;
import java.util.Scanner;

public class AccountMenu {

    private Scanner in;
    private AccountController controller;

    public AccountMenu() {
        in = new Scanner(System.in);
        controller = new AccountController();
        menu();
    }

    private void menu() {
        printMenu();
        int choice = in.nextInt();
        if (choice == 1) {
            User userCredentials = inputCredentials();
            CreditCard creditCardFromConsole = new CreditCard();
            controller.setAccountCreditCard(userCredentials, creditCardFromConsole);
            System.out.println(controller.getAll());
        }
        if (choice == 2){
            printAuthorizationMenu();
            int choiceLog = in.nextInt();
            if (choiceLog == 1){
//                Account account = createAccount();
                if(controller.signUp(createAccount())){
                    System.out.println("Регистрация прошла успешно");
                }
                System.out.println("Повторите попытку");
            }
            if (choiceLog == 2){
                controller.signIn(accountFromConsole());
            }
        }
        if (choice == 3){
            printAllAccount(controller.getAll());
        }
        menu();
    }

    private Account accountFromConsole() {
        Account account = new Account();
        account.setLogin(in.next());
        account.setPassword(in.next());
        return account;
    }


    private void printAllAccount(List<Account> all) {
        for(Account account : all){
            System.out.println(account.toString());
        }
    }

    private Account createAccount() {
        Account account = new Account();
        System.out.println("Придумайте логин");
        account.setLogin(in.next());
        System.out.println("Придумайте пароль");
        account.setPassword(in.next());
        System.out.println("Введите ваше имя");
        account.setName(in.next());
        System.out.println("Введите вашу фамилию");
        account.setSurname(in.next());
        account.setBalance(new Balance());
        return account;
    }

    private User inputCredentials() {
        User userFromConsole = new User();
        System.out.println("Введи логин:");
        userFromConsole.setLogin(in.next());
        System.out.println("Введи пароль:");
        userFromConsole.setPassword(in.next());
        return userFromConsole;
    }

    private void printMenu() {
        System.out.println("Выбери опцию:");
        System.out.println("1) Добавить карту");
        System.out.println("2) Login");
        System.out.println("3) Вывести всех пользователей");
        System.out.println("0) Выйти");
    }
    private void printAuthorizationMenu() {
        System.out.println("Ты опять попал в хуевый банк:)");
        System.out.println("1) Зарегистрироваться");
        System.out.println("2) Войти");
    }


}
