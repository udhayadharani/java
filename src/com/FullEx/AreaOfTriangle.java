package com.FullEx;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the width of the triangle");
        double b= obj.nextDouble();

        System.out.println("enter the height of the triangle");
        double h= obj.nextDouble();

        double area=(b*h)/2;
        System.out.println("Area of the triangle is:"+area);


    }
}
