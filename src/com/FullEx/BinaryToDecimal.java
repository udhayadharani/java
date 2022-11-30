package com.FullEx;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary;
        int decimal;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the binary number");
        binary=s.next();
        decimal=Integer.parseInt(binary,4);
        System.out.println("the equivalent of:"+decimal);

    }
    }

