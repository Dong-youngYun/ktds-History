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
			List<TextVO> list = Files.readAllLines(Paths.get(filePath)).parallelStream().map((line) -> {
				String[] strArr = line.split("\t");
				TextVO vo = new TextVO();
				vo.setKey(strArr[0].trim());
				if (strArr.length >= 2) {
					vo.setValue(strArr[1].trim());
				}
				return vo;
			}).collect(Collectors.toList());
			return list;
		} catch (IOException ioe) {
			return new ArrayList<>();
		}

	}

	public static void main(String[] args) {
		List<TextVO> textList = readTextFile();
		System.out.println(textList.size());

		// 8-1. 10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		long startTime = System.currentTimeMillis();
		// 코드 작성
		System.out.println("8-1 실행시간:" + (System.currentTimeMillis() - startTime));

		Optional<String> value = readTextFile().stream() // 단일 처리 textList 대신 readTextFile()
				.filter(vo -> vo.getKey().equals("12370584"))
				.map(vo -> vo.getValue())
				.findFirst();
		System.out.println(value.orElse("없음"));

		// 8-2. (병렬) 10K.ID.CONTENTS 파일에서 "12370584" 의 내용을 출력
		startTime = System.currentTimeMillis();
		// 코드작성
		value = readTextFile().parallelStream()
				.filter(vo -> vo.getKey().equals("12370584"))
				.map(vo -> vo.getValue())
				.findFirst();
		System.out.println(value.orElse("없음"));

		System.out.println("8-2 실행시간: " + (System.currentTimeMillis() - startTime));

		// 9. (병렬) 10K.ID.CONTENTS 파일에서 "7670637" 에 몇개의 단어가 있는지 출력
		readTextFile().parallelStream()
					  .filter(vo -> vo.getKey().equals("7670637"))
//								  .map(vo -> vo.getValue().split(" ")) // Stream<String[]>
//			  					  .findAny(); // Optional<String[]>
//			  					   //String 배열이 0 배열의 길이 //타입의 첫글자가 대문자 무조건 reference /reference타입의 기본값은 null
//			 System.out.println(s.orElse(new String[0]));
				      .forEach(vo -> {
					String[] s = vo.getValue().split(" ");
					System.out.println(s.length);
				});

		// 10. (병렬) 10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇 개인지 출력
		// 기본값 null이 나올수도 " "이 나올수도있다 (" "는 데이터가 space찍혀서 만든게 있어서) / 문자열이 비어있다 , 할당되지
		// 않았다 를 동시에 검사 해야되
		// 우리는 텍스트 없는건 없다고 판단
		
		long a =readTextFile().parallelStream()
		              .filter(vo -> vo.getValue() == null || vo.getValue().trim().length() ==0 )
		              .map(vo -> vo.getKey())
		              .count();
		System.out.println(a);
		
		              
//		String abc = " ";
//		/**
//		 * abc = null => true
//		 * abc = "" => true
//		 * abc = " " => false /데이터가 있다고 판단하면 trim
//		 * abc = "aaa" => false
//		 */
//		boolean isEmpty1 = abc == null || abc.length() ==0; // " "은 1로 나온다
//		/**
//		 * abc = null => true
//		 * abc = "" => true
//		 * abc = " " => true /스페이스만 쭉 있을때 /이걸 비었다고 판단하면 trim
//		 * abc = "aaa" => false
//		 */
//		boolean isEmpty2 = abc == null || abc.trim().length() ==0;

//	    boolean isEmpty1 = abc.trim().length() == 0 || abc == null; //nullpointerException 발생  abc가 null값인데 null.하면 nullpointerException
//	    boolean isEmpty2 = abc == null || abc.trim().length() == 0; //앞에건 true라서 처리가능
//	    boolean isEmpty3 = abc == null && abc.trim().length() == 0; //앞에건 true abc가 null값인데 null.하면 nullpointerException발생
//	    boolean isEmpty3 = !(abc != null && abc.trim().length() > 0); //and연산의 비어있다 판단은 비어있지 않다를 가지고 검사

		// 11. (병렬) 10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇개인지 출력
		// space로 내용을 잘라서 그것의 길이
		long b = readTextFile().parallelStream()
					  .filter(vo -> vo.getValue() !=null && vo.getValue().trim().length() >0)
					  .filter(vo -> vo.getValue().split(" ").length == 2)
					  .map(vo -> vo.getKey())
					  .count();
		System.out.println(b);
		

		// 12. (병렬) 10K.ID.CONTENTS 파일의 내용에서 내용에 "that" 이 포함된 글은 몇개인지 출력
		// indexOf contains
		long c =readTextFile().parallelStream()
					  .filter(vo -> vo.getValue() !=null && vo.getValue().trim().length() >0)
					  .filter(vo -> vo.getValue().contains("that"))
					  .map(vo -> vo.getKey())
					  .count();
		System.out.println(c);
					  

		// 13. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 6자리인 것은 몇 개인지 출력
		// 문자열의 길이
		long d = readTextFile().parallelStream()
					  .filter(vo -> vo.getKey().length() == 6)
					  .map(vo -> vo.getKey())
					  .count();
		System.out.println(d);

		// 14. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 7자리인 것은 몇 개인지 출력
		long f = readTextFile().parallelStream()
				  .filter(vo -> vo.getKey().length() == 7)
				  .map(vo -> vo.getKey())
				  .count();
		System.out.println(f);

		// 15. (병렬) 10K.ID.CONTENTS 파일에서 글 번호가 9로 시작하는 모든 글들의 첫번째 단어만 출력 (없는 것도)
		  readTextFile().parallelStream()
					  	.filter(vo -> vo.getKey().startsWith("9"))
					  	.map(vo -> vo.getValue() == null? "" :vo.getValue())
					  	.map(desc -> desc.trim().contains(" ") ? desc.split(" ")[0] : "")
					  	.forEach(word -> {
					  		System.out.println("15-1. [" + word + "]");				
					  		});
		 
		  readTextFile().parallelStream()
		  				.filter(vo -> vo.getKey().startsWith("9"))
		  				.map(vo -> {
		  					if(vo.getValue() == null) {
		  						return "";//null이면 아무것도 없음
		  					}
		  					return vo.getValue().trim(); //null값이 아닌것 아직 문장
		  				})
		  				.map(desc -> {
		  					if (desc.trim().contains(" ")) { //갖고온게 문장
		  						return desc.trim().split(" ")[0]; //공백 짜른 단어들을 다 스트링 배열로 반환 split 나오면 배열로 반환한다 생각/ [0] 배열의 첫번째 단어
		  					}
		  					return ""; //null은 아닌데 문장내용이 없다
		  				})
		  				.forEach(word ->{
		  					System.out.println("15-2. [" + word + "]");
		  				});
		  
		  readTextFile().parallelStream()
			.filter(vo -> vo.getKey().startsWith("9"))
			.map(vo -> {
				if (vo.getValue() !=null && vo.getValue().trim().length() > 0) {
					return vo.getValue().trim().split(" ")[0];
				}
				return "";
			})
			.forEach(word ->{
				System.out.println("15-3. [" + word + "]");
			});
					  

		// 16. (병렬) 10K.ID.CONTENTS 파일에서 내용이 있으며 글 번호가 7로 시작하는 모든 글들의 첫 번째 단어만 출력
		  readTextFile().parallelStream()
					  .filter(vo -> vo.getValue() !=null && vo.getValue().trim().length() >0)
					  .filter(vo -> vo.getKey().startsWith("7"))
					  .map(vo -> vo.getValue().trim().split(" ")[0]) //한 단어만 있는 경우는 걸러지지가 않는다.
					  .forEach(vo ->{
						  System.out.println("16. [" + vo + "]");
					  });
					  
						  
					  

	}
}
