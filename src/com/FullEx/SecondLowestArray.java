package com.FullEx;

import java.util.Arrays;

public class SecondLowestArray {
    public static void main(String[] args) {
        int[] array = {-11, 13, 23, -35, 49, 50};
        System.out.println("original numeric array:" + Arrays.toString(array));
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                secondMin = min;
            } else if (array[i] < min) {
                secondMin=min;
                min=array[i];
            } else if (array[i]<secondMin) {
                secondMin = array[i];
            }
            }
            System.out.println("second lowest number is:" + secondMin);
            }
        }

