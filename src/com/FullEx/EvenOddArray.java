package com.FullEx;

import java.util.Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array:"+ Arrays.toString(array));
        int ctr=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0)
                ctr++;
            }
            System.out.println("Number of even numbers:"+ctr);
            System.out.println("Number of odd numbers:"+(array.length-ctr));

        }
    }

