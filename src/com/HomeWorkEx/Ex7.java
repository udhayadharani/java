package com.HomeWorkEx;


public class Ex7 {
    public static void main(String[] args) {
        int n=10;
        int element=3;
        int array[]={1,2,3,4,3,5,3,7,3,3};
        int occ=0;
        for (int i=0;i<n;i++){
            if(element==array[i]){
                occ++;
            }
        }
        System.out.println(element+"occurred "+occ+" times");

    }


}
