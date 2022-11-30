package com.FullEx;

import java.util.Scanner;

public class SurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the radius");
        double radius= obj.nextDouble();

        System.out.println("enter the height");
        double height= obj.nextDouble();

        double tsa=((2*22*radius)/7)*(radius+height);
        System.out.println("total surface area of cylinder is:"+tsa);
    }


}
