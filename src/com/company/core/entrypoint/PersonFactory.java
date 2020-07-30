package com.company.core.entrypoint;


import com.company.core.model.Person;
import com.company.core.service.impl.DancerActionImpl;
import com.company.core.service.impl.ProgrammerActionImpl;
import com.company.core.service.impl.SingerActionImpl;
import com.company.core.service.interfacer.PersonAction;

public class PersonFactory {
    private  Person model;

    public  PersonAction init(Person model,PersonEnum type){
        this.model = model;
       return this.getPerson(type);
    }

    public PersonAction getPerson(PersonEnum type){
        PersonAction toReturn;
        
        switch (type) {
            case DANCER:
                toReturn = new DancerActionImpl(this.model);
                break;
            case PROGRAMMER:

                toReturn = new ProgrammerActionImpl(this.model);
                break;
            case SINGER:
                toReturn = new SingerActionImpl(this.model);
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }

        return toReturn;

    }
}
