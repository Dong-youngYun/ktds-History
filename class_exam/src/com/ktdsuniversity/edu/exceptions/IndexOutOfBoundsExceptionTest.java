package com.ktdsuniversity.edu.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		String string ="썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다. 2010년에 오라클이 썬 마이크로시스템즈를 인수하면서 Java의 저작권을 소유하였다.";
		List<String> wordList = new ArrayList<>(); //Arrays.asList 사용하면 배열로 바뀐다.
		wordList.addAll(Arrays.asList(string.split(" "))); //addAll ()안 리스트를 wordList에 다 추가해라
		
		if (wordList.size() >50) {
		String word = wordList.get(50);
		System.out.println(word);
		}
		
		try {
			String word = wordList.get(50);
			System.out.println(word);
		}
		catch(IndexOutOfBoundsException ioobe) {
			System.out.println("그런 인덱스는 없습니다.");
		}
	}
}
