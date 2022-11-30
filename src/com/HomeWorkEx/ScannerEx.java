package com.HomeWorkEx;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);

        System.out.println("Enter the first number a ");
        int a=num.nextInt();

        System.out.println("Enter the second number b");
        int b=num.nextInt();

        //Addition
        int c=a+b;
        System.out.println("add:"+c);
        //Subtraction
        int d=a-b;
        System.out.println("sub:"+d);
        //Multiplication
        int e=a*b;
        System.out.println("mul:"+e);
        //Division
        int g=a/b;
        System.out.println("division:"+g);
        //Modulus
        int h=a%b;
        System.out.println("modulus:"+h);
        //Quotient
        float i=a/b;
        System.out.println("quotient:"+i);
        //reminder
        int k=a%b;
        System.out.println("reminder:"+k);




    }
}
