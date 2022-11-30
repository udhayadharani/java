package com.HomeWorkEx;

public class Ex4 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=9;

        if(a>b&&a>c) {
            System.out.println("a is equal to b");
        }

        else if(b>a&&b>c){
                System.out.println("b is equal to c");
            }
        else if (c>a&&c>b) {
            System.out.println("c is equal to a");
        }
        else{
            System.out.println("a,b is greater than c");
    }
    }
}
