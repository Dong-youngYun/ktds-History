package com.ktdsuniversity.edu.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ThrowNewTest {
//이미 가입된 id입니다. 라고 예외를 던지고 싶다.
	static Map<String, String> memberMap = new HashMap<>();
	
	public static boolean isCreate(String memberID) {
		
		if (memberMap.containsKey(memberID)) {
//			RuntimeException memberIDException = new DuplicateMemberIDException(memberID);
//			throw memberIDException;
			throw new DuplicateMemberIDException(memberID); //위 두줄의 코드를 하나로 합친 것 / throw new 생성자
		}
		
		memberMap.put(memberID, "생성" + memberID);
		return memberMap.containsKey(memberID); //memberID 가 잘 들어갔는지 확인
	}
	
	public static void main(String[] args) {
		boolean isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		System.out.println("회원 가입이 완료되었습니다.");
	}
	
}
