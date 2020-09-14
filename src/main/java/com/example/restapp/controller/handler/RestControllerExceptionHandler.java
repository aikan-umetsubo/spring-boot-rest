package com.example.restapp.controller.handler;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

import com.example.restapp.controller.response.ErrorResponse;

@ControllerAdvice
public class RestControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> getException(
      HttpServletRequest req,
      Exception e
    ) {
      // エラーレスポンス。のちほど解説
      return ErrorResponse.createResponse(e);
    }
}
