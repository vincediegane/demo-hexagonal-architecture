package io.diegane.demo_hexagonal.infastructure.exceptions;

public class MovieAlreadyExistsException extends RuntimeException {
    public MovieAlreadyExistsException(String message) {
        super(message);
    }
}
