package calculator;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int sumResult = calc.sum(10, 10);
		int minusResult = calc.minus(5, 10);
		int multiResult = calc.multi(5, 2);
		double devideResult = calc.devide(50, 3);
		int remainResult = calc.remain(50,3);
		
		System.out.println("sumResult =" + sumResult);
		System.out.println("minusResult=" + minusResult);
		System.out.println("multiResult=" + multiResult);
		System.out.println("devideResult=" +devideResult);
		System.out.println("remainResult=" +remainResult);
	}
}
