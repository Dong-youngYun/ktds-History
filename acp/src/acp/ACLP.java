package acp;

import java.util.ArrayList;
import java.util.List;

public class ACLP {

	public static void main(String[] args) {
		
		List<Integer> subject = new ArrayList<>();
		
		subject.add(100);
		subject.add(90);
		subject.add(80);
		subject.add(70);
		
		int sumResult = subject.get(0) + subject.get(1) + subject.get(2) + subject.get(3);
		
		double avg = sumResult / 4.0;
		
		System.out.println(avg);
		
		
		
		
	}
	
}
