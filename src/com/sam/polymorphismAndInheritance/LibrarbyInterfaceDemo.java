package com.sam.polymorphismAndInheritance;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibrarbyInterfaceDemo {

    public static void main(String[] args) {
        KidUser kidUserObj=new KidUser();
        kidUserObj.registerAccount();
        kidUserObj.requestBook();
        AdultUser adultUser=new AdultUser();
        adultUser.registerAccount();
        adultUser.requestBook();
        }
    }
