package com.FullEx;

public class CharacterPosition {
    public static void main(String[] args) {
        String str="EBRAINTECHNOLOGY";
        System.out.println("original String="+str);

        int index1=str.charAt(0);
        int index2=str.charAt(8);

        System.out.println("the character at position 0 is "+(char)index1);
        System.out.println("the character at position 8 is "+(char)index2);
    }
}
