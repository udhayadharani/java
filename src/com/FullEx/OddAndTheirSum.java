package com.FullEx;

import java.util.Scanner;

public class OddAndTheirSum {
    public static void main(String[] args) {
        int i,n,sum=0;
        System.out.println("enter the number of terms:" );
        Scanner input=new Scanner(System.in);
        n=input.nextInt();

        System.out.println("the odd numbers are");
        for(i=1;i<=n;i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
            System.out.println("The sum of odd natural number: "+sum);
        }



    }
}
