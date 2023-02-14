package com.ktdsuniversity.edu.market;

public class Main {
	
	public static void main(String[] args) {
		                      //이름, 돈, 사과개수
		Buyer buyer = new Buyer("장민창", 5_000_000, 0);
							  //이름, 돈, 사과개수
		Seller seller = new Seller("이동학", 10_000_000, 10);
				
		//판매자에게 5개 산다. (buyer에게 seller를 참조(buyer내부에서 메모리 주소를 통해 seller로 접근)
		buyer.buy(seller, 5); //seller는 Seller 타입 //24번 id 전달
		
	}

}
