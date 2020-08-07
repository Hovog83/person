package com.company.utils;

import com.company.core.exception.CreateCommandPersonException;

public class Validate {

    public static boolean CreateCommandPersonValidate(String command) throws CreateCommandPersonException {
        boolean regex = command.matches("[1-3]");
        if(!regex){
            throw new CreateCommandPersonException("Person notsupported");
        }
        return true;
    }
    public static boolean TextLengthValidate(String text,Integer max)  {
         if(text.length() < 1 && text.length() >= max){
             return false;
         }
        return true;
    }
    public static boolean TextEnumValidate(String text,String[] enumField)  {
        for (String m: enumField) {
            if(m.equals(text)){
                return true;
            }
        }
        return false;
    }
    public static boolean isInteger(String s)  {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
