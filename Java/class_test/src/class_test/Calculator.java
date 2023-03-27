package class_test;

public class Calculator {

	public static void main(String[] args) {
		
		/*
		 * Primitive Type
		 *  byte, short, int, long
		 *  float, double
		 *  char, boolean
		 * 		 
		 * Reference Type
		 *  Primitive Type을 제외한 모든 타입
		 *  
		 *  변수의 생성 방법
		 *  Primitive Type
		 *   type name = value; (String에 한해서만 이런식으로 정의 할당 가능)
		 *   
		 *  Reference Type
		 *   type name = new Type();
		 */
		/*
		*String name = "윤동영";
		*String name2 = new String("윤동영");
		*System.out.println(name);
		*System.out.println(name2);
		*/
		ScoreCalculator scoreCalculator = new ScoreCalculator();
		scoreCalculator.getAverage();
		scoreCalculator.getGrade();
		//뒤에건 똑같이 쓰고 소문자로 컨트롤 스페이스로 간단히 가능 밑에건 .찍으면 제안나온다
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		temperatureConverter.toCel();
		temperatureConverter.toFah();
		
		
		
		
	}
	
}
