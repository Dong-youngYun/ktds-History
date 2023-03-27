package com.ktdsuniversity.edu.abs.ext;

public class Main {

	public static void main(String[] args) {
		
//		Calculator calc = new Calculator() {}; //추상클래스 객체화X 중괄호 만들어주면 객체화 가능
//		List<String> list = new List<>();//인터페이스 객체화x
		
		Calculator calc = new SimpleCalculator();
		System.out.println(calc.calculate("+", 10, 40));
		System.out.println(calc.calculate("-", 10, 40));
		
	}
	
}
