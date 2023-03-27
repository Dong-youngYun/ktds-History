package com.ktdsuniversity.edu.member;

public class MemberService {

	private String userName;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName; //인자를 받아와서 나의 username에 할당 시킨다.
	}
	
	public void join() {
		System.out.println("회원가입");
	}
	
	private void login() { //private 때문에 login에 노란줄/ 내부에서만 호출이 되야한다.
		System.out.println("로그인");
	}
	
	void quit() { //default 자기 패키지 내부에서만 접근가능
		System.out.println("탈퇴");
	}
	
	
}
