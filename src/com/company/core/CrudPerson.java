package com.company.core;

import com.company.core.model.Person;
import com.company.core.service.factory.PersonEnum;
import com.company.core.service.factory.PersonFactory;
import com.company.core.service.interfacer.PersonAction;
import com.company.core.exception.CreateCommandPersonException;
import com.company.utils.Validate;
import com.company.core.annotations.ModelEnum;

import java.util.HashMap;
import java.util.Scanner;

public class CrudPerson {

    public static int mistakeCount = 0;
    private Scanner scanner = new Scanner(System.in);

    public PersonAction init() throws ClassNotFoundException {
       System.out.println("what type of person user want to create 1-dancer , 2-singer , 3-programmer");
       String command = this.scanner.nextLine();
        try {
            Validate.CreateCommandPersonValidate(command);
        } catch (CreateCommandPersonException e) {
            CrudPerson.mistakeCount++;
            if(CrudPerson.mistakeCount > 3){
                this.exit();
            }
            System.out.println(e.getMessage());
            this.init();
        }
        int typeIndex = Integer.parseInt(command);
        PersonEnum type = PersonEnum.values()[typeIndex];
        Person model = type.getValue();
        this.personForm(model);
        return PersonFactory.getPerson(model);
    }
    private void personForm(Person model) throws ClassNotFoundException {
        ModelEnum anno = model.getClass().getAnnotation(ModelEnum.class);
        HashMap<String, String> modelForm = new HashMap<String, String>();
        modelForm.put("surname",     putFildeText("surname") );
        modelForm.put("lastname",    putFildeText("lastname") );
        modelForm.put("nickname",    putFildeText("nickname") );
        modelForm.put("designation", putFildeEnum("designation", anno.designation()));
        modelForm.put("email",       putFildeText("email") );
        modelForm.put("age",         putFildeInt("age") );
        modelForm.put("gender",      putFildeEnum("gender",new String[]{"Male", "Female"}));
        int pk = model.save(modelForm);
        System.out.println("user id:"+pk);
    }

    private void exit() {
        System.out.println("exit");
    }

    private String putFildeText(String fieldName){
        System.out.println("Enter " + fieldName);
        String in =  this.scanner.nextLine();
        boolean b = Validate.TextLengthValidate(in, 255);
        if(!b){
            System.out.println("the "+fieldName+" is filled");
            return this.putFildeText(fieldName);
        }
        return in;
    }
    private String putFildeEnum(String fieldName, String[] enumField){
        String ms = "";
        for (String m: enumField) ms += m + " ";
        System.out.println("Enter "+ fieldName +" in "+ms);
        String in =  this.scanner.nextLine();
        boolean b = Validate.TextEnumValidate(in, enumField);
        if(!b){
            System.out.println("the "+fieldName+" is filled");
            return this.putFildeEnum(fieldName,enumField);
        }
        return in;
    }
    private String putFildeInt(String fieldName){
        System.out.println("Enter " + fieldName);
        String in =  this.scanner.nextLine();
        boolean b = Validate.isInteger(in);
        if(!b){
            System.out.println("the "+fieldName+" is filled");
            return this.putFildeInt(fieldName);
        }else{
            return in;
        }
    }



}
