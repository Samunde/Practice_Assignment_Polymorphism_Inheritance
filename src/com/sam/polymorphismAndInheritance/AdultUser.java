package com.sam.polymorphismAndInheritance;

import java.util.Scanner;

public class AdultUser implements LibraryUser{
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
        if (age >= 12) {
            System.out.println("You have successfully registered under Adults Account");
        }
        else if(age<=11){
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }}

    @Override
    public void requestBook() {
        System.out.println("Enter your Book Type: ");
        bookType = sc.nextLine();
        if (bookType.equalsIgnoreCase("fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else if (bookType.equalsIgnoreCase("kids")) {
            System.out.println("“Oops, you are allowed to take only adult Fiction books");
        }

    }}
