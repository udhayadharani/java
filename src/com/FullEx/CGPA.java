package com.FullEx;

public class CGPA {
    public static void main(String[] args) {
        int number=5;
        double CGPA,sum=0;

        double maxiMarks[]=new double[number];
        double grade[]=new double[number];
        maxiMarks[0]=98;
        maxiMarks[1]=89;
        maxiMarks[2]=96;
        maxiMarks[3]=78;
        maxiMarks[4]=90;

        for(int i=0;i<number;i++){
            grade[i]=(maxiMarks[i]/10);

        }
        for(int i=0;i<number;i++){
            sum+=grade[i];
        }
        CGPA=sum/number;

        System.out.println(" CGPA ="+CGPA);
        System.out.println("percentage from CGPA="+CGPA*9.5);
    }
}
