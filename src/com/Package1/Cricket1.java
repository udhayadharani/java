package com.Package1;

public class Cricket1 {
    public static void main(String[] args) {
        Cricket cricket1=new Cricket("virat","t20",109,20);

        System.out.println(cricket1.playerName);
        System.out.println(cricket1.match);
        System.out.println(cricket1.runs);
        System.out.println(cricket1.noOfMatches);


        cricket1.playerName="dhoni";
        System.out.println(cricket1.playerName);
        cricket1.match="worldcup";
        System.out.println(cricket1.match);
        cricket1.runs=107;
        System.out.println(cricket1.runs);
        cricket1.noOfMatches=12;
        System.out.println(cricket1.noOfMatches);







    }
}
