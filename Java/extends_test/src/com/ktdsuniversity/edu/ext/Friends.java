package com.ktdsuniversity.edu.ext;

public class Friends extends Address { //extends 상속받을 클래스명
	
	private String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Override
		public String getAddress() {
			return "내 친구 주소는 " + super.getAddress(); //super는 Address를 말한다.
		}
	@Override
		public String getName() {
			return "내 친구 이름은 " + super.getName();
		}
	@Override
		public String getPhoneNumber() {
			return "내 친구 전화번호는" + super.getPhoneNumber();
		}
	
	

}
