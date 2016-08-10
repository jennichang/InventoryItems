package com.theironyard.charlotte;

/**
 * Created by jenniferchang on 8/9/16.
 */
public class Electronics extends Inventory {


    public Electronics(String name, int quantity) {
        super(name, quantity);
        this.category = "Electronics";
    }

//    @Override
//    public void itemDescrip() {
//        System.out.println("Things that have power");
//    }

}
