package com.HomeWorkEx;

import java.util.Arrays;

public class DuplicateString {
    public static void main(String[] args) {
        String[] name = {"udhaya", "shruthi", "udhaya", "selvi", "dharshini", "sanjay", "dharshini", "selvi"};
        System.out.println(Arrays.toString(name)+" ");
        for (int i = 0; i < name.length - 1; i++) {
            if(name[i]!=null)
            for (int j = i+1; j < name.length; j++) {
                if (name[i].equals(name[j])){
                    name[j] = null;
                }
            }
        }
        System.out.println();
        for(int k=0;k< name.length;k++){
            if(name[k]!=null)
                System.out.println(name[k]+" ");
        }
            }
        }