package com.ktdsuniversity.edu.service;

import java.util.List;

import com.ktdsuniversity.edu.dao.ListMemberDAOImpl;
import com.ktdsuniversity.edu.dao.MemberDAO;
import com.ktdsuniversity.edu.vo.MemberVO;

public class SecondMemberServiceImpl implements MemberService {
	
private MemberDAO memberDAO;
	
	public SecondMemberServiceImpl() {
		memberDAO = new ListMemberDAOImpl(); //ListMemberDAOImpl 로 바꿔봐 (확장성)
	}

	@Override
	public boolean create(MemberVO memberVO) {
		System.out.println("SecondMemberServiceImpl.create"); //멤버서비스인지 세컨드 멤버 서비스걸 쓴건지 구분하려고 출력문을 만듬
		return memberDAO.create(memberVO) > 0; 
	}

	@Override
	public List<MemberVO> readAll() {
		System.out.println("SecondMemberServiceImpl.readAll");
		return memberDAO.readAll();
	}

	@Override
	public MemberVO read(int idx) {
		
		return memberDAO.read(idx);
	}

	@Override
	public MemberVO read(String key) {
	
		return null;
	}

}
