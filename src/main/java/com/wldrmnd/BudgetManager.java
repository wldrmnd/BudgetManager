package com.wldrmnd;

import com.wldrmnd.menu.AccountMenu;

//1. оптимизировать импорты
//2. добавить чекеры
//3. продумать интерфейс взаимодействия (какие классы нужны, какие методы, что кого содержит?)
//4. почитать про сериализацию (посмотреть урок по stream api из java 1.8 https://javarush.ru/groups/posts/2203-stream-api)
//5 (опционально). создать возможность добавления аккаунта в репозиторий

public class BudgetManager {
    public static void main(String[] args) {
        System.out.println("budget manager");
        new AccountMenu();
    }
}
