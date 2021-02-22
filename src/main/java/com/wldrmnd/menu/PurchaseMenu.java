package com.wldrmnd.menu;

import com.wldrmnd.contoller.PurchaseController;
import com.wldrmnd.entity.Account;
import com.wldrmnd.entity.purchase.Catetegory;
import com.wldrmnd.entity.purchase.Purchase;
import com.wldrmnd.repo.AccountRepo;
import com.wldrmnd.util.AddMoney;
import com.wldrmnd.util.Calculator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PurchaseMenu {

    private Scanner in;
    private PurchaseController purchaseController;
    private AccountRepo accounts;
    private Account account;

    public PurchaseMenu() {

        accounts = new AccountRepo();
        account = accounts.getAll().get(1);
        in = new Scanner(System.in);
        purchaseController = new PurchaseController();
        menu();
    }

    private void printMenu() {
        System.out.println("1. Добавить продукт");
        System.out.println("2. Вывести все продукты");
    }

    private void menu() {
        printMenu();
        int choice = in.nextInt();
        if (choice == 1){
            Purchase purchase = inputParchase();
            purchaseController.add(purchase);
            recalculationOfincome(purchase);
        }
        if (choice == 2){
            printAllPurchase(purchaseController.getAll());
        }
        if (choice == 0){
            new AccountMenu();
        }
        menu();
    }

    private double recalculationOfincome(Purchase purchase) {
        return Calculator.deductionOfExpensesFromIncone(purchase.getPrice(), account);

    }

    private void printAllPurchase(ArrayList<Purchase> all) {
        for (Purchase purchase : all){
            System.out.println(purchase.toString());
        }
    }

    private Purchase inputParchase() {
        Purchase purchase = new Purchase();
        System.out.println("Введите сумму: ");
        purchase.setPrice(AddMoney.addMoney());
        System.out.println("Комментарий: ");
        purchase.setDescription(in.next());
        System.out.println("Категория: ");
        purchase.setCatetegory(new Catetegory(in.next()));
        purchase.setAccount(account);
        purchase.setLocalDate(LocalDate.now());
        account.setTotalAmout(Calculator.deductionOfExpensesFromIncone(purchase.getPrice(), account));
        System.out.println(account.getTotalAmout());
        return purchase;
    }
}

