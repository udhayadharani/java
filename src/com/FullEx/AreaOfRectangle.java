package com.FullEx;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the length");
        double l= input.nextDouble();

        System.out.println("enter the breadth");
        double b= input.nextDouble();

        double area=l*b;
        System.out.println("area of the rectangle:"+area);

    }
}
