package com.ktdsuniversity.edu.service;

import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public interface MemberService {
	
public boolean create(MemberVO memberVO); //성공이냐 실패여부를 돌려주기 위해 boolean controller가 쓰지 않더라도 우리가 debug를 하기위해 필요
	
	public List<MemberVO> readAll();

}
