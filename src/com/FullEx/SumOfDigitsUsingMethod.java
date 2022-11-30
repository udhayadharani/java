package com.FullEx;

public class SumOfDigitsUsingMethod {
    public static void main(String[] args) {
        int num=345678;
        System.out.println(" The Sum Of Digits:"+findSum(num) );
    }
    static int findSum(int num){
        int sum=0;
        while (num!=0){
            sum=sum+num%10;
            num=num/10;

        }
        return sum;
    }
}
