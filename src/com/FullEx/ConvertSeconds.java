package com.FullEx;
import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner time=new Scanner(System.in);
        System.out.println("Enter the seconds");
        int Seconds= time.nextInt();

        int a=Seconds%60;
        int b=Seconds/60;
        int c=b%60;
        b=b/60;

        System.out.println(b+":"+c+":"+a);


    }
}
