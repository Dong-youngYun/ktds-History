package com.ktdsuniversity.edu.controller;

import java.util.List;

import com.ktdsuniversity.edu.service.MemberService;
import com.ktdsuniversity.edu.service.SecondMemberServiceImpl;
import com.ktdsuniversity.edu.vo.MemberVO;

public class MemberController {
	
	public static void main(String[] args) {
		
		
		MemberService service = new SecondMemberServiceImpl(); //멤버서비스 임플을 쓰겟다 2.세컨드멤버서비스로 다시 해봐
				
		MemberVO member = new MemberVO();
		member.setId("id1");
		member.setPassword("pwd1");
		member.setReadNumber(1);
		member.setPageNumber(0);
		service.create(member); // create해서 여기넣든 저기넣든 데이터는 유지가 된다. 3개다 다른 메모리를 가지는 것인라서, 값을 넣는게 아니다
		
		member = new MemberVO();
		member.setId("id2");
		member.setPassword("pwd2");
		member.setReadNumber(2);
		member.setPageNumber(0);
		service.create(member);
		
		member = new MemberVO();
		member.setId("id3");
		member.setPassword("pwd3");
		member.setReadNumber(3);
		member.setPageNumber(0);
		service.create(member);
		
		List<MemberVO> memberList = service.readAll();
		for (MemberVO eachMember: memberList) { //순서보장이 안되는거 보니 Map을 사용중이다.
			System.out.println(eachMember.getId());
			System.out.println(eachMember.getPassword());
			System.out.println(eachMember.getReadNumber());
			System.out.println(eachMember.getPageNumber());
		}
		
//		MemberVO oneMember = service.read(?); 과제
		
		
	}
	
}
