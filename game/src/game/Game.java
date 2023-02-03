package game;

import java.util.Arrays;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		
		String str = "       값 값 값        ";
		// 문자열에서 좌우 공백 제거하기 .trim
		str = str.trim(); //str변수에 재할당 재할당을 해줘야만 변경이된다.
		System.out.println("변경된 값은 [" + str +"] 입니다."); //대괄호는 대괄호가 값사이에 공백이 있는지 확인하기 위해 /string 사이 공백은 못지워
		
		// 문자열에서 텍스트 변경하기 .replace / .replaceAll
		str = str.replace(" ", "_"); //띄어쓰기를 언더바로 charsequence - stream이다. 
		System.out.println("변경된 값은 [" + str +"] 입니다.");
		
		str = str.replaceAll("_", "-"); // _를 -로 바꿈/replace 와 replaceAll의 차이 정규표현식 쓸수 있냐없냐의 차이 replaceAll 정규표현식 가능
		System.out.println("변경된 값은 [" + str +"] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>"; //str재정의 
		str = str.replaceAll("[가-힣]", ""); //한글을 공백으로/정규표현식 가부터 힣까지가 한글로 만들수 있는 처음부터 끝 -> 모든 한글을 뜻한다. 
		System.out.println("변경된 값은 [" + str +"] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다.</html>"; //str재정의 
		str = str.replaceAll("[^가-힣]", "");//띄어쓰기조차 없는 한글만 가져와 /[]는 범위지정자 ^는 이것 빼고(가-힣)빼고
		System.out.println("변경된 값은 [" + str +"] 입니다."); 
		
		str = "<html>HTML 문서를 작성합니다.</html>"; //str재정의 
		str = str.replaceAll("[^a-zA-Z]", "");//띄어쓰기조차 없는 영어만 가져와 //모든영어 지정 [a-zA-Z] 
		System.out.println("변경된 값은 [" + str +"] 입니다."); 
		
		str = "핸드폰 번호는 010-1234-5678 입니다.";
		str = str.replaceAll("[^0-9]", ""); //숫자만 가져와 [0-9]
		System.out.println("변경된 값은 ["+ str +"]입니다.");
			
		// 문자열에서 특정단어로 시작하는지 확인하기 .indexOf
		str = "자전거"; //인덱스 번호 리턴 /자바 1.6이하이면 startWith는 못쓰고 indexOf 써야되
		System.out.println("자 의 자리: " + str.indexOf("자")); //시작하는 것을 찾는 건 0번인지 확인하면 된다.
		System.out.println("자 의 자리: " + str.indexOf("전"));
		System.out.println("자 의 자리: " + str.indexOf("거"));
		System.out.println("자 의 자리: " + str.indexOf("기")); //-1은 없다는 뜻
		
		if(str.indexOf("자") == 0) {
			System.out.println("자전거는 \"자\"로 시작합니다.");
		}
		
		// 문자열에서 특정단어로 시작하는지 확인하기 .startsWith
		System.out.println("자전거가 \"자\"로 시작하나요? " + str.startsWith("자"));
		System.out.println("자전거가 \"전\"로 시작하나요? " + str.startsWith("전"));
		System.out.println("자전거가 \"거\"로 시작하나요? " + str.startsWith("거"));
		
		// 문자열에서 특정단어로 끝나는지 확인하기 .lastIndexOf
		str = "기러기";
		System.out.println("기러기 \"기\"의 자리는? (indexOf) " + str.indexOf("기")); //첫번째로 만나는 "기"
		System.out.println("기러기 \"기\"의 자리는? (lastIndexOf) " + str.lastIndexOf("기")); //마지막으로 만나는 "기"
		System.out.println(str.length());
		System.out.println("기러기는 \"기\"로 끝나나요? " + (str.lastIndexOf("기") == str.length() -1));//3에서 -1을 하면 기러기가 가지고 있는 마지막 index번호가 나온다.
		
		// 문자열에서 특정단어로 끝나는지 확인하기 .endsWith
		System.out.println("거중기는 \"거\"로 끝나나요? " + str.endsWith("거"));
		System.out.println("거중기는 \"중\"로 끝나나요? " + str.endsWith("중"));
		System.out.println("거중기는 \"기\"로 끝나나요? " + str.endsWith("기"));
		
		// 문자열에 특정 단어 및 글자가 포함되어 있는지 확인하기 .indexOf /-1이 아니거나 더 크면 된다.
		str = "자전거";
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? " + (str.indexOf("자") > -1));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? " + (str.indexOf("전") > -1));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? " + (str.indexOf("거") > -1));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? " + (str.indexOf("기") > -1));		
		
		// 문자열에 특정 단어 및 글자가 포함되어 있는지 확인하기 .contains
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? " + str.contains("자"));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? " + str.contains("전"));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? " + str.contains("거"));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? " + str.contains("기"));
		
		// 문자열 자르기 .substring(p)
		str = "2023-02-03"; //index를 알아야되
		String day =str.substring(8); //8부터 끝까지 잘라라
		System.out.println(day);
		
		String date =str.substring(5);
		date = date.replace("-", "");
		System.out.println(date);
		
		// 문자열 자르기 .substring(p, p)
		str = "2023-02-03 11:01:15"; // 시작 index는 그대로 두고 내가 자르려는 end index의 +1 해줘야되
	   //index 0123456789012345678
		String year = str.substring(0, 4);
		String hour = str.substring(11, 13);
		String minute = str.substring(14, 16);
		String second = str.substring(17, 19);
		System.out.println(year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		// 문자열 특정 단어 및 기호 등으로 자르기 .split
		str = "자전거 , 저중기 , 기러기";
		//      0       1      2
		List<String> wordList = Arrays.asList(str.split(",") ) ; //배열이 List로 바뀐다 Arrays.asList String 배열을 String List로
		for (String word: wordList) {
			System.out.println(word.trim()); //띄어쓰기 지워
		}
		
		str = "2023-02-22 11:22:34";
	//숫자만       0   1  2  3  4  5
		List<String> dateList = Arrays.asList( str.split("[- :]") ); //subString 안쓰고 index만 뽑아와서 사용할수 있다.
		for(String dateItem : dateList) {
			System.out.println(dateItem);
		}
		
		String url = "https://www.google.co.kr";
//                    012345678901234567890123
		System.out.println(url.indexOf("://")); //:가 시작되는 위치
		
		String protocol = url.substring(0, url.indexOf("://")); //:가 시작되는 위치부터 잘라라
		System.out.println("Protocol: " + protocol);
		
		String subDomain = url.substring( url.indexOf("://") + "://".length(), url.indexOf(".")); // ://www 나옴 / ://문자의 길이 만큼 더해주자 www만 출력
		System.out.println("SubDomain: " + subDomain);
		
		String domain = url.substring( url.indexOf(subDomain) + subDomain.length() + 1); //www.google.co.kr /subDomain 더해줘 .goolge.co.kr  .때매 +1
		domain = domain.substring(0, domain.indexOf(".")); //url이 아니라 domain에서 . 까지
		System.out.println("Domain: " + domain);
		
		String companyCode = url.substring(url.indexOf(domain) + domain.length() +1);
		companyCode = companyCode.substring(0, companyCode.indexOf("."));
		System.out.println("Company code: " + companyCode);
		
		//lastIndexOf 해서 마지막 .를 주면 된다.
		String nationCode = url.substring(url.lastIndexOf(".") + 1);
		System.out.println("Nation code: " + nationCode);
		
	}
	
}
