package com.FullEx;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 1st number:");
        double num1= sc.nextDouble();
        System.out.println("input 2nd number:");
        double num2= sc.nextDouble();
        System.out.println("input 3rd number:");
        double num3= sc.nextDouble();

        if(num1<num2 && num2>num3) {
            System.out.println("Numbers are in increasing order");
        }
        else if (num1>num2 && num2>num3) {
            System.out.println("Numbers are in decreasing order");
        }
        else{
            System.out.println("Neither increasing or decreasing order");

        }
    }

    }

