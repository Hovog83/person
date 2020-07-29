package com.company.core.service.impl;
import com.company.core.model.Person;
import com.company.core.service.interfacer.SingerAction;

public class SingerActionImpl  implements SingerAction {

    private Person model = null;

    public SingerActionImpl(Person model) {
        this.model = model;
    }

    @Override
    public void singing() {

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
