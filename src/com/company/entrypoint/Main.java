package com.company.entrypoint;

import com.company.core.CrudPerson;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

//         Singer ie = new Singer();
////
//        ie.setDesignation(Singer.DESIGNATION);
//
//        System.out.println();

        CrudPerson crudPerson = new CrudPerson();
        crudPerson.init();

    }
}
