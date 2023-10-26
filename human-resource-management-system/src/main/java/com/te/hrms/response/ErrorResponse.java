package com.te.hrms.response;

import java.time.LocalDateTime;

import com.te.hrms.dto.LoginDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErrorResponse {
	private Object data;
	private String message;
	private LocalDateTime timestamp;
}
