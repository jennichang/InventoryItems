package com.theironyard.charlotte;

/**
 * Created by jenniferchang on 8/9/16.
 */
public class Food extends Inventory {


    public Food(String name, int quantity) {
        super(name, quantity);
        this.category = "Food";
    }

//    @Override
//    public void itemDescrip() {
//        System.out.println("Things you eat");
//    }

}