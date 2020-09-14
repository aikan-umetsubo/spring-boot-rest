package com.example.restapp.controller.response;

public class ErrorResponse {
  private String code;
  private String message;

  public ErrorResponse(String code, String message){
    this.code = code;
    this.message = message;
  }

  public static ErrorResponse createResponse(Exception e) {
    return new ErrorResponse("", e.getMessage());
  }
}
