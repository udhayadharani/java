package com.FullEx;

public class SpecificValue {
    public static boolean contains(int []array,int item) {
        for(int num:array){
            if(item==num){
                return true;

            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(contains(myArray1, 10));
        System.out.println(contains(myArray1, 20));

    }
    }