package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
//중복을 제거하는 리스트
	public static void main(String[] args) {
		
		Set<String> strSet = new HashSet<>();
		
		//등록
		strSet.add("100");
		strSet.add("101");
		strSet.add("102");
		strSet.add("103");
		strSet.add("104");
		strSet.add("105");
		
//		for (String str: strSet) {
//			System.out.println(str);
//		}
		
		Iterator<String> iterStr = strSet.iterator();
		while (iterStr.hasNext()) { //다음거 있니 물어보는거 //while 다음 것이 있을때까지 자동 반복/ while 대신if면 계속 next 써줘야되
			System.out.println(iterStr.next()); //다음거 가져와
			
		}
		
		
		System.out.println(strSet.size());
		//같은 값은 다 무시
	}
	
}
