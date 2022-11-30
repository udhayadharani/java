package com.FullEx;

import java.util.Scanner;

public class CountAllVowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string:");
        String str = sc.nextLine();
        System.out.println("Number of vowels in the string:" + CountAllVowelsInString(str));
    }

    public static int CountAllVowelsInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
            }
            return count;
        }
    }
