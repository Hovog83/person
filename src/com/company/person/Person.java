package com.company.person;

public abstract class  Person implements PersonInterface{

    protected String name = null;
    protected String designation = null;

    @Override
    public void learn() {
        System.out.println("learn");
    }

    public void walk() {
        System.out.println("walk");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }
}

