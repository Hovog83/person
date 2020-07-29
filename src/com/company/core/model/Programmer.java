package com.company.core.model;

public class Programmer extends Person {

    public Programmer(String name, String designation) {
        this.name = name;
        this.designation = designation;
        System.out.println("I'm a Programmer  my name is "+this.name);
    }


}