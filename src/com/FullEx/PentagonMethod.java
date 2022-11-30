package com.FullEx;
import java.util.Scanner;
public class PentagonMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Input the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + pentagonarea(n, side));
    }

    public static double pentagonarea(int n, double s) {
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
    }

