package com.ktdsuniversity.edu.ext;

public class ExtendsTest {
	
	public static void print(Address address) { //파라미터를 address birthday는 프렌즈에
		System.out.println(address.getName());
		System.out.println(address.getPhoneNumber());
		System.out.println(address.getAddress());
		
		if(address instanceof Friends) {//address가 Friends타입의 객체인지 확인
			Friends friend = (Friends) address; //type casting
			System.out.println(friend.getBirthday());
		}
		
	}
	
	public static void main(String[] args) {
		
		Friends friend = new Friends(); //타입을 Address라 적어도 되 다만, birthday는 못써
		//friend. 찍어도 변수 안나와 address에서 private이라서
		friend.setName ("장민창");
		friend.setBirthday("2000-11-11");
//		System.out.println(friend.getName());
//		System.out.println(friend.getBirthday());
		print(friend);
	}

}
