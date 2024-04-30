package com.sam.polymorphismAndInheritance;

import java.sql.SQLOutput;
import java.util.Scanner;


public class KidUser implements LibraryUser{
    int age;
    String bookType;

    Scanner sc = new Scanner(System.in);

    @Override
    public void registerAccount() {
        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Book type: ");
        bookType = sc.nextLine();

        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        }
        else if(age>11){
            System.out.println("Sorry, age must be less than 12 to register as a kid.");

    }}

    @Override
    public void requestBook() {
        sc.nextLine();
        System.out.println("Enter your Book Type: ");
        bookType = sc.nextLine();
        if (bookType.equalsIgnoreCase("kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        }
        else if (bookType.equalsIgnoreCase("fiction")) {
            System.out.println("Oops, you are allowed to take only kids books.");
        }

    }
}
