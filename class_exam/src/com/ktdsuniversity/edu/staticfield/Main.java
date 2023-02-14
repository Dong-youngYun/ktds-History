package com.ktdsuniversity.edu.staticfield;

public class Main {
	
	private int number = 0;
	
	public static void main(String[] args) {
		
		Main m = new Main();
		System.out.println(m.number);
		
		int num = StaticTest.NUM;
		String str = StaticTest.STR;
		
		System.out.println(num);
		System.out.println(str);
		
		StaticTest.printHello();
		StaticTest.printHello("홍길동");
	}

}
