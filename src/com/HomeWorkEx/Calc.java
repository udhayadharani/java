package com.HomeWorkEx;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 1;

        System.out.println(" enter a variable 'a'.");
        double num1 = in.nextDouble();
        System.out.println("variable a = " + num1);

        System.out.println(" enter a variable 'b'.");
        double num2 = in.nextDouble();
        System.out.println("variable b = " + num2);

        System.out.println("operation to perform. e.g.: +, -, *, /, ^.");
        char o = in.next().charAt(0);
        System.out.println("operator = " + o);

        System.out.print("Result : " + num1 + o + num2 + "= ");


        if (o == '+') {
            System.out.print(num1 + num2);
        } else if (o == '-') {
            System.out.print(num1 - num2);
        } else if (o == '*') {
            System.out.print(num1 * num2);
        } else if (o == '/') {
            System.out.print(num1 / num2);
        }
        }

    }
