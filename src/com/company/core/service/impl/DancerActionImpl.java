package com.company.core.service.impl;

import com.company.core.model.Person;
import com.company.core.service.interfacer.DancerAction;

public class DancerActionImpl implements DancerAction {

    private Person model = null;

    public DancerActionImpl(Person model) {
        this.model = model;
    }

    @Override
    public void dancing() {

    }
    @Override
    public void walk() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void learn() {

    }

}
