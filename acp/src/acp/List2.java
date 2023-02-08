package acp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List2 {
	public static void main(String[] args) {
		//1 ~45사이 랜덤 값 가져오기
		Random random =new Random();
		List<Integer> lotto = new ArrayList<>();
		int randomNumber = random.nextInt(45) +1; //값을 할당 먼저
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		 randomNumber = random.nextInt(45) +1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		 randomNumber = random.nextInt(45) +1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		 randomNumber = random.nextInt(45) +1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45) +1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		randomNumber = random.nextInt(45) +1;
		if(!lotto.contains(randomNumber)) {
			lotto.add(randomNumber);
		}
		if(lotto.size() > 0) {
			System.out.println(lotto.get(0)); //IndeOutOfBounds 를 회피하기위해
		}
		if(lotto.size() > 0) {
			System.out.println(lotto.get(1)); //IndeOutOfBounds 를 회피하기위해
		}
		if(lotto.size() > 0) {
			System.out.println(lotto.get(2)); //IndeOutOfBounds 를 회피하기위해
		}
		if(lotto.size() > 0) {
			System.out.println(lotto.get(3)); //IndeOutOfBounds 를 회피하기위해
		}
		if(lotto.size() > 0) {
			System.out.println(lotto.get(4)); //IndeOutOfBounds 를 회피하기위해
		}
		if(lotto.size() > 0) {
			System.out.println(lotto.get(5)); //IndeOutOfBounds 를 회피하기위해
		}
		
		lotto.add(random.nextInt(45) +1);
		lotto.add(random.nextInt(45) +1);
		lotto.add(random.nextInt(45) +1);
		lotto.add(random.nextInt(45) +1);
		lotto.add(random.nextInt(45) +1);
		lotto.add(random.nextInt(45) +1);
		
		System.out.println(lotto.get(0));
		System.out.println(lotto.get(1));
		System.out.println(lotto.get(2));
		System.out.println(lotto.get(3));
		System.out.println(lotto.get(4));
		System.out.println(lotto.get(5));
		
//		int randomNumber = random.nextInt(45) + 1; //0부터 44까지가 나와서 +1해준다.
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1; 
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1; 
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1; 
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1; 
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1; 
//		System.out.println(randomNumber);
//		randomNumber = random.nextInt(45) + 1; 
//		System.out.println(randomNumber);

		
	
	}
}
