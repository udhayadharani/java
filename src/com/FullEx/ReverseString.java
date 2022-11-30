package com.FullEx;

public class ReverseString {
    public static void main(String[] args) {
        String name="UDHAYADHARANI";
        String reverse=new StringBuffer(name).reverse().toString();
        System.out.println("String before reverse:"+name);
        System.out.println("String after reverse:"+reverse);
    }
}

