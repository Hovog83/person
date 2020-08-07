package com.company.core.model;


import java.util.HashMap;

public class  Person {
    public static  int pk=0;
//    public static  HashMap<Integer, Person> PersonTabel;

    protected String surName = null;
    protected String lastName = null;
    protected String nickName = null;
    protected String email = null;
    protected Integer age = null;
    protected String gender = null;
    protected String designation = null;

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setNickname(String nickName) {
        this.nickName = nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int save(HashMap<String, String> modelForm){
        this.setSurName(modelForm.get("surName"));
        this.setLastName(modelForm.get("lastName"));
        this.setNickname(modelForm.get("nickName"));
        this.setEmail(modelForm.get("email"));
        this.setEmail(modelForm.get("email"));
        this.setDesignation(modelForm.get("designation"));
        this.setAge(Integer.parseInt(modelForm.get("age")));
        this.setGender(modelForm.get("gender"));
        Person.pk++;
//        Person.PersonTabel.put(Person.pk,this);
        return Person.pk;
    }

}

