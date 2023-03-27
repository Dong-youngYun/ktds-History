package acp;

import java.util.HashMap;
import java.util.Map;

public class ACMP {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("math", 100);
		scores.put("phy", 90);
		scores.put("eng", 80);
		scores.put("pro", 70);
		
		int sumResult= scores.get("math") + scores.get("phy") + scores.get("eng") + scores.get("pro");
		
		double avg = sumResult/4.0;
		
		System.out.println(avg);
		
	}
	
}
