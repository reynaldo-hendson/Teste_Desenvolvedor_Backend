package com.test.forleven.infra.exceptions;

public class NegocioException extends RuntimeException {
    private static final Long serialVersionUID = 1L;
    public NegocioException(String message){
        super(message);
    }
}
