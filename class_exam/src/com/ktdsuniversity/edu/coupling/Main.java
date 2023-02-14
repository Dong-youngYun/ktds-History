package com.ktdsuniversity.edu.coupling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Iterable<String> iterable = new ArrayList<>(); //Iterable의 기능만
//		iterable.get(0);
		iterable.forEach(null);
		
		Collection<Integer> collection = new ArrayList<>(); //Iterable, collection의 기능만
//		collection.get(0);
		collection.forEach(null);
		
		//Sub class is a Super class
		List<String> list = new ArrayList<>();
		list.get(0);
		list.forEach(null);
		
		MemberManagement memberService = new EmployeeService(); //똑같이 EmployeeService 쓸거라면 인터페이스를 사용할 이유가 없다. (앞에는 부모 인터페이스)
		memberService.regist();
		memberService.unregist();
		memberService.updateMyInfo();
		
	}

}
