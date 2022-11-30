package com.HomeWorkEx;

import java.util.Scanner;

public class CharacterPosition {
    public static void main(String[] args) {
        String a = ("jack and jill went up the hill comeback in the evening");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the char is");
        char[] s = a.toCharArray();
        char character = input.next().charAt(0);


        for (int i = 0; i < s.length; i++) {
            if (s[i] == character) {
                System.out.println(i);
            }
        }

    }
}