package com.company.entrypoint;

import com.company.core.entrypoint.PersonEnum;
import com.company.core.entrypoint.PersonFactory;
import com.company.core.model.Dancer;
import com.company.core.model.Person;
import com.company.core.model.Programmer;
import com.company.core.model.Singer;

public class Main {

    public static void main(String[] args) {
        PersonFactory personType = new PersonFactory();

        Person dancer = new Dancer("Sofi","Folk dance");
        personType.init(dancer,PersonEnum.DANCER);

        Person programmer = new Programmer("babken","Web dev");
        personType.init(programmer,PersonEnum.DANCER);

        Person singer = new Singer("Eminem","Rep");
        personType.init(singer,PersonEnum.DANCER);


    }
}
