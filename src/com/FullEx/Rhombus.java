package com.FullEx;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the diagonal1:");
        double d1= obj.nextDouble();

        System.out.println("enter the diagonal2:");
        double d2= obj.nextDouble();

        double area=(d1*d2)/2;
        System.out.println("area of the rhombus:"+area);


    }
}
