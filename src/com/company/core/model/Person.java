package com.company.core.model;


import jdk.nashorn.internal.ir.FunctionNode;

import java.util.HashMap;

public class  Person {
    public static  int pk=0;
    public static  HashMap<Integer, Person> PersonTabel;

    protected String surname = null;
    protected String lastname = null;
    protected String nickname = null;
    protected String email = null;
    protected Integer age = null;
    protected String gender = null;
    protected String designation = null;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int save(HashMap<String, String> modelForm){
        this.setSurname(modelForm.get("surname"));
        this.setLastname(modelForm.get("lastname"));
        this.setNickname(modelForm.get("nickname"));
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

