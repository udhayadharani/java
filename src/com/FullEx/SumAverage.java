package com.FullEx;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int sum=0,num1,num2,num3,num4,num5;
        double avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number:");
         num1 = sc.nextInt();

        System.out.println("enter 2nd number:");
         num2 = sc.nextInt();

        System.out.println("enter 3rd number:");
         num3 = sc.nextInt();

        System.out.println("enter 4th number:");
        num4 = sc.nextInt();

        System.out.println("enter the 5th number");
         num5 = sc.nextInt();

            sum += num1+num2+num3+num4+num5;
            avg = sum / 5;
        System.out.println("The sum of 5 number is :" + sum);
        System.out.println("the average is:" + avg);
    }
}

