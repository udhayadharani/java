package com.FullEx;
import java.util.Scanner;
public class AreaOfTriangleUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Side1: ");
        double side1 = scan.nextDouble();
        System.out.print("Input Side2: ");
        double side2 = scan.nextDouble();
        System.out.print("Input Side3: ");
        double side3 = scan.nextDouble();
        System.out.println("The area of the triangle is " + areaoftriangle(side1, side2, side3));
    }

    public static double areaoftriangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
    }


