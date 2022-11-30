package com.FullEx;

public class LinesFromString {
    public static void main(String[] args) {
        String name = "Ebrain technologies";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') ;
            count++;
        }
        System.out.println("total number of a character at a string:" + count);

    }
}



