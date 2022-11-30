package com.package3;

public class calc {
    private static int a;
    private static int b;


     calc(int a, int b) {
         this.a =a;
         this.b =b;

     }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public static void add(){
        System.out.println(a+b);
    }
    public static void sub(){
        System.out.println(a-b);
    }
    public static void mul() {
        System.out.println(a * b);
    }
    public static void div(){
        System.out.println(a/b);
    }

}

