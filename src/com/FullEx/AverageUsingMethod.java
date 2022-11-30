package com.FullEx;

import java.util.Scanner;

public class AverageUsingMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a=scan.nextDouble();
        System.out.println("Enter the second number:");
        double b=scan.nextDouble();
        System.out.println("Enter the third number:");
        double c= scan.nextDouble();
        System.out.println("Average is"+average(a,b,c));


    }
    public static double average(double a,double b,double c){
        return a+b+c/3;
    }
}
