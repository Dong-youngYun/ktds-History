package acp;

import java.util.ArrayList;
import java.util.List;

public class Condition3 {

	public static void main(String[] args) {
		
		List<Integer> scores = new ArrayList<>();
		
		scores.add(100);
		scores.add(90);
		scores.add(80);
		scores.add(70);
		
		int sumResult = scores.get(0) +scores.get(1) + scores.get(2) + scores.get(3);
		double avg = sumResult / 4.0;
		String grade = ""; //null로 해도 되고 공백으로 해도 된다.
		
		if (avg >= 90) {
			grade= "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println(grade);
		
	}
	
}
