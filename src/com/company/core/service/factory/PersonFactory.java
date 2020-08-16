package com.company.core.service.factory;


import com.company.core.exception.ActionImplNotFondException;
import com.company.core.model.Dancer;
import com.company.core.model.Person;
import com.company.core.model.Programmer;
import com.company.core.model.Singer;
import com.company.core.service.impl.DancerActionImpl;
import com.company.core.service.impl.ProgrammerActionImpl;
import com.company.core.service.impl.SingerActionImpl;
import com.company.core.service.interfacer.PersonAction;

public class PersonFactory {


    public static PersonAction getPerson(Person person){
        PersonAction toReturn;

        if (person instanceof Programmer) {
           toReturn = new ProgrammerActionImpl(person);
        }else if(person instanceof Dancer){
           toReturn = new DancerActionImpl(person);
        }else if(person instanceof Singer){
           toReturn = new SingerActionImpl(person);
        }else{
            throw new ActionImplNotFondException("Wrong doughnut type:");
        }
        return toReturn;
    }
}
