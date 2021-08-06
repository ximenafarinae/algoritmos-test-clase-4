package com.example.clase4.exceptions;

public class ProductNotFoundException  extends RuntimeException{

    public ProductNotFoundException(String message) {
        super(buildMessage(message));
    }

    private static String buildMessage(String message){
        return message;
    }

}
