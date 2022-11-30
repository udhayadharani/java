package com.FullEx;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double amount=0;
        double principal,rate,time,ci;
        Scanner  input=new Scanner(System.in);
        System.out.println("enter the principal amount");
        principal=input.nextDouble();
        System.out.println("enter rate of interest");
        rate=input.nextDouble();
        System.out.println("enter the time");
        time=input.nextDouble();

        ci=principal*Math.pow((1+rate/100),time);
        System.out.println("compound interest:"+ci);
        }
    }    //(p*(1+r/n)^(nt)=compound interest


