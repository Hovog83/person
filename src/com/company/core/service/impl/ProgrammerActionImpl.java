package com.company.core.service.impl;

import com.company.core.model.Person;
import com.company.core.service.interfacer.ProgrammerAction;
import com.company.utils.MyScanner;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ProgrammerActionImpl implements ProgrammerAction {

    private final Person model;
    private final Scanner scanner = MyScanner.getScanner();

    private boolean eated = false;
    private boolean learned = false;

    public ProgrammerActionImpl(Person model) {
        this.model = model;
    }
    @Override
    public void coding() {
        if(learned) {
            System.out.printf("%s %s", this.model.getSurName(), this.model.getLastName() + " is writing a code.");
        }else System.out.println(this.model.getLastName() + " has not learned");
    }
    @Override
    public void walk() {
        System.out.println("walk");
    }
    @Override
    public void eat() {
        eated = true;
        System.out.println(this.model.getSurName()+" "+this.model.getLastName() + " is eating.");
    }
    @Override
    public void learn() {
        if(eated) {
            System.out.println( this.model.getSurName()+" "+this.model.getLastName() + " is learning.");
            learned = true;
        }
        else System.out.println(this.model.getLastName()+" not eat");
    }
    @Override
    public void command() {
        System.out.println("CommandIn - coding | walk | eat | learn | exit");
        String in =  this.scanner.nextLine();
        if(in.equals("exit")){
            System.out.println("exit");
            return;
        }
        try {
            Method method = this.getClass().getMethod(in);
            method.invoke(this);
        } catch (Exception e ) {
            System.out.println("Command is not Valid");
        }
        this.command();
    }
}