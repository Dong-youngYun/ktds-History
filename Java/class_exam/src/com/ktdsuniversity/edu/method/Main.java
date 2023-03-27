package com.ktdsuniversity.edu.method;

public class Main {
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(0);
		calc.sum(0L);
		calc.sum(0,0);
		calc.sum(0,0,0);
		
		Welcome welcome = new Welcome();
		String greeting = welcome.greeting();
		System.out.println(greeting);
		
		greeting =welcome.greeting("장민창");
		System.out.println(greeting);
		
		greeting = welcome.greeting("장민창", "안녕?");
		System.out.println(greeting);
		
		greeting = welcome.greeting("장민창", "조태용", "이동학"); 
		System.out.println(greeting);
		
		//배열 파라미터 Case1
		greeting =welcome.greetings(new String[] {"장민창", "조태용", "이동학"});
		System.out.println(greeting);
		
	}

}
