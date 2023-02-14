package com.ktdsuniversity.edu.reference;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>(); //메인에서 List를 만든다
		
		ListHelper listHelper = new ListHelper(); //메인에서 listHelper로 참조
		listHelper.setIntList(intList);
		
		listHelper.addInteger(1);
		listHelper.addInteger(2);
		listHelper.addInteger(3);
		listHelper.addInteger(4);
		listHelper.addInteger(5);
		listHelper.addInteger(6);
		
		List<Integer> list = listHelper.getIntList(); //같은 메모리주소 1000번에 add
		list.add(7); //내가 가진 메모리를 전달하는 것 그래서 똑같은 메모리를 공유하는 것 ->객체참조
		list.add(8);
		list.add(9);
		
		int size = listHelper.getSize();
		System.out.println(size);
	}

}
