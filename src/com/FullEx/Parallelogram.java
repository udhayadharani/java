package com.FullEx;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the height of the parallelogram:");
        double d1= input.nextDouble();

        System.out.println("enter the breadth of the parallelogram");
        double d2= input.nextDouble();

        double area=(d1*d2);
        System.out.println("area of parallelogram:"+area);



    }
}
