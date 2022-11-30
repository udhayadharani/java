package com.FullEx;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number a");
        int a=obj.nextInt();
        System.out.println("Enter the second number b");
        int b=obj.nextInt();


        System.out.println("add:"+(a+b));
        System.out.println("sub:"+(a-b));
        System.out.println("mul:"+(a*b));
        System.out.println("div:"+(a/b));
        System.out.println("reminder:"+(a%b));

    }
}
