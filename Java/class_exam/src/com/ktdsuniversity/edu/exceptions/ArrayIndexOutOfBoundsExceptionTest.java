package com.ktdsuniversity.edu.exceptions;

public class ArrayIndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		
		String[] nameArr = new String[3];
		nameArr[0] = "조태용";
		nameArr[1] = "정덕수";
		nameArr[2] = "이유나";
		
		String name = nameArr[0];
		System.out.println(name);
		name = nameArr[1];
		System.out.println(name);
		name = nameArr[2];
		System.out.println(name);
		
		if (nameArr.length > 3) { //length 체크로 회피
			name = nameArr[3];
			System.out.println(name);
		}
		
		String string ="썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다. 2010년에 오라클이 썬 마이크로시스템즈를 인수하면서 Java의 저작권을 소유하였다.";
		String[] wordArray = string.split(" ");
		
		if (wordArray.length > 50) { //length 체크로 회피
			String word = wordArray[50];
			System.out.println(word);
			
		}
		try {
			String word = wordArray[50];
			System.out.println(word);
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("그런 인덱스는 없습니다.");
		}
	}
	
}
