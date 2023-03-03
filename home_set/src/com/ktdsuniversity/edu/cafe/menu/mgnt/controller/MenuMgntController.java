package com.ktdsuniversity.edu.cafe.menu.mgnt.controller;

public class MenuMgntController {
	
	public void printMenu() {
		System.out.println("\n============================\r\n"
				+ "1. 등록\r\n"
				+ "2. 수정\r\n"
				+ "3. 삭제\r\n"
				+ "4. 조회(1개)\r\n"
				+ "5. 조회(종목별로)\r\n"
				+ "6. 조회(전체)\r\n"
				+ "7. 종료\r\n"
				+ "============================\n");
	}
	
	public void printItemTypeMenu() {
		System.out.println("\n============================\r\n"
				+ "1. 커피\r\n"
				+ "2. 음료\r\n"
				+ "3. 티\r\n"
				+ "4. 디저트\r\n"
				+ "5. 뒤로가기\r\n"
				+ "============================\n");
	}
}
