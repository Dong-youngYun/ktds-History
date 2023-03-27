package com.ktdsuniversity.edu.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.vo.MemberVO;

public class MapMemberDAOImpl implements MemberDAO {

	private Map<String, MemberVO> dataSource;  //여기서 초기화는 하지않는다 생성자가 초기화 해준다
												//생성자를 통한 초기화가 필요한 이유는 객체 생성 시 객체의 멤버 변수들을 적절하게 초기화하기 위해서 입니다. 
												//생성자를 사용하지 않으면 멤버 변수들의 기본값으로 초기화될 수 있어 객체의 정상적인 동작이 보장되지 않을 수 있습니다. 
												//따라서, 생성자를 통해 객체의 멤버 변수를 적절하게 초기화하는 것은 객체의 정상적인 동작을 보장하는데 중요한 역할을 합니다.
	public MapMemberDAOImpl() {
		dataSource = new HashMap<>();
	}
	
	@Override
	public int create(MemberVO memberVO) {	
		dataSource.put(memberVO.getId(), memberVO);
		return 1; 
	}

	@Override
	public List<MemberVO> readAll() {
		return dataSource.entrySet() //entrySet Set 타입을 준다.
							.stream()
							.map(entry -> entry.getValue())
							.collect(Collectors.toList());
	}

	@Override
	public MemberVO read(String key) { //read 적고 crtl space 
		return dataSource.get(key); //우린 맵이니까 key만 필요해 다른건 재정의 안해도 에러 나지 않아
	}
	

}
