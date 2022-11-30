package com.FullEx;

import java.util.Scanner;

public class MaxiMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter elements in array");
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i <= 4; i++) {
            array[i] = input.nextInt();
            if (array[i] < max) {
                max = array[i];
            }

            if (array[i] > min) {
                min = array[i];
            }
        }

        System.out.println("maximum element is" + min);
        System.out.println("minimum element is" + max);
    }
}
