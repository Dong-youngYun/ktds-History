package acp;

import java.util.HashMap;
import java.util.Map;

public class Condition4 {

	public static void main(String[] args) {
		
		Map<String, Integer> subject = new HashMap<>();
		
		subject.put("math", 90);
		subject.put("phy", 80);
		subject.put("eng", 70);
		subject.put("prog", 60);
		
		int sumResult = subject.get("math") + subject.get("phy") + subject.get("eng") + subject.get("prog");
		double avg = sumResult / 4.0;
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
