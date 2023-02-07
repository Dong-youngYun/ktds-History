package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BigdataStream1 {
	
	public static List<TextVO> readTextFile() {
		String filePath = "C:\\Devs\\data\\bigdata\\10K.ID.CONTENTS";
		try {
			List<TextVO> list = Files.readAllLines(Paths.get(filePath))
					.parallelStream()
					.map((line) -> {
						String[] strArr = line.split("\t");
						TextVO vo = new TextVO();
						vo.setKey(strArr[0].trim());
						if (strArr.length >= 2) {
							vo.setValue(strArr[1].trim());
						}
						return vo;
					})
					.collect(Collectors.toList());
			return list;
		}
		catch (IOException ioe) {
			return new ArrayList<>();
		}
		
	}
	public static void main(String[] args) {
		List<TextVO> textList = readTextFile();
		System.out.println(textList.size());
	
		//8-1. 10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		long startTime = System.currentTimeMillis();
		//코드 작성
		System.out.println ("8-1 실행시간:" + (System.currentTimeMillis() - startTime));
		
		Optional<String> value = readTextFile().stream() //textList 대신 readTextFile()
										 .filter(vo -> vo.getKey().equals("12370584"))
										 .map(vo -> vo.getValue())
										 .findFirst();
		System.out.println(value.orElse("없음"));
		
		//8-2. (병렬) 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		startTime = System.currentTimeMillis();
		//코드작성
		value = readTextFile().parallelStream()
							  .filter(vo -> vo.getKey().equals("12370584"))
							  .map(vo -> vo.getValue())
							  .findFirst();
		System.out.println(value.orElse("없음"));
		
		System.out.println("8-2 실행시간: " + (System.currentTimeMillis() - startTime));
		
				
		//9. (병렬) 10K.ID.CONTENTS 파일에서 "7670637" 에 몇개의 단어가 있는지 출력
				
		//10. (병렬) 10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇 개인지 출력
				
		//11. (병렬) 10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇개인지 출력
				
		//12. (병렬) 10K.ID.CONTENTS 파일의 내용에서 내용에 "that" 이 포함된 글은 몇개인지 출력
				
		//13. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 6자리인 것은 몇 개인지 출력
		
		//14. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 7자리인 것은 몇 개인지 출력
		
		//15. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 9자리인 것은 몇 개인지 출력
	
	}
}
