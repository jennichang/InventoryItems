package com.theironyard.charlotte;

/**
 * Created by jenniferchang on 8/9/16.
 */
public class Clothing extends Inventory {


    public Clothing(String name, int quantity) {
        super(name, quantity);
        this.category = "Clothing";
    }

    @Override
    public void itemDescrip() {
        System.out.println("Things you wear");
    }

}