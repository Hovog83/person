package com.company.entrypoint;

import com.company.core.CrudPerson;
import com.company.core.model.Person;
import com.company.core.service.factory.PersonFactory;
import com.company.core.service.interfacer.PersonAction;


public class Main {


    public static void main(String[] args)  {
        CrudPerson crud = new CrudPerson();
        Person model = crud.create();
        PersonAction impl  = PersonFactory.getPerson(model);
        impl.command();

    }
}
