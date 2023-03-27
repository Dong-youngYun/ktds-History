package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Penguin implements Walkable, Swimable {//줄 삭제 crtl +D

	private String name;
	
	public Penguin (String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " 먹는다");
	}

	@Override
	public void bark() {
		System.out.println(name + " 운다.");
	}

	@Override
	public void swim() {
		System.out.println(name + " 수영한다.");
	}

	@Override
	public void walk() {
		System.out.println(name + " 걷는다.");
	}

}
