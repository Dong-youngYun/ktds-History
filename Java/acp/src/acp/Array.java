package acp;

import java.util.List;

public class Array {
	
	public static void main(String[] args) {
		
	
	int[] scores = new int[4];
	
	 scores[0] = 100;
	 scores[1] = 90;
	 scores[2] = 97;
	 scores[3] = 93;
	int total = scores[0] + scores[1] +scores[2]+scores[3];
	
	 System.out.println(total); 
	 System.out.println(scores[0]); //메모리 주소가 나온다 ->배열은 레퍼런스 타입이다.
	 System.out.println(scores[1]); 
	 System.out.println(scores[2]); 
	 System.out.println(scores[3]); 
	
	}
}
