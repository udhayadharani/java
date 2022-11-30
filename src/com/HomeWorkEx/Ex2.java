package com.HomeWorkEx;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a= input.nextInt();
        System.out.println("enter 2nd number:");
        int b= input.nextInt();
        System.out.println("enter 3rd number:");
        int c= input.nextInt();

        if(a>b&&a>c) {
            System.out.println("a is greater than b ");
        }
            else if(b>a&&b>c){
            System.out.println("b is greater than c");
        }
                else if(c>a&&c>b){
                    System.out.println("c is greater than a");
                }
            }
        }

