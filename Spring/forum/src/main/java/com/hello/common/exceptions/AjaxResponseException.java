package com.hello.common.exceptions;

public class AjaxResponseException extends RuntimeException {
	//Ajax 전용 예외처리
	private static final long serialVersionUID = -1915517486526260958L;
	
	public AjaxResponseException(String msg) {
		super(msg);
	}

}
