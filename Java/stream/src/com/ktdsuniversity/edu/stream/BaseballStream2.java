package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseballStream2 {

	public static List<AllStarFullVO> readAllStarFull() {
		try {
			List<AllStarFullVO> list 
			= Files.readAllLines(Paths.get("C:\\Devs\\data\\baseball\\core\\AllstarFull.csv"))//""치고 경로쳐야 \\적용	
					.stream()
					.skip(1) // 읽어들인 것에서 첫번째 라인은 건너뛰어라
//					.peek(System.out::println) // 에러 발생시 문제되는 곳을 임시로 확인하려고 peak /data가 방대해서 디버깅으로 보기힘들어
					.map( (line) -> { //stream을 받아서 형태를 바꿔줄거야 ,기준으로 잘라
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
		
		//1. 1933년 NYA팀의 세 번째 선수의 playerID를 출력. //엑셀 Alt D F F 필터
		Optional<String> playerID = list.stream() //findFirst가 optional을 반환시킨다 해서 Optional로 받는다.
										.filter(vo -> vo.getYear().equals("1933"))
										.filter(vo -> vo.getTeamID().equals("NYA"))
										.map(vo -> vo.getPlayerID())
										.skip(2)
										.limit(1)
										.findFirst();
		
		System.out.println(playerID.orElse("없음"));
		
		//스트림의 제네릭이 어떻게 변화하는지
		//2. 1700년 NYA팀의 세번째 선수의 playerID를 출력 //filter map vo에 마우스 올려보면 타입을 확인할 수 있다.
		Stream<AllStarFullVO> listStream = list.stream(); //stream();을 해서 데이터형태가 Stream<AllStarFullVO>로 바뀐다. Stream에서는 우리가 데이터 확인 할 수 없다.
		Stream<AllStarFullVO> playersIn1700 =listStream.filter(vo -> vo.getYear().equals("1700"));//AllStarFullVO타입의 인스턴스 vo전달
		Stream<AllStarFullVO> playersInNYA = playersIn1700.filter(vo -> vo.getTeamID().equals("NYA"));
		Stream<String> playersId = playersInNYA.map(vo -> vo.getPlayerID()); //playerID의 타입이 String이라 Stream<AllStarFullVO>에서 Stream<String>으로 바뀐다.
		Stream<String> skipedPlayersID = playersId.skip(2);
		Stream<String> limitedPlayersID = skipedPlayersID.limit(1);
		Optional<String> playerId = limitedPlayersID.findFirst(); //findFist는 Optional
		System.out.println(playerId.orElse("없음")); //데이터가 없으니 .get쓰면 에러 //데이터 있으면 playerId주고 없으면 없음을 달라
			
		//3. 1934년 CHA 팀에서 startingPos가 8인 선수의 playerID 출력
		Optional<String> play = list.stream()
									.filter(vo -> vo.getYear().equals("1934"))
									.filter(vo -> vo.getTeamID().equals("CHA"))
									.filter(vo -> vo.getStartingPos() == 8)
									.map(vo -> vo.getPlayerID())
									.findFirst(); //optional로 받아서  orElse(); 쓰면 에러난다.
									//orElse는 String을 리턴해서 타입이 맞지않아 Optional을 지우고 String으로 바꿔주면 되
		System.out.println(play.orElse("없음"));
			
		//4. 1934년 CHA 팀에서 startingPos가 8인 두 번째 선수의 playerID를 출력
		String s = list.stream()
			.filter(vo -> vo.getYear().equals("1934"))
			.filter(vo -> vo.getTeamID().equals("CHA"))
			.filter(vo -> vo.getStartingPos() == 8)
			.map(vo -> vo.getPlayerID())
			.skip(1)
			.limit(1)
			.findFirst()
			.orElse("없음");
		System.out.println(s);
		
		//5-1. 1933년에 출전한 TeamID별 playerId를 모두 출력(group) //groupingBy의 타입은 Map grouping의 기준타입이 key가 된다.
		Map<String, List<AllStarFullVO>> teamMap1 =list.stream()
			.filter(vo -> vo.getYear().equals("1933"))
			//.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));//collect stream의 데이터를 리스트로 바꿔준다.
		      .collect(Collectors.groupingBy(vo -> vo.getTeamID()));
		//groupingBy 기준을 하나주면 맵데이터를 만들어준다. 무조건 Map의 구조
		System.out.println(teamMap1);
		
		teamMap1.forEach((teamId, players) -> {
			players.stream()
					.map(vo -> vo.getPlayerID())
					.forEach((playerId2) -> {
						System.out.println("5-1." + teamId + " > " + playerId2);
					
					});
		
		
//		teamMap1.forEach((teamId, players) ->{
//			for(AllStarFullVO player: players) {//value가 리스트니까 한번더 반복
//				System.out.println("5-1." + teamId + ">" +player.getPlayerID());
//			}
			
		});
		
		teamMap1.forEach((key, value) -> {//map을 forEach돌리면 Biconsumer 파라미터가 2개 key와 value consumer는 리턴안해
			for (AllStarFullVO allStarFullVO : value) {
				System.out.println("5-1." + key + ">" + allStarFullVO.getPlayerID());
			}
		});
		//getTeamID가 string타입 Map<String,~ 동일 타입 key도 String타입 /타입 맞춰서 자동으로 들어가 /마우스 올려서 타입확인 습관화
		
		//5-2. 1933년에 출전한 TeamID별 playerId의 수를 모두 출력(group)
		Map<String, List<AllStarFullVO>> teamMap2 = list.stream()
				.filter(vo ->vo.getYear().equals("1933"))
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
				
		teamMap2.forEach((key, value) ->{
			System.out.println("5-2." +key +">" + value.size());
		});
		
		//6. TeamID별 출전 연도를 모두 출력(group)
		/*
		 * NYA > 1933
		 * NYA > 1933
		 * NYA > 1933
		 * NYA > 1933
		 * NYA > 1934
		 * NYA > 1935
		 * NYA > 1936
		 * NYA > 1937
		 * BOS > 1933
		 * BOS > 1934
		 * BOS > 1935
		 * BOS > 1936
		 * BOS > 1937
		 */
		Map<String, List<AllStarFullVO>> teamMap3 = list.stream()
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		teamMap3.forEach((key, value) -> { //value가 list
			for(AllStarFullVO allStarFullVO:value) {
				System.out.println("6." + key + ">" + allStarFullVO.getYear());
			}
			
		});
		//에러에 crtl +1누르면 퀵픽스 나오는데 골라서 엔터
		//7.TeamID별 출전 연도를 중복제거하여 모두 출력(group)
		Map<String, List<AllStarFullVO>> teamMap4 =list.stream()
				.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		teamMap4.forEach((key, valueList) -> {
			valueList.stream() //valueList안의 값들은 메모리주소 다달라  map 위에 쓰면 distinct 효과없어
				 	 .map(vo->vo.getYear())
				 	 .distinct() //String으로 바꿔놓고 중복제거
				 	 .forEach((year)->{
					System.out.println("7." + key + " > " + year ); 
				 
				 });
		});
		
		
		
		//5. gomezle01 선수가 속한 팀의 매니저 playerID를 출력 (flatMap) 맵외부에서 stream을 리턴해야한다 무조건 flatMap
		Optional<String> managerId = list.stream()
										 .filter(vo ->vo.getPlayerID().equals("gomezle01"))
										 .map(vo -> vo.getTeamID())
										 .flatMap(teamId -> {
											 String path = "C:\\Devs\\data\\baseball\\core\\Managers.csv";
											 String searchTeamId = "," + teamId + ",";
											try {
												return Files.readAllLines(Paths.get(path))
															.stream()
															.filter(line -> line.contains(searchTeamId))
															.map(line -> line.split(",")[0]);
											}catch(IOException e) {
												return Stream.empty();
											}
										 })
										 .findFirst(); //한 문서에서 다른 문서의 내용을 가져올때 Stream에서 Stream
		
		
			
			
	}

}