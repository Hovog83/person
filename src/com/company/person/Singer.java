package com.company.person;

public class Singer extends Person {

    public Singer(String name, String designation) {
        this.name = name;
        this.designation = designation;
        System.out.println("I'm a Singer  my name is "+this.name);

    }

    public void coding(){
        System.out.println("coding");
    }

    public void singing(){
        System.out.println("singing");
    }

    public void playGitar(){
        System.out.println("playGitar");
    }


}