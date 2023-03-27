package com.ktdsuniversity.edu.calculator;

import java.util.Scanner;

import com.ktdsuniversity.edu.exceptions.NotSupportAgeException;
import com.ktdsuniversity.edu.util.NumberUtil;

public class Calculator {
	
	public static void checkAge(int age) {
		if (age > 150) {
			throw new NotSupportAgeException("151세 이상은 입력할 수 없습니다."); //runtime 예외
		}
	}

	public static void main(String[] args) {
		
		checkAge(10);
		
		try {
			checkAge(200);
		}
		catch (NotSupportAgeException nsae) {
			System.out.println(nsae.getMessage());
		}
		
//		int age = 200;
//		if ( age >150 ) {
////			throw new NotSupportAgeException(); //throw new 예외명
//			throw new NotSupportAgeException("151세 이상은 입력할 수 없습니다.");
//		}
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
//		String nullString = null;
		
		//byte로 변경
		byte b = NumberUtil.toByte(string, (byte) 99); //try catch가 숨어있는 코드 //자바에서 숫자 그냥 쓰면 int
		
		short s = NumberUtil.toShort(string, (short) 11);
		
		int i =NumberUtil.toInt(string, 22);
		
		long l =NumberUtil.toLong(string, (long) 332130000);
		
		float f =NumberUtil.toFloat(string, (float) 44);
		
		double d =NumberUtil.toDouble(string, (double) 55);
	
//		try {
//			
//			boolean isEquals = nullString.equals ("A"); //NPE 발생 그 이하 무시 "무언가가 null임" 출력 NFE는 던져지지않아 출력x
//			
//			System.out.println("변환 시작");
//			b = Byte.parseByte(string); //바꾸는거 parse~ 중괄호 감싸는 순간 byte의 범위는 {부터}까지 원래 byte b
//			System.out.println("정상적으로 변환 됨.");//에러가 나지 않으면 try절안의 모든게 실행되
//			
//		}
//		catch (NullPointerException npe) {
//			b = 0;
//			System.out.println("무언가가 null임"); //NPE가 발생되지 않아서 NFE 던져진 예외만 처리
//		}
//		catch(NumberFormatException nfe) {
//			b = 0;  //b라는 변수가 try안의 범위로 한정 되어있어서 에러 //에러발생시 보여주는 값
//			System.out.println("변환 중 에러가 발생함."); //parseByte에서 에러 발생 그 이후는 모두 무시하고 바로 catch로 넘어감
//		}
//		finally {
//			System.out.println("무조건 실행되는 finally");
//		}
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
	
}
