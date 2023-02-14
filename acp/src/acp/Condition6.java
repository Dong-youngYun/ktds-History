package acp;

public class Condition6 {
	
	public static void main(String[] args) {
		
		double avg = 90.212;
		int dayoff = 0;
		boolean result = avg>90;
		boolean result2 = dayoff == 0;
		String grade = "";
		
		if(result && result2) {
			grade = "A";
		}
		else {
			grade = "F";
		}
		System.out.println(grade);
	}

}
