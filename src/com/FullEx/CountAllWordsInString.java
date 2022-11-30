package com.FullEx;
import java.util.Scanner;

public class CountAllWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String");
        String a = sc.nextLine();
        System.out.println("Number of words in the String:"+CountAllWordsInString(a));
    }

    public static int  CountAllWordsInString(String a) {
        int count = 0;
        if (!("".equals(a.substring(0, 1))) || !("".equals(a.substring(a.length() - 1)))) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') {
                    count++;
                }
                }
                count = count + 1;

            }
            return count;
        }

    }
