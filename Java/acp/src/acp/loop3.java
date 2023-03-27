package acp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class loop3 {
	
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<>();
		Random random =new Random();
		for(int i = 0; i < 4; i++) {
			scores.add(random.nextInt(50) + 51);
		}
		int sum = 0;
		for(int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		double avg = (double)sum / scores.size();
		
		String result = "F";
		if(avg<=100 && avg>=90) {
			result = "A+";
		}
	}

}
