package com.FullEx;

import java.util.Scanner;

public class CheckEqualOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter  1st number: ");
        int num1= sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2= sc.nextInt();

        System.out.println("Enter 3rd number:");
        int num3= sc.nextInt();

         if(num1==num2&& num1==num3){
             System.out.println("All numbers are equal");
         }
         else if ((num1==num2)||(num1==num3)||(num3==num2)) {
             System.out.println("Neither all numbers are equal or different");
         }
         else{
             System.out.println("All numbers are different");
         }


    }
}
