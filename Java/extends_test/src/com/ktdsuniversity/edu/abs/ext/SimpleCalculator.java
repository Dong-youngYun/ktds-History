package com.ktdsuniversity.edu.abs.ext;

/**
 * 추상클래스를 상속받아 구현한 클래스
 * @author User
 *
 */
public class SimpleCalculator extends Calculator {

	@Override
	protected int sum(int numberOne, int numberTwo) { //접근제한자가 다르면 상속,호출안되
		return numberOne + numberTwo;
	}

	@Override
	protected int minus(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}

}
