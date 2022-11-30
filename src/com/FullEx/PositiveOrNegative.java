package com.FullEx;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the input number");
        int num= input.nextInt();

        if(num>0) {
            System.out.println("The number is positive");
        }
            else if(num<0){
            System.out.println("The number is negative");
            }
            else {
            System.out.println("Number is zero");
        }

        }
    }

