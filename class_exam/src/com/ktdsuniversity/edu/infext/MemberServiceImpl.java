package com.ktdsuniversity.edu.infext;

public class MemberServiceImpl implements MemberService {

	@Override
	public void regist() {//인터페이스에 주석을 달면 클래스까지 이어져 온다. (메소드명에 마우스 올리면)
		System.out.println("회원 가입이 완료되었습니다.");
	}

	@Override
	public void unregist() {
		System.out.println("회원 탈퇴가 완료되었습니다.");
	}

	@Override
	public void updateMyInfo() {
		System.out.println("회원 정보 수정이 완료되었습니다.");
	}

}
