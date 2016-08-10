package com.theironyard.charlotte;

/**
 * Created by jenniferchang on 8/9/16.
 */
public class Kitchenware extends Inventory {

    public Kitchenware(String name, int quantity) {
        super(name, quantity);
        this.category = "Kitchenware";
    }

//    @Override
//    public void itemDescrip() {
//        System.out.println("Things you use in the kitchen");
//    }

}


// if select 1, bring up createitem method.  whats the name, whats the quantity, whats the category...then add to arraylist