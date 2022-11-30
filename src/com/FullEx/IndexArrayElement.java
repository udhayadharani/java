 package com.FullEx;

 public class IndexArrayElement {
     public static void main(String[] args) {


         int myNum[] = {1, 2, 3, 4, 5};
         int element = 3;
         int index = -1;

         int i = 0;
         while (i < myNum.length) {
             if (myNum[i] == element) {
                 index = i;
                 break;
             }
             i++;
         }
         System.out.println("Index of "+element+"is:"+index);

     }
 }