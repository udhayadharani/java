package com.FullEx;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the length");
        double l= input.nextDouble();

        System.out.println("enter the breadth");
        double b= input.nextDouble();

        System.out.println("enter the height");
        double h= input.nextDouble();

        double volume=l*b*h;
        System.out.println("volume of cuboid is:"+volume);
    }
}
