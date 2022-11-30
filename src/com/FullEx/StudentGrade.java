package com.FullEx;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        float aptitudeScore,cycleTestScore,AnnualScore,avg;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your aptitudeScore");
        aptitudeScore= input.nextFloat();
        System.out.println("Enter your cycleTestScore:");
        cycleTestScore= input.nextFloat();
        System.out.println("Enter youur AnnualScore:");
        AnnualScore= input.nextFloat();

        avg=(aptitudeScore+cycleTestScore+AnnualScore)/3;
        if(avg>=90) {
            System.out.println("Your grade A:");
        }
        else if ((avg>=70)&&(avg<=90)) {
            System.out.println("Your grade B:");
        }
        else if((avg>=50)&&(avg<=70)){
            System.out.println("your grade C:");
        }
        else if (avg<50) {
            System.out.println("Your grade F:");
        }
        else {
            System.out.println("Invalid");
        }

        }

    }

