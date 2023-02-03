package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<String> wordList = new ArrayList<>();
		String startLetter = "";

		System.out.println("끝말잇기 시작");
		while (true) {
			if (startLetter.equals("")) {
				System.out.println("시작단어를 입력하세요.");
			} 
			else {
				System.out.println("\"" + startLetter + "\" 로 시작하는 단어를 입력하세요.");
			}

			String word = scan.nextLine();
			word = word.trim(); //할당 반드시해야 되
			word = word.replace(" ", ""); //할당 반드시해야 되

			if (word.length() < 3) { //()메소드 호출 /배열 String[] str = new String[3]; /str.length; 배열은 이렇게 되
				if (!word.startsWith(startLetter) || word.equals("포기")) {
					System.out.println("\"" + word + "\" 를 입력했습니다.");
					System.out.println("게임이 종료됩니다.");
					break;
				}
				System.out.println("\"" + word + "\"는 " + word.length() + "글자입니다. 3글자 이상 단어를 입력하세요.");

			} 
			else if (!word.startsWith(startLetter) || word.equals("포기")) { //indexOf(0)으로 대체 가능 /word에 null값은 x
				System.out.println("\"" + word + "\" 를 입력했습니다.");
				System.out.println("게임이 종료됩니다.");
				break;
			} 
			else {
				wordList.add(word);
				startLetter = word.substring(word.length() - 1); //제일 마지막 글자 가져온다

			}
		}

		System.out.println("입력한 단어들은");
		for (String word : wordList) {
			System.out.println(word);
		}
		System.out.println("입니다.");

	}

}
