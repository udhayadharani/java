package com.HomeWorkEx;

public class PrimeNumber500 {
    public static void main(String[] args) {
        int count;
        System.out.println("The five hundred of prime numbers:");
        for (int i = 2; i <= 500; i++) {
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
