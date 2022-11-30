package com.FullEx;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number to check:");
        Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();

        int original=number;
        int check=0;
        int temp=0;

        while (number>0){
            temp=number%10;
            check=(check*10)+temp;
            number=number/10;
        }
        if(original==check) {
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is not a palindrome");
        }


    }

}
