package com.company.core.service.factory;

import com.company.core.model.Dancer;
import com.company.core.model.Person;
import com.company.core.model.Programmer;
import com.company.core.model.Singer;

public enum PersonEnum {
    DANCER( 1 ), SINGER( 2 ), PROGRAMMER( 3 );

    private final int value;

    PersonEnum(int value) {
        this.value = value;
    }

    public Person getModel() {
        switch(value) {
            case 1:
                return new Dancer();
            case 2:
                return new Singer();
            case 3:
                return  new Programmer();
            default:
                return null;
        }
    }

    public static PersonEnum valueOfLabel(int label) {
        for (PersonEnum e : values()) {
            if (e.value == label) {
                return e;
            }
        }
        return null;
    }
}