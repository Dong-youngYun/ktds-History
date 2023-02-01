package hello_java;

public class Operation {

	public static void main(String[]args) {
		// 1. 정수와 실수 연산
		int numberOne = 10;
		int numberTwo = 3;
		System.out.println("10 + 3= " +(numberOne + numberTwo));
		System.out.println("10 - 3= " +(numberOne - numberTwo));
		System.out.println("10 * 3= " +(numberOne * numberTwo));
		System.out.println("10 / 3= " +(numberOne / numberTwo));
		System.out.println("10 % 3= " +(numberOne % numberTwo));
		
		// 2. 실수와 실수 연산
		double floatOne = 10.1;
		double floatTwo = 3.2;
		System.out.println("10.1 + 3.2 = " +(floatOne + floatTwo));
		System.out.println("10.1 - 3.2 = " +(floatOne - floatTwo));
		System.out.println("10.1 * 3.2 = " +(floatOne * floatTwo));
		System.out.println("10.1 / 3.2 = " +(floatOne / floatTwo));
		System.out.println("10.1 % 3.2 = " +(floatOne % floatTwo));
		// 3. 실수와 정수 연산
		System.out.println("10.1 + 3 = " +(floatOne + numberTwo));
		System.out.println("10.1 - 3 = " +(floatOne - numberTwo));
		System.out.println("10.1 * 3 = " +(floatOne * numberTwo));
		System.out.println("10.1 / 3 = " +(floatOne / numberTwo));
		System.out.println("10.1 % 3 = " +(floatOne % numberTwo));
		// 4. 정수와 실수 연산
		System.out.println("10 + 3.2 = " +(numberOne + floatOne));
		System.out.println("10 - 3.2 = " +(numberOne - floatOne));
		System.out.println("10 * 3.2 = " +(numberOne * floatOne));
		System.out.println("10 / 3.2 = " +(numberOne / floatOne));
		System.out.println("10 % 3.2 = " +(numberOne % floatOne));
		// 5. 문자와 변수 연산
		System.out.println("10.1 + 3 = " +floatOne + numberTwo);
		System.out.println("10.1 - 3 = " +(floatOne - numberTwo));
		//괄호를 쓰지 않으면 floatOne까지는 문자로 인식된다.문자열에서 빼기라서 오류발생
		System.out.println("10.1 * 3 = " +floatOne * numberTwo);
		System.out.println("10.1 / 3 = " +floatOne / numberTwo);
		System.out.println("10.1 % 3 = " +floatOne % numberTwo);
		
	}
}
