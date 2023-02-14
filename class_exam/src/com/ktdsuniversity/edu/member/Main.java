package com.ktdsuniversity.edu.member;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
//선언 (변수로 만들어봄) 클래스명 변수명          생성자 (이 클래스를 인스턴스로 만들어주는게 생성자 역할)
// 인스턴스로 만들어진다.(인스턴스.을 사용할 수있다. 인스턴스는 레퍼타입이다.     생성자도 일종의 메소드 소괄호()필요
		
		memberService.setUserName("장민창");
		String userName = memberService.getUserName(); //할당은 반환하는 타입으로 지정 이름도 똑같이하는게 좋다. (꺼내와서 뭔가를 하고 싶을때 할당을 받아와서 사용)
		System.out.println(userName);
		
		memberService.join();
//		memberService.login(); //private 에러발생
		memberService.quit();
	}
	
}
