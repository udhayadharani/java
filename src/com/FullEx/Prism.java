package com.FullEx;

import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the area of the base");
        double base=scan.nextDouble();

        System.out.println("enter the height");
        double height= scan.nextDouble();

        double area=base*height;
        System.out.println("volume of prism is"+area);



    }

}
