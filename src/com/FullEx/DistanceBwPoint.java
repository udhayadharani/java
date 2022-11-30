package com.FullEx;

public class DistanceBwPoint {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double distance;
        x1=4;y1=6;x2=8;y2=10;
        distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);
    }
}
