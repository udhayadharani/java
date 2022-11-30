package com.FullEx;

import java.util.Scanner;

public class DisplayMulInteger {
    public static void main(String[] args) {
        int j,num;
        System.out.println("enter the number of terms:");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();

        for(j=0;j<=num;j++){
            System.out.println(num+"x"+j+"="+num*j);
        }
    }
}
