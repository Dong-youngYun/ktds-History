package acp;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap <>();
		scores.put("Java", 100);
		scores.put("C", 90);
		scores.put("C#", 97);
		scores.put("Phython", 93);
		scores.put("Java", 40);// 중복된 데이터가 있을 경우 가장 마지막걸 출력
	System.out.println(scores); //List랑 같이 Refer타입이지만 Map은 내부에 String이 있어 메모리 주소가 아닌 데이터가 출력된다.
	System.out.println(scores.size());
		int JavaScore = scores.get("Java");
	System.out.println(JavaScore);
	
	boolean isContains = scores.containsKey("F"); //내가 찾으려는 key가 여기에 있니?
	System.out.println(isContains); //false 반환
	
	int fScore = 0;
	if(isContains) {
		fScore = scores.get("F");
	}
	System.out.println(fScore);
	
//	int FScore = scores.get("F"); //NullPointerException /Null을 int에게 반환 int는 Null값을 못가져 변환해서 숫자로 만들어 보려고 (Null.연산하려고) 하지만 안되 (Null.하면) NullPointerException
//	System.out.println(FScore); //
	System.out.println(scores.get("F")); //Null반환
	
	scores.remove("C");
	System.out.println(scores);
	
	scores.remove("F");
	System.out.println(scores); //그냥 지우는 거라 아무일도 일어나지 않는다.
	
	scores.clear();
	System.out.println(scores);//{}만 출력된다.
	}
}
