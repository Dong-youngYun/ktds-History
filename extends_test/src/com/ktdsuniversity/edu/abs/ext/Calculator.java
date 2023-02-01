package com.ktdsuniversity.edu.abs.ext;
/**
 * 추상클래스
 * @author User
 *
 */
public abstract class Calculator { //class 앞에 abstract붙으면 추상클래스

	public int calculate(String calcType, int numberOne, int numberTwo) { //구현된 메소드
		if(calcType.equals("+")) { //calcType에 전달된게 +라면
			return sum(numberOne, numberTwo);
		}
		else if (calcType.equals("-")) {
			return minus(numberOne, numberTwo);
		}
		return 0;
	}
	
	protected abstract int sum(int numberOne, int numberTwo); //구현되지않은 메소드 다른 클래스가 구현화시켜야되
	protected abstract int minus(int numberOne, int numberTwo); //구현되지않은 메소드 다른 클래스가 구현화시켜야되
	//추상클래스는 상속받을 클래스에게 난 모르겟으니까 simpleCalculator 너가 해
	//접근제한자가 다르면 상속,호출안되
}
