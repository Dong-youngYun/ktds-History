package acp;

import java.util.Random;

public class loop7 {

	public static void main(String[] args) {

		int[] a = new int[50];
		Random random = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(60) + 1; // 60이면 0~59 그래서 +1 1~60

		}
		for (int s = 0; s < a.length; s++) {

			if (a[s] % 3 == 0 && a[s] != 0) {

				System.out.println(a[s]);
			}

		}
	}

}
