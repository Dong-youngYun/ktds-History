package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameTryCatch { //length 체크 예외 /시작글자 같은지 체크 예외

	public static void checkWord(String word, String startLetter) {//아래 word를 파라미터로 전달 (범위가 완전히 달라서) startLetter는 잘못된 단어체크
		if (!word.startsWith(startLetter) || word.equals("포기")) { //자리수 체크
			throw new WrongWordException(); //호출한 쪽에 던짐 class가 아니라
		}
		else if (word.length() <3) { //잘못된 단어 입력했는지 체크
			throw new InvalidWordException();
		}
	}
	
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
			
			try {
				checkWord(word, startLetter);
				wordList.add(word);
				startLetter = word.substring(word.length()-1);
			}
			catch (InvalidWordException iwe) {
				System.out.println(word + "는 " +word.length() + "자리 단어입니다.");
				System.out.println("3자리 이상의 단어를 입력하세요");
				
			}
			catch (WrongWordException wwe) {
				System.out.println(word + " 을 입력했습니다. 게임을 종료합니다.");
				break;
			}
		}

		System.out.println("입력한 단어들은"); //break 없으면 error
		for (String word : wordList) {
			System.out.println(word);
		}
		System.out.println("입니다.");

	}

}
