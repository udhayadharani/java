package com.FullEx;

public class RemoveCharacter {
    public static void main(String[] args) {
        String name="UDHAYADHARANI";
        System.out.println(removeCharAt(name,7));
    }
    public static String removeCharAt(String s,int position){

        return s.substring(0,position)+s.substring(position+1);
    }
}
