package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballStream1 {

	public static List<AllStarFullVO> readAllStarFull() {
		try {
			List<AllStarFullVO> list = Files.readAllLines(Paths.get("C:\\Devs\\data\\baseball\\core\\AllstarFull.csv"))//""치고 경로쳐야 \\적용	
					.stream()
					.skip(1) // 읽어들인 것에서 첫번째 라인은 건너뛰어라
//					.peek(System.out::println) // 에러 발생시 문제되는 곳을 임시로 확인하려고 peak /data가 방대해서 디버깅으로 보기힘들어
					.map( (line) -> { //string을 받아서 형태를 바꿔줄거야 ,기준으로 잘라
						String[] strArr = line.split(","); //stream을 완성하기 전까진 계속 빨간줄
						AllStarFullVO vo =new AllStarFullVO();
						vo.setPlayerID(strArr[0]);
						vo.setYear(strArr[1]);
						vo.setGameNum(Integer.parseInt(strArr[2]));
						vo.setGameID(strArr[3]);
						vo.setTeamID(strArr[4]);
						vo.setLgID(strArr[5]);
						vo.setGp(Integer.parseInt(strArr[6]));
						if (strArr.length == 8) {
							vo.setStartingPos(Integer.parseInt(strArr[7]));							
						}
						else {
							vo.setStartingPos(0);
						}
						return vo;
					} )
					.collect(Collectors.toList());
			return list;
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static void main(String[] args) {
		List<AllStarFullVO> list = readAllStarFull();
		
		list.stream()//리스트를 스트림화
			.filter( (vo) -> vo.getYear().equals("1933") )//중간함수
			.forEach( (vo) -> { //최종함수 /foreach는 할당(리턴)하지 않는다.
				System.out.println(vo.getPlayerID());
				System.out.println(vo.getYear());
			} );
		
		List<AllStarFullVO> playIn1933 = list.stream()
											 .filter( (vo) -> vo.getYear().equals("1933") )
											 .collect(Collectors.toList());
		
		AllStarFullVO vo = list.stream()
							   .filter( (vo1) -> vo1.getYear().equals("1933") )
							   .findFirst()// 최종함수 첫번째거 가져와/ 데이터가 있을수도 없을수도 있으니까 optional
							   .orElse(new AllStarFullVO()); // 데이터가 없으면 (null) new AllStarFullVO()를 리턴해라  optional의 메소드
		System.out.println(vo.getPlayerID());
		
		//연도에 관계없이 playerID가 f로 시작하는 모든 데이터 출력
		System.out.println("------------------------------------------------------------");
		
		list.stream()
			.filter( (allStarVO) -> allStarVO.getPlayerID().toUpperCase().startsWith("F") )
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
			});
		
		list.stream() //필터는 데이터를 많이 지울수 있는것 먼저
			.filter((allStarVO) -> allStarVO.getYear().equals("2004") ) //필터 개수는 제한 없음
			.filter((allStarVO) -> allStarVO.getTeamID().equals("TEX"))
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
			});
		
		list.stream()
			.filter((allStarVO) -> allStarVO.getStartingPos()==0)
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
			});
		
		list.stream()
			.filter((allStarVO) -> allStarVO.getGp()==0)
			.filter((allStarVO) -> allStarVO.getTeamID().equals("NYA"))
			.filter((allStarVO) -> allStarVO.getPlayerID().toUpperCase().contains("FO"))
			.forEach((allStarVO) -> {
				System.out.println(allStarVO.getPlayerID());
				System.out.println(allStarVO.getYear());
				System.out.println(allStarVO.getTeamID());
			});
		
		System.out.println("------------------------------------------------------------");
		
		List<String> playerNameList = list.stream()
										  .map((allStarVO) -> allStarVO.getPlayerID()) //allStarVO 하나 줄테니까 내가 원하는 타입으로 리턴시켜줘 list -> String으로 / playerID의 타입은 String이라서
										  .distinct() //맵을 가져와야 distinct가 의미가 있어 /중복제거 
										  .sorted() //정렬 정렬하고 중복제거는 연산의 낭비
										  .collect(Collectors.toList()); //중복이 제거된것 가져와 리스트에 집어넣어
											
		playerNameList.forEach(System.out::println);
		
		//starting pos 4인 데이터들의 playerid만 추출 그리고 중복제거후 정렬
		list.stream()
			.filter((allStarVO) -> allStarVO.getStartingPos() == 4) //crtl z 반대는 crtl y / alt 좌우는 직전 편집 영역으로/ 단어 선택 crtl +K 같은 글자 다음영역 crtl + shift +k 이전영역
			.map((allStarVO) -> allStarVO.getPlayerID()) //맵을 위에 쓰면 타입이 String이 되는데 getStartingPos은 int다 or /String인 id만 가져와서 pos가 없어
			.distinct()
			.sorted()
			.forEach((allStarVO) -> {
				System.out.println(allStarVO);
			});
		
		//game num이 0이 아닌 것 추출 해서 출력
		List<AllStarFullVO> notNum = list.stream()
										 .filter( (vo3) -> vo3.getGameNum()!=0 )
										 .collect(Collectors.toList());
		
		notNum.forEach(vo3 -> {
			System.out.println(vo3.getPlayerID());
			System.out.println(vo3.getGameNum());
		});
		
		// game num이 0인 것 추출해서 출력
		List<AllStarFullVO> gameNum0 = list.stream()
										   .filter( (vo4) -> vo4.getGameNum()==0 )
										   .collect(Collectors.toList());
		gameNum0.forEach(vo4 -> {
			System.out.println(vo4.getPlayerID());
			System.out.println(vo4.getGameNum());
		});
		
		//1950년대 선수 출력
		list.stream()
			.filter((allStarVO) -> allStarVO.getYear().startsWith("195"))
			.map((allStarVO) -> allStarVO.getPlayerID())
			.forEach((System.out::println));
		
		//2000년대 BOS 팀의 선수 이름을 중복제거한 후 출력하세요.
		list.stream()
			.filter((allStarVO) -> allStarVO.getYear().startsWith("200"))
			.filter((allStarVO) -> allStarVO.getTeamID().equals("BOS"))
			.map((allStarVO) -> allStarVO.getPlayerID())
			.distinct()
			.forEach((System.out::println)); 
		
		//1937년 DET 팀의 선수 중 첫번째 선수 이름을 출력하세요.
		AllStarFullVO ad = list.stream() //첫번째 것만 가지고 온거니까 list가 아니야
			.filter((allStarVO) -> allStarVO.getYear().equals("1937"))
			.filter((allStarVO) -> allStarVO.getTeamID().equals("DET"))
			.findFirst()
			.orElse(new AllStarFullVO());
		System.out.println(ad.getPlayerID());
		
		
//		List<AllStarFullVO> vo2 =list.stream()
//				              .filter( (vo3) -> vo3.getPlayerID().startsWith("f") )
//				              .collect(Collectors.toList());
//		System.out.println(vo2.get);
		
		//		System.out.println(list.size());
	}

}
