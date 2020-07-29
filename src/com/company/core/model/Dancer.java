package com.company.core.model;

public class Dancer extends Person {

    public Dancer(String name, String designation) {
        this.name = name;
        this.designation = designation;
        System.out.println("I'm a Dancer my name is "+this.name);
    }


}