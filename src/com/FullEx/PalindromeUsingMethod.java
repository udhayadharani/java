package com.FullEx;
import java.util.Scanner;
public class PalindromeUsingMethod {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any number: ");
        num = console.nextInt();

        if(isPalindrome(num)) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int temp = number;
        int remainder;
        int reverse = 0;

        while(temp > 0) {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse == number;
    }
}



