package com.FullEx;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numberOfDaysInMonth=0;
        String monthName="unknown";

        System.out.println("Input a month number:");
        int  month=sc.nextInt();

        System.out.println("Input a year:");
        int year=sc.nextInt();


        switch(month) {
            case 1:
                monthName = "January";
                numberOfDaysInMonth = 31;
                break;

            case 2:
                monthName = "February";
                numberOfDaysInMonth = 29;
                break;

            case 3:
                monthName = "March";
                numberOfDaysInMonth = 31;
                break;

            case 4:
                monthName = "April";
                numberOfDaysInMonth = 30;
                break;

            case 5:
                monthName = "May";
                numberOfDaysInMonth = 31;

        }
                System.out.println(monthName +" "+ year +" has "+numberOfDaysInMonth + "days");

    }
}
