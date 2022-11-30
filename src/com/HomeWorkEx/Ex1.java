package com.HomeWorkEx;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter number 1:");
        int gender1= input.nextInt();
        System.out.println("enter number 2:");
        int gender2= input.nextInt();



        if(gender1==0) {
            System.out.println("I m a boy");
        }
            else if(gender2==1){
                System.out.println("I m a girl");
            }
            else{
            System.out.println("Invalid gender");
        }
        }
    }

