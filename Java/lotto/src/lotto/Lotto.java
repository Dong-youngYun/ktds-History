package lotto;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lottoArray = new int[7];
		lottoArray[0] = 5;
		lottoArray[1] = 15;
		lottoArray[2] = 27;
		lottoArray[3] = 34;
		lottoArray[4] = 36;
		lottoArray[5] = 41;
		lottoArray[6] = 42;
		
		
		//전통적인 for
		for (int index = 0; index < lottoArray.length; index +=1) {
			//반복 문장
			System.out.println("index: " + index + " = " + lottoArray[index]);
		}
		//성능이 빠른 foreach
		for (int number: lottoArray) {
			System.out.println("번호는 " + number);
		}
		
		int index =0;
		//while (i < lottoArray.length) {
		//	System.out.println("while index:" + i + "=" +lottoArray[i]);}
			
	
	
		String string = "26. 대대전술단은 1개 전차중대(탱크 10대), 3개 기계화 보병중대(장갑차 40대), 1개 대전차중대와 3개의 포병중대(자주포나 다연장로켓 운영), 1개 방공중대의 편제로 구성이 됨. \r\n"
				+ "[출처] 러시아 vs 우크라이나 전쟁 근황|작성자 메르";
		//int len = string.length(); //단어의 길이를 알수 있다. ex) 3글자 이상만 출력해라
		
		String[] wordArray = string.split(" ");
		//공백을 기준으로 문자 분리
		System.out.println(wordArray[0]);
		System.out.println(wordArray[1]);
		System.out.println(wordArray[2]);
		System.out.println(wordArray.length);
		for ( int i = 0; i < wordArray.length; i +=1) {
			int len = wordArray[i].length();
			if (len >3) {
				System.out.println(wordArray[i]);
				
			}
		}
		
		/*
		 * //홀수 
		 * for (int i = 0; i<100; i+=1) 
		 * { if(i % 2==1) { 
		 * System.out.println("홀수: " + i); 
		 * }
		 *  } 
		 * //짝수 
		 * for (int i=0; i <100; i +=1) { 
		 * if(i % 2==0) {
		 * System.out.println("짝수: " + i); 
		 * } 
		 * }
		 */
	}
}
