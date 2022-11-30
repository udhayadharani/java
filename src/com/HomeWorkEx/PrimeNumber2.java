package com.HomeWorkEx;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int n = 21;
        int number = 1;
        int i;
        int count = 0;
        while (count < n) {
            number++;
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    break;
                }
            }
            if (i == number) {
                count++;

            }
        }
        System.out.println(number);
    }

}