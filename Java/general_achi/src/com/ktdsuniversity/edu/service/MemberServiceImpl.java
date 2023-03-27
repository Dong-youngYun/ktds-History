package com.ktdsuniversity.edu.service;

import java.util.List;

import com.ktdsuniversity.edu.dao.MapMemberDAOImpl;
import com.ktdsuniversity.edu.dao.MemberDAO;
import com.ktdsuniversity.edu.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO memberDAO; 
	
	public MemberServiceImpl() {
		memberDAO = new MapMemberDAOImpl(); //인터페이스만 적어줘 memberDAO
	}

	@Override
	public boolean create(MemberVO memberVO) {
		return memberDAO.create(memberVO) > 0; //0보다 크면 성공이고 아니면 실패라고 간주한다.
	}

	@Override
	public List<MemberVO> readAll() {
		return memberDAO.readAll();
	}

	@Override
	public MemberVO read(int idx) { //서비스는 둘다 구현이 되어있어야 된다. new MapMemberDAOImpl이 바뀔수 있어서 List로
		return memberDAO.read(idx);
	}

	@Override
	public MemberVO read(String key) {
		return memberDAO.read(key);
	}

}
