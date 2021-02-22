package com.wldrmnd.repo;

import com.wldrmnd.entity.purchase.Purchase;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRepo {
    private List<Purchase> purchases;

    public PurchaseRepo(){
        purchases = new ArrayList<Purchase>();
    }

    public void add(Purchase purchase){
        this.purchases.add(purchase);
    }

    public ArrayList<Purchase> getAll() {
        return (ArrayList<Purchase>) purchases;
    }
}
