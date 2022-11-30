package com.FullEx;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int units=300;
        int billPay;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the units");
        int u =input.nextInt();


        if(units<=100){
            billPay =units*5;
            System.out.println("billAmount="+billPay);
        } else if (units>=101&&units<=200) {
            billPay=100*5+(units-100)*7;
            System.out.println("billAmount="+billPay);

        } else if (units>=201&&units<=300) {
            billPay=100*5+200*7+(units-200)*10;
            System.out.println("billAmount="+billPay);


        }

    }
    }
