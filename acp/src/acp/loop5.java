package acp;

import java.util.Scanner;

public class loop5 {

	public static void grade2() {
		// 실습예제2번 과목개수를 4.0이런게 아니라 배열의 length나 List의 size를 사용
		int[] scores = new int[4];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 70;

		int sum = 0;
		for(int score: scores ) {
			sum += score;
		}

		double avg = sum / scores.length;
		String grade = "F";

		if (avg <= 100 && avg >= 95) {
			grade = "A+";
		} else if (avg <= 94 && avg >= 90) {
			grade = "A";
		} else if (avg <= 89 && avg >= 85) {
			grade = "B+";
		} else if (avg <= 84 && avg >= 80) {
			grade = "B";
		} else if (avg <= 79 && avg >= 70) {
			grade = "C";
		} else if (avg <= 69 && avg >= 60) {
			grade = "D";

		}
		System.out.println(grade);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		while (true) {

			String text = scan.nextLine();
			if (text.equals("quit")) {
				break;
			} else if (text.equals("keep")) {
				grade2();
			}

		}

	}

}
