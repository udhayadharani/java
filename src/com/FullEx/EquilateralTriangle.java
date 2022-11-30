package com.FullEx;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side of equilateral triangle");
        double a=input.nextDouble();

        double area=(Math.sqrt(3)/4*(a*a));
        System.out.println("area of equilateral triangle:"+area);

    }
}
