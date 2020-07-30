package com.eva.testtask.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "There is no such product")
public class ThereIsNoSuchProductException extends RuntimeException {
}
