package com.FullEx;

public class AverageArray {
    public static void main(String[] args){
        int n=5;
        int avg=0;

        int arr[]=new int[n];
        arr[0]=78;
        arr[1]=96;
        arr[2]=93;
        arr[3]=89;
        arr[4]=90;

        for(int i=0;i<n;i++)
            avg=avg+arr[i];
            System.out.println("average of("+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+")is="+avg/n);

    }

}
