package com.ktdsuniversity.edu.inf;

import java.util.Random;

public class CalculatorRandomImpl implements Calculator {

	@Override
	public int sum(int numberOne, int numberTwo) {
		return numberOne + numberTwo + new Random().nextInt();
	}

	@Override
	public int minus(int numberOne, int numberTwo) {
		return numberOne - numberTwo - new Random().nextInt();
	}

}
