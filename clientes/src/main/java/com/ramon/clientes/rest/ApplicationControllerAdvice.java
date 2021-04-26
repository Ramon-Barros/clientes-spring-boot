package com.ramon.clientes.rest;

import java.util.List;
import java.util.stream.Collectors;

import com.ramon.clientes.rest.exception.ApiErros;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;




@RestControllerAdvice
public class ApplicationControllerAdvice {
    
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErros handleValidationErros( MethodArgumentNotValidException ex){
        BindingResult bindingResult = ex.getBindingResult();
        List <String> messages = bindingResult.getAllErrors()
        .stream().map( objectError -> objectError.getDefaultMessage())
        .collect(Collectors.toList());
        return new ApiErros(messages);
    }


    @ExceptionHandler(ResponseStatusException.class)    
    public ResponseEntity <Object> handleResponseStatusException(ResponseStatusException ex){
        String mensagemErro = ex.getMessage();
        HttpStatus codigoStatus = ex.getStatus();
        ApiErros apiErros = new ApiErros(mensagemErro);
        return new ResponseEntity <Object> (apiErros, codigoStatus);
    }
}
