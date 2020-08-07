package com.company.core.service.impl;

import com.company.core.model.Person;
import com.company.core.service.interfacer.DancerAction;

public class DancerActionImpl implements DancerAction {

    private Person model;

    public DancerActionImpl(Person model) {
        this.model = model;
    }



    @Override
    public void dancing() {
        System.out.println("dancing ");
    }
    @Override
    public void walk() {
        System.out.println("walk ");
    }

    @Override
    public void eat() {
        System.out.println("eat ");
    }

    @Override
    public void learn() {
        System.out.println("learn ");
    }

}
