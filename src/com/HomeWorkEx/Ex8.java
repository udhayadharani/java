package com.HomeWorkEx;

public class Ex8 {
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,3,5,3,7,3,3};
        int l=myArray.length;
        System.out.println("Integer array length is:"+l);

        for( int i=0;i<myArray.length;i++){
            if(myArray[i]==3){
                System.out.println("index position of duplicate:"+i);
            }

        }
        }

    }

