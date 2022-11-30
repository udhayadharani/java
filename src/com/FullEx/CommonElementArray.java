package com.FullEx;

import java.util.Arrays;

public class CommonElementArray {
    public static void main(String[] args) {
        int []array1={1,2,3,4,5,6,7,8,9,10};
        int[] array2={11,10,7,8,12,13,14,15,16,17};
        System.out.println("1st array:"+ Arrays.toString(array1));
        System.out.println("2nd array:"+Arrays.toString(array2));


        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println("common array of element:"+(array1[i]));
                }
            }
        }
    }
}
