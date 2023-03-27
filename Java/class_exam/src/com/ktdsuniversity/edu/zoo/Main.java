package com.ktdsuniversity.edu.zoo;

import com.ktdsuniversity.edu.zoo.inf.Animal;
import com.ktdsuniversity.edu.zoo.inf.Crawlable;
import com.ktdsuniversity.edu.zoo.inf.Flyable;
import com.ktdsuniversity.edu.zoo.inf.Runable;
import com.ktdsuniversity.edu.zoo.inf.Swimable;
import com.ktdsuniversity.edu.zoo.inf.Walkable;

public class Main { //다중인터페이스 구현은 일일히 검사해야 가능하다.

	public static void run(Animal animal) {
		animal.eat();
		animal.bark();
		if (animal instanceof Walkable) {
			((Walkable) animal).walk();
		}
		if (animal instanceof Runable) {
			((Runable)animal).run();
		}
		if (animal instanceof Flyable) {
			((Flyable) animal).fly();
		}
		if (animal instanceof Swimable) {
			((Swimable) animal).swim();
		}
		if (animal instanceof Crawlable) {
			((Crawlable) animal).crawl();
		}
	}
	
	
	public static void main(String[] args) {
		Animal lion =new Lion("메리");
		run(lion);
		
		Animal penguin = new Penguin("토토"); 
		run(penguin);
	}
	
}
