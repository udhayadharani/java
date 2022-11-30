package com.FullEx;

import java.util.Calendar;

public class SetDateAndTime {
    public static void main(String[] args) {
        Calendar num=Calendar.getInstance();
        System.out.println("Current Date and Time:");
        System.out.format("%tB %te,%ty%n",num,num,num);
        System.out.format("%tI:%tM %tp%n",num,num,num);
    }
}
