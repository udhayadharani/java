package com.HomeWorkEx;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        //widening
        int a=33;
        double b=65.75d;
        a=(int)b;
        System.out.println(a);

        float c=45.6f;
        double d=78.6768d;
        c=(float) d;
        System.out.println(c);

        int e=68;
        float f=56.8f;
        e=(int)f;
        System.out.println(e);

        //Narrowing
        double g=34.6576d;
        float h=34.6f;
        g=(double)h;
        System.out.println(g);

        float i=76.6f;
        int j=67;
        i=(float)j;
        System.out.println(i);

        double k=54.657676d;
        int l=87;
        k=(double)l;
        System.out.println(k);

        }

    public static class Calcy {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the 1st number:");
            int a = input.nextInt();
            System.out.println("enter the 2nd number:");
            int b = input.nextInt();
            System.out.println("enter operator:");
             int operator = input.next().charAt(0);


            if (operator == '+') {
                System.out.println("The result is" +add(a,b,operator));
            }
            if (operator == '-') {
                System.out.println("the result is " +sub(a,b,operator));

            }
            if (operator == '*') {
                System.out.println("the result is"+mul(a,b,operator));

            }
            if (operator == '/') {
                System.out.println("the result is" +div(a,b,operator));
            }
        }
            static  int add(int a,int b,int operator){
                int c = (a + b);
                return a+b;
            }
            static int sub(int a,int b,int operator){
                int c = (a - b);
                return a-b;
            }
            static int mul(int a,int b,int operator){
                int c = (a * b);
                return a*b;
            }
            static int div(int a,int b,int operator){
                int c=(a/b);
                return a/b;
            }
        }
}


