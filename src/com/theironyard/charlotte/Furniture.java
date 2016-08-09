package com.theironyard.charlotte;

/**
 * Created by jenniferchang on 8/9/16.
 */
public class Furniture extends Inventory {


    public Furniture(String name, int quantity) {
        super(name, quantity);
        this.category = "Furniture";
    }

    @Override
    public void itemDescrip() {
        System.out.println("Things you do stuff on");
    }

}
