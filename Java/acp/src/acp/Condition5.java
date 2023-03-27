package acp;

public class Condition5 {
	
	public static void main(String[] args) {
		
		int[] scores = new int[4];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 70;
		
		int sumResult = scores[0] +scores[1] + scores[2] + scores[3];
		double avg = sumResult/4.0;
		String grade = "";
		
		if (avg >= 90) {
			grade ="A";
		}
		else if (avg >= 80) {
			grade ="B";
		}
		else if (avg >= 70) {
			grade ="C";
		}
		else if (avg >= 60) {
			grade ="D";
		}
		else {
			grade ="F";
		}
		System.out.println(grade);
		
	}

}
