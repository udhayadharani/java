package com.FullEx;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius,area;
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the radius of the circle");
        radius=obj.nextDouble();

        area=Math.PI*radius*radius;   //areaOfCircle=PIr`2
        System.out.println("area of the circle is:"+area);

    }
}
