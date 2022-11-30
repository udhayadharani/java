package com.FullEx;

import java.util.Scanner;

public class
MatricesOfSameSizeArray {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of rows of matrix");
        a = input.nextInt();
        System.out.println("enter number of rows of matrix");
        b = input.nextInt();


        int array1[][] = new int[a][b];
        int array2[][] = new int[a][b];
        int sum[][] = new int[a][b];
        System.out.println("enter elements of 1st matrix");
        for (c = 0; c < a; c++)
            for (d = 0; d < b; d++)
                array1[c][d] = input.nextInt();

                System.out.println("enter elements of 2nd matrix");
                for (c = 0; c < a; c++)
                    for (d = 0; d < b; d++)
                        array2[c][d] = input.nextInt();


                        for (c = 0; c < a; c++)
                            for (d = 0; d < b; d++)
                                sum[c][d] = array1[c][d] + array2[c][d];
                                System.out.println("Sum of two matrices:");


                                for(c=0;c<a;c++)
                                    for(d=0;d<b;d++)
                                        System.out.println(sum[c][d]+"\t");
                                        System.out.println();
                                    }
                                }
