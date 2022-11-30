package com.FullEx;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the radius ");
        double radius=s.nextDouble();

        System.out.println("enter the height");
        double height=s.nextDouble();

        double volume=((22*radius*radius*height)/7);
        System.out.println("volume of cylinder is:"+volume);

    }
        }
