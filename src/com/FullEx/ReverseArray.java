package com.FullEx;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array:"+ Arrays.toString(array));
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;

        }
        System.out.println("Reverse array:"+Arrays.toString(array));
    }
}
