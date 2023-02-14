package acp;

public class Condition2 {
	
	public static void main(String[] args) {
		
		double avg = 325.3;
		String grade ="";
		
		if (avg >= 90) {
			grade ="A";
		}
		else if (avg >= 80) {
			grade ="B";
		}
		else {
			grade ="F";
		}
		System.out.println(grade);
	}

}
