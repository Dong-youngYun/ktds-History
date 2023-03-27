package com.ktdsuniversity.edu.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public class ListMemberDAOImpl implements MemberDAO{
	
	private List<MemberVO> dataSource;
	
	public ListMemberDAOImpl() {
		dataSource = new ArrayList<>();
	}

	@Override
	public int create(MemberVO memberVO) {
		dataSource.add(memberVO);
		return 1;
	}

	@Override
	public List<MemberVO> readAll() {
		return dataSource;
	}

	@Override
	public MemberVO read(int idx) {
	
		return dataSource.get(idx); 
	}
	public static void main(String[] args) {
		try{
			int number = Integer.parseInt("ABC");
		}
		catch (NumberFormatException e) { //에러구문 첫줄이 이곳에서 예외를 처음 던졋다는 뜻
			System.out.println("에러가 발생했습니다." + e.getMessage()); // getMessage 예외의 상세내용을 전달
			e.printStackTrace(); //StackTrace 실행순서를 알려준다
			//가장 마지막줄 예외가 발생한 위치
		}
	}
}
