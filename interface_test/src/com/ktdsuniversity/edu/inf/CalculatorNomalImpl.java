package com.ktdsuniversity.edu.inf;
//구현 클래스 /calculator 인터페이스 타입의 클래스를 만든 것
public class CalculatorNomalImpl implements Calculator { //내가 쓰고싶은 인터페이스의 이름을 적어줘 calculatornomalimpl 에 마우스 올리고 quick fix
// 껍데기를 가지고 무슨일을 할건지
	@Override //인터페이스의 것을 재정의 했다 있어도 없어도 동작문제x 근데 없으면 성능상의 문제가 생긴다. 재정의 판단을 일일히 하는데 @를 찾아다니면서 판단 @에로테이션(주석) 지우지마
	public int sum(int numberOne, int numberTwo) {	 //세모는 인터페이스의 걸 구현한거야 라는 뜻
		return numberOne + numberTwo;
	}

	@Override
	public int minus(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	} 
	
	public int devide(int numberOne, int numberTwo) { //세모 없으면 인터페이스가 제공하지 않는 독자적인 메소드다 // 오버라이드 붙이면 인터페이스에는 devide가 없어서 오류 (오버라이드는 재정의라서)
		return numberOne / numberTwo;
	}
	

}

