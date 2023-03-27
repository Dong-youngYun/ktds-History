package com.ktdsuniversity.edu.exceptions;

public class NotSupportAgeException extends RuntimeException{//노란줄 생기는 이유 /빨간줄add generate~~

	private static final long serialVersionUID = -3071941030476310489L; 
	
	public NotSupportAgeException() { //예외 클래스만들때 보통은 두개 ex)주문금액이 모자랍니다. 같은 메세지 던지는 거 장바구니 주문할때 품절된 제품 있는경우 품절입니다 라고 메세지 나옴
		super();
	}
	public NotSupportAgeException(String message) {
		super(message);
	}
}
