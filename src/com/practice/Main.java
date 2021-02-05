package com.practice;

import java.util.Scanner;

public class Main {
    //        important to make them in the class field because if one put in the psvm, it will be restricted to that method
//    static allows to use in the static main method
    private static Scanner customerDecision = new Scanner(System.in);
    static GroceryApp customer = new GroceryApp();

    static public void greeting() {
        System.out.println("Hello customer of Biedronka!");
        System.out.print("Your shooping list is empty now. ");
    }

    static public void print() {
        customer.printItem();
    }

    static public void update() {
        System.out.println("Enter the product index:");

        int index = customerDecision.nextInt();
        customerDecision.nextLine();

        System.out.println("Enter the product name:");
        String name = customerDecision.nextLine();

        customer.updateItem(index - 1, name); //since a listArray is zero based
    }

    static public void add() {
        System.out.println("Enter the product name:");

        String name = customerDecision.nextLine();
        customer.addItem(name);
    }

    static public void remove() {
        System.out.println("Enter the product index:");

        int index = customerDecision.nextInt();
        customer.removeItem(index - 1); //since a listArray is zero based
    }

    static public void find() {
        System.out.println("Enter the product name:");

        String name = customerDecision.nextLine();
        customer.findItem(name);
    }

    static public void menu() {
        System.out.println("\nPress any of the following keys in order to manage your items:");
        System.out.println("0 -- to review this menu");

        System.out.println("1 -- to print");
        System.out.println("2 -- to update");
        System.out.println("3 -- to add");
        System.out.println("4 -- to remove");
        System.out.println("5 -- to find");

        System.out.println("6 -- to quit");
    }

    public static void main(String[] args) {
        greeting();

        int choice;
        boolean quit = false;
        while(!quit) {
            menu();
            choice = customerDecision.nextInt();
            customerDecision.nextLine(); //handling "Enter" key
            switch(choice) {
                case 0:
                    menu();
                    break;
                case 1:
                    print();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select the number from a range 1 - 6");
            }
        }


    }
}