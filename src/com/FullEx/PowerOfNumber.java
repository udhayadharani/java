package com.FullEx;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base=8;
        int exponent=3;
        long result=1;
        while(exponent!=0){
            result*=base;
            --exponent;
        }
        System.out.println("Answer="+result);
    }
}
