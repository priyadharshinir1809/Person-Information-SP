package com.impiger.sample.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PersonDetailNotFoundException.class)
    public ResponseEntity<BaseException>  handleUserNotFoundException(PersonDetailNotFoundException exception, WebRequest webRequest){
        BaseException baseException = new BaseException();
        baseException.setStatusCode(404);
        baseException.setMessage(exception.getMessage());
        return new ResponseEntity<>(baseException, HttpStatus.NOT_FOUND);
    }
}
