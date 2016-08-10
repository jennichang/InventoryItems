package com.theironyard.charlotte;

/**
 * Created by jenniferchang on 8/9/16.
 */
public class Inventory {

        public  String name;
        public  int quantity;
        public  String category;

    public Inventory(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Inventory createItem(String name, int quantity, String category) throws Exception {

        if (category.equals("Kitchenware")) {
            return new Kitchenware(name, quantity);
        } else if (category.equals("Electronics")) {
            return new Electronics(name, quantity);
        } else if (category.equals("Food")) {
            return new Food(name, quantity);
        } else if (category.equals("Furniture")) {
            return new Furniture(name, quantity);
        } else if (category.equals("Clothing")) {
            return new Clothing(name, quantity);
        } else throw new Exception("This is not a valid category.");

    }



    @Override
    public String toString() {
        return "[" + this.quantity + "] " + this.name + " Category: " + this.category;
    }


//    public void itemDescrip() {
//        System.out.println("All");
//    }

}







