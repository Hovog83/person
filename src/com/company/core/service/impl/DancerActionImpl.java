package com.company.core.service.impl;

import com.company.core.model.Person;
import com.company.core.service.interfacer.DancerAction;
import com.company.utils.MyScanner;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DancerActionImpl implements DancerAction {

    private Person model;
    private final Scanner scanner = MyScanner.getScanner();

    private boolean eated = false;
    private int eatCount = 0;

    public DancerActionImpl(Person model) {
        this.model = model;
    }

    @Override
    public void dancing() {
        if(this.eated) {
            System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is dancing." );
        }
        else
            System.out.println("can't dancing.");
    }
    @Override
    public void walk() {
        System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is walk." );
    }

    @Override
    public void eat() {
        if(this.eatCount < 3) {
            this.eatCount++;
            this.eated = true;
            System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is eating." );
        }
        else {
            System.out.println("has eaten 3 times,  can not eat anything else!");
        }
    }

    @Override
    public void learn() {
        System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is learn." );
    }

    @Override
    public void command() {
        System.out.println("CommandIn - dancing | walk | eat | learn | exit");

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
