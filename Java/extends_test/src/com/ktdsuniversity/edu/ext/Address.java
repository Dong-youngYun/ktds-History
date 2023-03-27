package com.ktdsuniversity.edu.ext;

	/**
	 * 주소 관련 클래스
	 * @author User
	 *
	 */
public class Address {
	private String name;
	private String phoneNumber;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) { //상속가능 접근제한자 protected 상속을 해준 범위까지만 쓸수 있어
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

