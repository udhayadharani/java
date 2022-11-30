package com.FullEx;

import java.util.Scanner;

public class SmallestnumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        double a= sc.nextDouble();
        System.out.println("Enter 2nd number:");
        double b= sc.nextDouble();
        System.out.println("Enter 3rd number:");
        double c= sc.nextDouble();
        System.out.println("Smallest value is:"+smallestNumber(a,b,c));
    }
    public static double smallestNumber(double a,double b,double c){
        return Math.min(Math.min(a,b),c);
    }

}
