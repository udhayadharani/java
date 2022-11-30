package com.HomeWorkEx;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeNumber;
        int position;
        int[] array={1,2,3,5,7,11,15,17,19,23,29,31};

        System.out.print("Enter the prime number ");
        primeNumber = input.nextInt();
        System.out.println("Enter the position");
        position = input.nextInt();


        for (int i = 0; i < array.length; i++) {
            if (primeNumber == array[i]) {
                if (position == i) {
                    System.out.println("yes");

                } else {
                    System.out.println("no");
                }

            }
        }
    }
}



