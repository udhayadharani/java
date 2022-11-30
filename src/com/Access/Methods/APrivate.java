package com.Access.Methods;

public class APrivate {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(String name){
        display(name);
    }

    private void display(String name){
        System.out.println(name);
    }
}
