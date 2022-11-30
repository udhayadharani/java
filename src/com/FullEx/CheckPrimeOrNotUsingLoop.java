package com.FullEx;
import java.util.Scanner;
public class CheckPrimeOrNotUsingLoop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.print("Enter the positive integer ");
        number = console.nextInt();

        boolean integer = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                integer = false;
                break;
            }
        }

        if (integer && number > 1) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }
}