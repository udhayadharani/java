package com.FullEx;

import java.util.Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array:"+ Arrays.toString(array));
        Arrays.sort(array);
        int index=array.length-1;
        while (array[index]==array[array.length-1]){
                index--;
        }
        System.out.println("Second largest element of the array:"+array[index]);
    }
}