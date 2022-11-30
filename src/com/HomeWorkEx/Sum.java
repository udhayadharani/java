package com.HomeWorkEx;

public class Sum {
    public static void main(String[] args) {
        int i=200;
        int number=300;
        int sum1=0;
        while (i<=number) {
            if (i % 4 == 0 && i % 6 == 0 && i % 8 == 0) {
                sum1 = sum1 + i;
            }
                i++;
            }
            int j=400;
            int num=800;
             int sum2=0;
             while(j<=num){
                if(j%25==0 &&  j%45==0) {
                    sum2 = sum2 + j;
                    System.out.println(sum2);
                }
                    j++;
             }
           int sum=sum1+sum2;
        System.out.println(sum);
            }
}



