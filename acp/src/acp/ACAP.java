package acp;

public class ACAP {

	public static void main(String[] args) {
		
		int[] scores = new int[4];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 70;
		
		int sumResult = scores[0] + scores[1] +scores[2] +scores[3];
		
		double avg = sumResult / 4.0;
		
		System.out.println(avg);
				
	}
	
}
