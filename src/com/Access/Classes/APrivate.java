package com.Access.Classes;

public class APrivate {

    private class Degree{
        void display(){
            System.out.println("M.sc");

        }
    }
 public void displayinner(){
        Degree ex=new Degree();
        ex.display();
    }
}
