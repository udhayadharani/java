package com.Method;

public class Car {
   public static String carDetails (String name, String model, int price){
        return name+" "+model+" "+price;

   }
   public static void bikeDetails(String name,String model,int speed){
       System.out.println(name+" "+model+" "+speed);

   }

    public static void main(String[] args) {
        String str=carDetails("ford","F-150",562000);
        System.out.println(str);
        bikeDetails("yamaha","RX100",110);
        bikeDetails("fz","yamaha fzx",230);
    }



}
