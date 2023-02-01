package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("Java", 100);
		map.put("C", 90);
		map.put("C#", 80);
		map.put("Python", 70);
		map.put("Languages",  new ArrayList<>());
		
		Set<String>keys = map.keySet(); //key를 반환 key를 리스트로 변환시키기 좋은 Set
		for (String key: keys) {       //key도 중복 안되 set도 중복 안되기 떄문
			System.out.println(key + " => " +map.get(key));   //이제 key를 아니까 value도 볼수있다.
		}
		
		System.out.println("Java\t" + map.get("Java"));
		System.out.println("C\t" + map.get("C"));
		System.out.println("C#\t" + map.get("C#"));
		System.out.println("Python\t" +map.get("Python"));
		System.out.println("Scala\t" +map.get("Scala"));
		
		//!true == false
		//!false == true !-not의미 !"".equals () 이런것도 되 !(1==2) 다르냐? 1!=2
		//파이선이 없냐? boolean true false로 알려준다
		
		if (!map.containsKey("Python")) { //containskey null이 오냐 안오냐로 판단한다.
			map.put("Python", 100);
			//없으면 넣어라
		}
		System.out.println("Python\t" +map.get("Python"));
		//삭제
		map.remove("C#");
		//map.remove(key, value) key가 이값을 가지면 지워라 (별로 안써, 나머진 전혀 안써)
		System.out.println("C#\t" + map.get("C#"));
		//개수
		System.out.println(map.size());
		
		//key는 인티저를 쓸거고 value는 리스트 스트링으로 쓰겟다.
		//순서는 보장이 안된다. 직접해줘야되
		//Map 은 2번 지우면 1,3,4가 된다. List는 2번지우면 1,2,3이 된다.
		//텍스트 분석할떄 잘 쓰인다.
		Map<Integer, List <String>> matrix = new HashMap<>();
		
	}
}
