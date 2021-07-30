package com.impiger.sample.Exception;


public class PersonDetailNotFoundException extends RuntimeException {

    public PersonDetailNotFoundException(String message) {
        super(message);
        System.out.println("PersonDetail not found exception");
    }
}
