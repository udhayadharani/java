package com.FullEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[]bike=new String[]{"PULSAR","RX100","DIO","R15","yamaha"};
        ArrayList<String>list=new ArrayList<>(Arrays.asList(bike));
        System.out.println(list);
    }
}
