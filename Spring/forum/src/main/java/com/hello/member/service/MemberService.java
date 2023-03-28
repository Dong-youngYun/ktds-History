package com.hello.member.service;

import com.hello.member.vo.MemberVO;

public interface MemberService {

	public boolean createNewMember(MemberVO memberVO);
	
	public int readCountMemberByEmail(String email); //count를 받는거라 int 그대로
	
	public MemberVO readOneMemberByEmailAndPassword(MemberVO memberVO);
	
}
