package com.FullEx;

import java.util.Scanner;

public class SurfaceAreaCuboid {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the length of cuboid");
        double l= obj.nextDouble();

        System.out.println("enter the breadth of cuboid");
        double b= obj.nextDouble();

        System.out.println("enter the height of cuboid");
        double h= obj.nextDouble();

        double area=(2*((l*b)+(b*h)+(h*l)));
        System.out.println("total surface area of cuboid is:"+area);
    }
}
