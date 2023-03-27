package com.ktdsuniversity.edu.lamda;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void print(Printable printable) { //static이 있어야 메인에서 쓸수 있어 없으면 호출필요
		printable.print("장민창");
	}
	
	public static void printSumResult(Computable computable) {
		
		int sumResult = computable.sum(10, 30);
		System.out.println(sumResult);
		
	}

	public static void main(String[] args) {

		printSumResult(new Computable() { //기존에는 구현시킨 클래스가 필요 /익명클래스로 만듬/ 객체를 전달 한거랑 같은거다.

			@Override
			public int sum(int numberOne, int numberTwo) {
				return numberOne + numberTwo;
			}
			
		});
		
		//람다 함수      람다헤더            람다바디 
		printSumResult((num1, num2) -> num1 + num2); // 네이밍은 달라도 되 /타입 생략 interface에 int라고 정의가 되있다./ 파라미터 개수 따라가 자릿수 맞춰서 들어간다. / 중괄호를 안쓰면 return시키겠다. return생략
		printSumResult((num1, num2) -> { //중괄호하면 return 값필요
			return num1 + num2;
		});
		
		//print((data) -> data + "입니다."); //string return 시키려하면 에러
		print( data -> System.out.println(data + "입니다.")); //return 타입을 똑같이 void로 return해서 문제 없어
		print( System.out::println); //메소드 레퍼런스 .대신 :: 으로
		print( data -> { //중괄호 쓰면 된다. /람다헤더의 파라미터가 하나면 괄호 없어도 되 두개면 ()필요 ()쓰는게 관례 하나든 두개든
			data +="1";//여러줄의 람다바디가 있으면 {}써야되
			System.out.println(data + "입니다."); 
		});
		
		List<Integer> intList = List.of(10, 20, 30, 40, 50); //List.of 뒤의 데이터들을 리스트로 자바9부터
		List<Integer> intList2 = Arrays.asList(10, 20, 30, 40, 50); //자바 8이하인 경우
		
		intList.forEach(System.out::println); //foreach 사용
		intList2.forEach(System.out::println);
		
//		Computable calc = new Computable() { // 인터페이스타입은 인스턴스화 시킬수 없다./ 중괄호를 열고 닫으면 반드시 구현되어야 한다고 나온다./unimplement 클릭
//												// 이 방법으로 만드는게 익명클래스
//												// 객체지향 프로그래밍에서는 그다지 좋지 않은 방법 // 안드로이드 (이벤트 드라이빙 프로그램 - 누르면 뭐해라) 같은 경우 자주 사용
//												//161p 처럼 변형해서 사용하면 된다. but 규칙이 존재
//												// 구현되지 않은 메소드가 두개이상인 경우 불가능 / 반드시 하나의 구현되지 않은 메소드만 존재해야 가능하다.
//												//함수형 인터페이스는 파라미터로 전달 되어야 한다. 그냥 동작하는 건 의미가 없어
//												
//			@Override
//			public int sum(int numberOne, int numberTwo) {
//				return numberOne + numberTwo;
//			}
//
//			@Override
//			public int minus(int numberOne, int numberTwo) {
//				return numberOne - numberTwo;
//			}
//		};
//
//		System.out.println(calc.sum(10, 20));
//		System.out.println(calc.minus(10, 50));

	}

}
