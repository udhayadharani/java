package com.FullEx;

import java.util.Scanner;

public class ScanProduct {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter two first number");
        int a=p.nextInt();
        System.out.println("Enter the second number");
        int b=p.nextInt();
        System.out.println("product of two numbers is:"+(a*b));

    }
}
