package com.ktdsuniversity.edu.exceptions;

import java.util.HashMap;
import java.util.Map;

public class NullPointerExceptionTest {

	public static String getName(int nameLength) {
		
		if(nameLength == 2) {
			return "둘리";
		}
		else if (nameLength == 3) {
			return "이순재";
		}
		else if (nameLength == 4) {
			return "선우용녀";
		}
		
		return null;
	}
	//NullPointerException을 피하기 위해 공통된 메소드를 만들어서 회피
	public static String nullToDefault(String string, String defaultValue) {
		return string == null ? defaultValue : string;
	}
	
	public static String nullToEmpty(String string) {
		return string == null ? "":string; //null이면 공백을 주고 아니면 string값을 달라
	}
	
	public static void main(String[] args) {
		
		String name = getName(6);
//		if (name == null) {
//			name = "";
//		}
		boolean isAStart = name.startsWith("A"); //NullPointerException의 발생 위치 .앞에 있는게 예외발생지점
		System.out.println(isAStart);
		
		Map<String, String> nameMap = new HashMap<>();
		nameMap.put("김", "김둘리");
		nameMap.put("이", "이둘리");
		nameMap.put("박", "박둘리");
		nameMap.put("최", "");
		
		//Validation 코드 (검증코드)
		//Runtime Exception은 최대한 데이터 소실없이 하기위해 어떻게든 피해야되 /Runtime은 try catch 쓰는 순간 데이터 소실
		if (nameMap.containsKey("최") && nameMap.get("최").length() > 0) { //"최"가 있냐
			String fullName = nameMap.get("최");
			String lastName = fullName.substring(0,1);
			System.out.println(lastName);
		}
		
		String fullName = nullToEmpty(nameMap.get("최"));
		if (fullName.length() > 0) { // length 고려 안되면 OutOfBounds 예외 발생/ fullName != null && 삭제 
			String lastName = fullName.substring(0, 1); //null이 아닐때만 해라
			System.out.println(lastName);
		}
		else {
			System.out.println("데이터가 없습니다.");
		}
		
		
//		String fullName = nameMap.get("최"); //Map에서 존재하지 않는 키를 주면 Null이 온다.
////		if (fullName == null) { 
////			fullName = "";
////		}
//		String lastName = fullName.substring(0, 1);
//		System.out.println(lastName);
	}
	
}
