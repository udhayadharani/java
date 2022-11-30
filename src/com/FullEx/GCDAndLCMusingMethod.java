package com.FullEx;
import java.util.Scanner;
public class GCDAndLCMusingMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  two numbers:");
        int num1= input.nextInt();
        int num2=input.nextInt();
        System.out.println("The gcd of two numbers:"+gcd(num1,num2));
        System.out.println("The lcm of two numbers:"+lcm(num1,num2));
    }
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static int lcm(int a,int b) {
        return a*b/(gcd(a,b));
    }
}

