package com.FullEx;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input  number:");
        int day= sc.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("enter the week number bw (1-7)");


        }

    }

    }



