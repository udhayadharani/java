package com.HomeWorkEx;

import java.util.Scanner;

public class DayYear {
    public static void main(String[] args) {
        Scanner myDay = new Scanner(System.in);
        int a;
        System.out.println("Enter dayNo");
        int A = myDay.nextInt();
        a = A % 7;

        switch (a) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
            case 0:
                System.out.println("sunday");
                break;
        }


    }
}
