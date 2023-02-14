package com.ktdsuniversity.edu.constructor;

public class Calculator {
	
	private int a;
	private int b;
	
	public Calculator() {
		this.a = 10;
		this.b = 20; 
	}
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a + this.b; //기본생성자 30 / 오버로딩 생성자 a+b의 값
	}

}
