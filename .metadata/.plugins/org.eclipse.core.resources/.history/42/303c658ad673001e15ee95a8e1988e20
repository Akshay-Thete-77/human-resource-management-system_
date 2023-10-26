
package com.te.hrms.exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.hrms.response.ErrorResponse;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ErrorResponse> handler(RuntimeException runtimeException) {
		return ResponseEntity.<ErrorResponse>ok().body(
				ErrorResponse.builder().message("registratin failed...!!!").timestamp(LocalDateTime.now()).build());
	}
}
