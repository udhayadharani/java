package com.HomeWorkEx;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter dayName:");
        String days = input.nextLine();

        switch (days) {
            case "Monday":
                System.out.println(1);
                break;

            case "Tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case"Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case"Sunday" :
                System.out.println(7);

        }
    }
}