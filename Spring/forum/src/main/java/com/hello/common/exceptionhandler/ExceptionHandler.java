package com.hello.common.exceptionhandler;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice({"com.hello", "org.springframework"})
public class ExceptionHandler {
	// 어떤 예외를 처리할지 설정
	
	private Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
	
	@org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
	public String handleRuntimeException(RuntimeException re) {
		logger.info("예외가 발생했습니다!! {}", re.getMessage());
		return "";
	}
	
	
}
