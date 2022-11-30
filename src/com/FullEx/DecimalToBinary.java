package com.FullEx;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the decimal number");
        decimal=obj.nextInt();
        String bin=Integer.toBinaryString(decimal);
        System.out.println("the equialent of:"+bin);
    }
}
