package com.ktdsuniversity.edu.recursive;

import java.io.File;

public class Recursive { //재귀호출 /위험부담이 커 /자기가 자기를 호출해서 스스로를 탐색할 수 있도록 하는것

	public void recursive() {
		System.out.println("실행중....");
		recursive();
	}
	
	public void readFile(File file) {
		
		File [] fileList = file.listFiles();//파일 타입의 배열에 담아줘
		
		for (File file2 : fileList) { //foreach crtl space
			System.out.println(file2.getAbsolutePath()); //파일 경로
			if (file2.isDirectory()) { //반복중인 개체가 폴더라면 보여줘
				readFile(file2); // 폴더 밑의 하위 파일들을 보여줘
				
//				File[] fileList2 = file2.listFiles();
//				for (File file3 : fileList2) {
//					System.out.println(file3.getAbsolutePath()); //계층구조 탐색시 재귀호출 안하면 이런 코드가 끝도 없이 나온다
//				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Recursive recursive = new Recursive();
//		recursive.recursive();
		
		recursive.readFile(new File("C:\\Devs"));
	}
	
}
