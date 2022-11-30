package com.HomeWorkEx;

public class Ex6 {
    public static void main(String[] args) {
        String[] names={"Udhaya","Vinitha","Anusiya","Sanjay","Raj","keerthi"};
        for(int i=0;i<names.length;i++){

            char lastChar=names[i].charAt(names[i].length()-1);
            if(lastChar=='a'){

                System.out.println("lastChar a:"+names[i]);
            }
        }


        }

}
