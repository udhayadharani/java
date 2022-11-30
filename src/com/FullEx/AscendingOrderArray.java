package com.FullEx;

import java.util.Scanner;

public class AscendingOrderArray {
    public static void main(String[] args) {
        int number, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of  elements:");
        number = s.nextInt();
        int a[] = new int[number];
        System.out.println("enter all elements");
        for (int i = 0; i < number; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<number;i++){
            for (int j = i + 1; j < number; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
        }
        System.out.println("Ascending order:");
        for (int i=0;i<number-1;i++){
            System.out.println(a[i]+",");
        }
        System.out.println(a[number-1]);
    }
    }