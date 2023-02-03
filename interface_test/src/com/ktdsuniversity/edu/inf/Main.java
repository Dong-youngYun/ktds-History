package com.ktdsuniversity.edu.inf;

public class Main {
	//calculator 객체를 가져와서 계산 /파라미터가 온 경우
	public static void calculate(Calculator calculator) {
		System.out.println(calculator);
		if (calculator instanceof CalculatorNomalImpl) { //calculator 노말임플이냐고 물어보는것 이것만 해줘 강제 
			System.out.println(calculator.sum(10, 20));
			System.out.println(calculator.minus(40, 3));
			
		}
		
	}
	
	public static void main(String[] args) {
		//calculate라는 메소드는 nomalimple을 가져와
		calculate(new CalculatorNomalImpl());
		calculate(new CalculatorRandomImpl());
		
		
		//타입이 calculator라는 인터페이스 인터페이스가 제공하는 것만 써라고 강제
		// 인터페이스명 변수명 = new 구현클래스명();
		//인터페이스가 있으면 확장성이 좋아져 ->유지보수가 편해져
		
//		Calculator calculator1 =new CalculatorNomalImpl();
//		System.out.println(calculator1.sum(10, 20));
//		System.out.println(calculator1.minus(40, 3));
//		
//		//calculator1.devide(10, 5);
//		//타입을 인터페이스를 안주고 클래스를 직접 타입으로 주고 새로쓰면 가능해
//		//이럴거면 인터페이스가 필요가없어
////		CalculatorNomalImpl calculator2 = new CalculatorNomalImpl();
////		System.out.println(calculator2.devide(10, 2));
//		
//		Calculator calculator2 = new CalculatorRandomImpl();
//		System.out.println(calculator2.sum(10, 20));
//		System.out.println(calculator2.minus(40, 3));
	}
	
}
