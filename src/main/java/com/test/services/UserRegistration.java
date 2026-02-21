package com.test.services;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first name:");
        String firstName=sc.nextLine();

        String regex="^[A-Z][a-zA-Z]{2,}$";

        if(firstName.matches(regex)){
            System.out.println("valid firstname");
        }else{
            System.out.println("invalid firstname");
        }


        System.out.print("enter last name:");
        String lastName=sc.nextLine();
        String regexLastName="^[A-Z][a-zA-Z]{2,}$";
        if(lastName.matches(regexLastName)){
            System.out.println("valid lastname");
       }else{
         System.out.println("invalid lastname");

        }


        System.out.print("enter the email:");
        String email=sc.next();
        sc.nextLine();
        String regexEmail="^[a-z]+(\\.[a-z]+)?@[a-z]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";
        if (email.matches(regexEmail)) {
            System.out.println("Valid Email ");
        } else {
            System.out.println("Invalid Email");
        }


        System.out.print("enter mobile number:");
        String mobile = sc.nextLine();
        String regexMobile = "^[0-9]{2} [0-9]{10}$";

        if (mobile.matches(regexMobile)) {
            System.out.println("valid mobile number");
        } else {
            System.out.println("invalid mobile number");
        }



        System.out.print("enter the password:");
        String password=sc.nextLine();

        String regexPassword="^(?=(?:[^!@#$%^&*()]*[!@#$%^&*()]){1}[^!@#$%^&*()]*$)(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        if(password.matches(regexPassword)){
            System.out.println("valid password");
        }else{
            System.out.println("invalid password");
        }




    }
}
