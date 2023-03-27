package com.ktdsuniversity.edu.method;

public class Welcome {
	
	public String greetings(String[] message) {
		String welcomeMessage = "";
		for(String msg: message) {
			welcomeMessage += msg + "님, ";
		}
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	}
	
	public String greeting(String...message) {
		String welcomeMessage = "";
		for(String msg: message) {
			welcomeMessage += msg + "님, ";
		}
		
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	}
	
	public String greeting() {
		return "안녕하세요?";
	}
	
	public String greeting(String name) {
		return name + "님 안녕하세요?";
	}
	
	public String greeting(String name, String message) {
		return name + "님 " + message;
	}

}
