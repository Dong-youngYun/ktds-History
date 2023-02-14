package com.ktdsuniversity.edu.coupling;

public class EmployeeService implements MemberManagement {

	@Override
	public void regist() {
		System.out.println("사원 등록합니다.");
	}

	@Override
	public void unregist() {
		System.out.println("사원을 삭제합니다.");
	}

	@Override
	public void updateMyInfo() {
		System.out.println("사원 정보를 수정합니다.");
	}
	
}
