package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {
    ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String name) {
        groceryList.add(name);
    }

    public void printItem() {
        System.out.println("Currently your list is composed of ");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i)); //num is like groceryList.get(num)
        }
        if(groceryList.size() == 0) {
            System.out.println("List is empty");
        }
    }

    public void updateItem(int index, String name) {
        groceryList.set(index, name);
    }

    public void removeItem(int index) {
        groceryList.remove(index);
    }

    public void findItem(String name) {
        int result = groceryList.indexOf(name);
        if(result >= 0) {
            System.out.println("The item " + name + " is present in the list");
        } else
            System.out.println("no such item in the list :(");
    }

}
