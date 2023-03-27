package hello_java;

/**
 * 섭씨를 화씨로 변경한다.
 * 
 * @author User
 *
 */
public class CelToFah {
	/**
	 * 섭씨를 화씨로 변경한다.
	 */
	public static void toFah() {
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
	public static void toCel() {
		
		double fah =87.6;
		/*
		 * 화씨를 섭씨로 변경해 cel 변수에 할당 후 출력
		 */
		// cel = ( (int) fah -32 )/(int) 1.8;
		//밑에서 cel에 int가 붙는 이유? 변수선언
		int cel = (int) ((fah - 32) / 1.8);
		System.out.println(fah + " -> " + cel);


	}

	/**
	 * 4과목의 평균을 계산한다.
	 */
	public static void getAvg() {
		int subjectA = 100;
		int subjectB = 90;
		int subjectC = 80;
		int subjectD = 70;
		int sum = subjectA + subjectB + subjectC + subjectD;

		double avg = sum / 4.0;
		System.out.println("평균은? " + avg);

	}

	public static void main(String[] args) {
//메소드 호출, 코드가 심플해지고 코드의 의미를 파악하기 쉬워진다. 도큐먼트 코멘트도 달아놔서 마우스 올리면 보여준다.
//메인코드가 제일 아래에 위치		
		System.out.println("시작");
		toFah();
		
		toCel();
		
		getAvg();
		System.out.println("끝");

	}
}
