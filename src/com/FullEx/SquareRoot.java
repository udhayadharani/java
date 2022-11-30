package com.FullEx;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("value of squareRoot is:");
        int number=input.nextInt();
        double squareRoot=Math.pow(number,0.5);
        System.out.println("the square root of given number:"+number+"="+squareRoot);
    }
}
