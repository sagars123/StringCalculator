package com.incubyte.calculator.service;

public class StringCalculatorException extends Exception {

  private String code;

  public StringCalculatorException(String code, String message) {
    super(message);
    this.setCode(code);
  }

  public StringCalculatorException(String code, String message, Throwable cause) {
    super(message, cause);
    this.setCode(code);
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
