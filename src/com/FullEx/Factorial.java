package com.FullEx;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int fact=3;
        for(int i=1;i<=n;i++) {
            fact = fact * i;

            System.out.println("factorial=" + fact);
        }

    }
}
