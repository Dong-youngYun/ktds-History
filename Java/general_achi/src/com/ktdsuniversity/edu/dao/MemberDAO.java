package com.ktdsuniversity.edu.dao;

import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public interface MemberDAO {

	public int create(MemberVO memberVO);
	
	public List<MemberVO> readAll();
	
	public default MemberVO read(int idx) {
		//타입은 같지만 파라미터가 달라 메소드 오버로딩
		//MemberVO 리턴
		//리턴 할게 뭔지 몰라서 return null
		return null;
	}
	
	public default MemberVO read(String key) {
		return null;
		
	}
}
