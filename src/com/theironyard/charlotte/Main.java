package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Inventory> items = new ArrayList<>(); // USE CREATE ITEM TO FILL ARRAY LIST



    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // local variables

        while(true) { // infinite while loop

            System.out.println("Options:");
            System.out.println("1. Current inventory");
            System.out.println("2. Create a new item");
            System.out.println("3. Remove an item");
            System.out.println("4. Update an item's quantity"); //

            String option = scanner.nextLine();

            if (option.equals("1")) {
                for (int i = 0;i < items.size();i++) {
                    Inventory currentItem = items.get(i); // listing index next to items, got it

                    System.out.printf("%d. %s\n",
                            i, currentItem);
                }

            } else if (option.equals("2")) {

                System.out.println("What is the name of your item?");
                String name = scanner.nextLine();

                System.out.println("What is the quantity of your item?");
                int quantity = scanner.nextInt();

                scanner.nextLine(); //why do i keep needing this?...because i'm using nextInt...just use Integer.valueOf

                System.out.println("What is the category of your item?");
                String category = scanner.nextLine();
//                try {
//                    items.add(Inventory.createItem(name, quantity, category));
//                } catch (Exception e) {
//                    System.out.println("Invalid" + e.getMessage());
//                }

                items.add(Inventory.createItem(name, quantity, category)); // add created item to array list



            } else if (option.equals("3")) {
                System.out.println("What item would you like to remove?");
                String itemRemove = scanner.nextLine();
                for (int i=0; i<items.size(); i++) {
                    if (items.get(i).name.equals(itemRemove)) {
                        items.remove(i);
                        break; //gets index of the item and removes it from arraylist if the name equals their input
                    }
                }

            } else if (option.equals("4")) {


                System.out.println("What item quantity would you like to update?");
                int itemUpdate = Integer.valueOf(scanner.nextLine());

                System.out.println("What is the new quantity?");
                int quantUpdate = Integer.valueOf(scanner.nextLine());

                Inventory change = items.get(itemUpdate);
                change.setQuantity(quantUpdate);



            } else {
                System.out.println("invalid option");
            }

            //System.out.println(items);



        }

    }





}











