package com.wldrmnd.menu;

import com.wldrmnd.contoller.IncomeController;

import java.util.Scanner;

public class IncomeMenu {
    private IncomeController incomeController;
    private Scanner in;

    public IncomeMenu(){
        incomeController = new IncomeController();
        in = new Scanner(System.in);
        menu();
    }

    private void menu() {
        printMenu();
        int choice = in.nextInt();
        if (choice == 1){
            System.out.println(incomeController.showAllMoney());
        }
    }

    private void printMenu() {
        System.out.println("1) Показать баланс.");
        System.out.println("2) Деньги с карты.");
        System.out.println("3) Наличка.");
    }
}
