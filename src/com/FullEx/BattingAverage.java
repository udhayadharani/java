package com.FullEx;

public class BattingAverage {
    public static void main(String[] args) {
        int totalMatches=50;
        int totalRuns=2500;
        int innings=80;
        int notOut=1;
        double avg;

        avg=totalRuns/(innings-notOut);
        System.out.println("batting average="+avg);


    }
}
