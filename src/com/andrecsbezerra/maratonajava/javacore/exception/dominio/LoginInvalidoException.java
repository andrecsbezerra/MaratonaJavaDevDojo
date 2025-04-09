package com.andrecsbezerra.maratonajava.javacore.exception.dominio;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
