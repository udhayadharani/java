package com.FullEx;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b= sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c= sc.nextInt();

        if(a>b)
            if(a>c)
                System.out.println("The greatest="+a);


        if(b>a)
            if(b>c)
                System.out.println("The greatest="+b);


        if(c>a)
            if (c>b)
                System.out.println("the greatest="+c);
    }

}
