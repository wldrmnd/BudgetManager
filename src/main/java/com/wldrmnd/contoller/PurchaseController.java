package com.wldrmnd.contoller;

import com.wldrmnd.entity.purchase.Purchase;
import com.wldrmnd.repo.PurchaseRepo;

import java.util.ArrayList;

public class PurchaseController {
    private PurchaseRepo repo;

    public PurchaseController(){
        repo = new PurchaseRepo();
    }

    public void add(Purchase inputParchase) {
        repo.add(inputParchase);
    }

    public ArrayList<Purchase> getAll() {
        return repo.getAll();
    }
}
