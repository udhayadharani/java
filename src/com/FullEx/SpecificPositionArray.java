package com.FullEx;

import java.util.Arrays;

public class SpecificPositionArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,9,10};
        int indexPosition=7;
        int newValue=8;

        System.out.println("Original Array:"+ Arrays.toString(array));
        for(int i=array.length-1;i>indexPosition;i--){
            array[i]=array[i=1];
            array[indexPosition]=newValue;
            System.out.println("new array:"+Arrays.toString(array));
        }
    }
}
