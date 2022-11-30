package com.FullEx;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the side of  cube");
        double side= scan.nextDouble();

        double r=4*side*side;
        System.out.println("curved surface area of cube is:"+r);

    }
}
