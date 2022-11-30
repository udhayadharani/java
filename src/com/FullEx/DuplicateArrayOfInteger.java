package com.FullEx;

public class DuplicateArrayOfInteger {
    public static void main(String[] args) {
        int[]array={1,2,3,4,2,5,3,7,8,2,8,9};
        for( int i=0;i<array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if (array[i] == array[j] && (i != j)) {
                    System.out.println("Duplicate array element:"+array[j]);
                }
            }
        }

    }
}
