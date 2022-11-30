package com.HomeWorkEx.package4;

public class Result2 {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int result=calc.add(23,56);
        System.out.println(result);
        int result1=calc.sub(12,34);
        System.out.println(result1);
        int result2=calc.mul(5,8);
        System.out.println(result2);
        int result3=calc.div(55,5);
        System.out.println(result3);
    }
}
