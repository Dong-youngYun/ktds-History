package com.ktdsuniversity.edu.lamda;

@FunctionalInterface
public interface Computable {
	
	public int sum(int numberOne, int numberTwo); 
	
	//일반적으로는 구현클래스를 만들어 줘야 한다.
	//함수형 프로그래밍에서는 그다지 좋아하지 않는다.
	//클래스의 구현은 실행부분에 맡겨버린다.(함수형 프로그래밍의 가장 일반적인 방법)
	//이건 함수형 인터페이스라고 정의를 해줘야한다. 상관은 없으나 성능속도차이 존재
	//람다식으로 변형할수 있는 인터페이스가 됬다. @FunctionalInterface
}
