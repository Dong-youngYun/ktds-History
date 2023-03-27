package acp;

public class Condition8 {

	public static void main(String[] args) {
		
		double avg = 70;
		boolean a = avg <=100 && avg >=95;
		boolean a1 = avg <=94 && avg >=90;
		boolean b = avg <=89 && avg >=85;
		boolean b1 = avg <=84 && avg >=80;
		boolean c = avg <=79 && avg >=70;
		boolean d = avg <=69 && avg >=60;

		String grade ="F"; //애초에 F를 넣어서 else없이 사용
		
		if(a) {
			grade = "A+";
		}
		else if (a1) {
			grade = "A";
		}
		else if (b) {
			grade = "B+";
		}
		else if (b1) {
			grade = "B";
		}
		else if (c) {
			grade = "C";
		}
		else if (d) {
			grade = "D";
		}
		
		System.out.println(grade);
		
		
	}
	
}
