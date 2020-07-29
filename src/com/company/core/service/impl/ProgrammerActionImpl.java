package com.company.core.service.impl;

import com.company.core.model.Person;
import com.company.core.service.interfacer.ProgrammerAction;

public class ProgrammerActionImpl implements ProgrammerAction {

    private Person model = null;

    public ProgrammerActionImpl(Person model) {
        this.model = model;
    }

    @Override
    public void coding() {

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