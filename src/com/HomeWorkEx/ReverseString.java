package com.HomeWorkEx;


public class ReverseString {
    public static void main(String[] args) {
        String str = ("Black horse went to jogging");

        String str1 = " ";
        String a[] = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = a.length - 1; i >= 0; i--) {
            str1 = str1 + a[i] + " ";
        }
        System.out.println(str1);
             }
    }






