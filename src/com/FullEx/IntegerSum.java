package com.FullEx;
import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer");
        long n = s.nextLong();
        System.out.println("the sum of the digits is:" + sumDigits (n));
    }
        public static int sumDigits (long num){
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }



