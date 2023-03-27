package class_test;

public class TemperatureConverter {
	
	/**
	 * 섭씨를 화씨로 변경한다.
	 */
	public void toFah() {
		
		// 섭씨
		int cel = 31;
		/*
		 * 섭씨를 화씨로 변경해 fah 변수에 할당 후 출력
		 */
		double fah = cel * 1.8 + 32;
		System.out.println(cel + " -> " + fah);
	}
	
	/**
	 * 화씨를 섭씨로 변경한다.
	 */
	public void toCel() {
		
		double fah =87.6;
		/*
		 * 화씨를 섭씨로 변경해 cel 변수에 할당 후 출력
		 */
		// cel = ( (int) fah -32 )/(int) 1.8;
		//밑에서 cel에 int가 붙는 이유? 변수선언
		int cel = (int) ((fah - 32) / 1.8);
		System.out.println(fah + " -> " + cel);
	}
}
