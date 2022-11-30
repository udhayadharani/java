package com.FullEx;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the radius of sphere");
        double radius=s.nextDouble();

        double volume=(4*22*radius*radius*radius)/(3*7);
        System.out.println("Volume of Sphere is:"+volume);
    }
}
