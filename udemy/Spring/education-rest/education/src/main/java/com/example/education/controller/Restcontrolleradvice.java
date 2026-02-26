package com.example.education.controller;

import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.NoSuchElementException;
@ControllerAdvice
public class Restcontrolleradvice {
    private static final Logger LOG = LoggerFactory.getLogger(Restcontrolleradvice.class);
    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleresourcenotfoundexception(NoSuchElementException ex){
        LOG.error("NoSuchElementException:",ex);
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> handlegeneralexxception(Exception ex){
        LOG.error("Exception bas verdi:",ex);
        return new ResponseEntity<>("unexpected error occured: "+ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
