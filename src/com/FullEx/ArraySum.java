package com.FullEx;

public class
ArraySum {
    public static void main(String[] args) {
        int myArray[] = {10, 20, 30, 40, 50, 65, 74, 85, 92, 100};
        int sum = 0;

        for (int i : myArray) {
            sum += i;
        }
            System.out.println("The sum is above array is:" + sum);
        }
    }
