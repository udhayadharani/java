package com.FullEx;

public class PrimeNumber {
    public static void main(String[] args) {
        int count;
        System.out.println("the hundreds of prime numbers:");
        for (int i = 2; i <= 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(i + " ");
            }
        }

    }
}