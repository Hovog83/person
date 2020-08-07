package com.company.core.service.factory;

import com.company.core.model.Dancer;
import com.company.core.model.Person;
import com.company.core.model.Programmer;
import com.company.core.model.Singer;

public enum PersonEnum {
    DANCER( new Dancer()), SINGER(new Singer()), PROGRAMMER(new Programmer());

    private final Person value;

    PersonEnum(Person value) {
        this.value = value;
    }
    public Person getValue() {
        return value;
    }
}