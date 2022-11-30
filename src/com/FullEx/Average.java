package com.FullEx;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the first number a" );
        int a=obj.nextInt();
        System.out.println("Enter the second number b");
        int b=obj.nextInt();
        System.out.println("Enter the third number c");
        int c=obj.nextInt();
        System.out.println("Enter the fourth number d");
        int d=  obj.nextInt();
        System.out.println("Enter the fifth number e");
        int e=obj.nextInt();
        System.out.println("average number is:"+(a+b+c+d+e/5));


    }
}
