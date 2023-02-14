package acp;

public class Condition7 {
	
	public static void main(String[] args) {
		
		int age = 2;
		int money = 40_000;
		boolean a =age> 12;
		boolean b = money > 18_000;
		
		if (a&&b) {
			System.out.println("관람가능");
		}
		else {
			System.out.println("관람불가");
		}
	}

}
