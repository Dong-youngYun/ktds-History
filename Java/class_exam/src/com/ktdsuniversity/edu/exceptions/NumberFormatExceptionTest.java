package com.ktdsuniversity.edu.exceptions;

public class NumberFormatExceptionTest {

	public static boolean isInteger(String string) { //string이 숫자인지 아닌지 판단 String 변수내에 정말 숫자로만 이루어져 있는지
		if (string == null) {
			return false;
		}
		
		return string.matches("^[0-9]+$"); //정규표현식 ^무언가로 시작한다 $무언가로 끝난다. 숫자로 시작하고 그것이 한글자 이상있다 (+) 앞에 있는게 여러개
	}									   //중간에 다른 문자 있으면 false로 나온다.
	
	public static void main(String[] args) {
		
		System.out.println(isInteger("12345"));
		System.out.println(isInteger("123.45"));
		System.out.println(isInteger("123. 45"));
		System.out.println(isInteger("ABC"));
		
		String str = "1234";
		if (isInteger(str)) {
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		
		try {
			Integer.parseInt("adfa");
		}
		catch (NumberFormatException nfe) {
			System.out.println("변환할 수 없습니다.");
		}
		
	}
}
