package com.company.core.service.impl;
import com.company.core.model.Person;
import com.company.core.service.interfacer.SingerAction;
import com.company.utils.MyScanner;

import java.lang.reflect.Method;
import java.util.Scanner;

public class SingerActionImpl  implements SingerAction {

    private Person model = null;
    private final Scanner scanner = MyScanner.getScanner();

    private boolean eated = false;
    private boolean walked = false;

    public SingerActionImpl(Person model) {
        this.model = model;
    }

    public void singing() {
        if(this.eated) {
            System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is singing." );
        }
        else System.out.println("has not eate,  can not singing.");
    }

    @Override
    public void walk() {
        this.walked = true;
        System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is walk." );
    }

    @Override
    public void eat() {
        this.eated = true;
        System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is eating." );
    }

    @Override
    public void learn() {
        System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is learn." );
    }

    @Override
    public void playing() {
        if(this.walked && this.eated) {
            System.out.println(this.model.getLastName()+" "+  this.model.getSurName() + " is playing." );
        }
        else System.out.println("has not  walked and eate ,  can not playing.");
    }

    @Override
    public void command() {
        System.out.println("CommandIn - singing | playing | walk | eat | learn | exit");

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
