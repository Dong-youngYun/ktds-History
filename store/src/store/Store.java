package store;

/**
 * 편의점
 * 
 * @author User
 *
 */
public class Store {
	/**
	 * 멤버변수(인스턴스 필드) 선언 물
	 */
	Product water = new Product();
	/**
	 * 과자
	 */
	Product snack = new Product();
	/**
	 * 음료
	 */
	Product drink = new Product();

	/**
	 * 제품을 입고시킨다. 편의점의 기능
	 */
	public void addproducts() {
		//main에서 store 변수를 줫던것이지만 Store에서는 자체가 있어서 지워주면 된다.
		drink.name ="콜라";
		drink.quantity = 10;
		
		snack.name ="홈런볼";
		snack.quantity = 0;
		
		water.name ="삼다수";
		water.quantity = 1;
	}
	/**
	 * 재고확인 재고를 확인해서 개수를 출력한다.
	 */
	public void checkQuantity() {

		// 재고가 2개 이상일 경우 : "물건 명" 제품은 재고가 8개 있습니다
		// 재고가 0개인 경우 : "물건 명" 제품은 품절되었습니다
		// 재고가 1개인 경우 : "물건 명" 제품은 재고가 1개 있습니다. 재 주문이 필요합니다.

		// 물건 명
		String productName = water.name;
		// 재고
		int productQuantity = water.quantity;

		boolean outOfStock = productQuantity == 0;
		boolean needOrder = productQuantity == 1;

		// if ~else if ~ else
		/*
		 * if(조건 혹은 boolean) { 조건 혹은 boolean의 결과가 true 일 경우 실행할 코드 } else if (조건 혹은
		 * boolean) { 조건 혹은 boolean의 결과가 true 일 경우 실행할 코드 } else { 모든 조건이 false 일 경우 실행할
		 * 코드 }
		 */
		if (outOfStock) {
			// 재고가 0개인 경우 : "물건 명" 제품은 품절되었습니다.
			System.out.printf("%s 제품은 품절되었습니다.\n", productName);
		} else if (needOrder) {
			// 재고가 1개인 경우 : "물건 명" 제품은 재고가 1개 있습니다. 재 주문이 필요합니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다. 재 주문이 필요합니다.\n", productName, productQuantity);
		} else {
			// 재고가 2개 이상일 경우 : "물건 명" 제품은 재고가 8개 있습니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다.\n", productName, productQuantity);
		}

		// 물건 명 |타입은 왜 삭제?
		productName = snack.name;
		// 재고
		productQuantity = snack.quantity;

		outOfStock = productQuantity == 0;
		needOrder = productQuantity == 1;
		 
		if (outOfStock) {
			// 재고가 0개인 경우 : "물건 명" 제품은 품절되었습니다.
			System.out.printf("%s 제품은 품절되었습니다.\n", productName);
		} else if (needOrder) {
			// 재고가 1개인 경우 : "물건 명" 제품은 재고가 1개 있습니다. 재 주문이 필요합니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다. 재 주문이 필요합니다.\n", productName, productQuantity);
		} else {
			// 재고가 2개 이상일 경우 : "물건 명" 제품은 재고가 8개 있습니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다.\n", productName, productQuantity);
		}
		// 물건 명
		productName = drink.name;
		// 재고
		productQuantity = drink.quantity;

		outOfStock = productQuantity == 0;
		needOrder = productQuantity == 1;

		if (outOfStock) {
			// 재고가 0개인 경우 : "물건 명" 제품은 품절되었습니다.
			System.out.printf("%s 제품은 품절되었습니다.\n", productName);
		} else if (needOrder) {
			// 재고가 1개인 경우 : "물건 명" 제품은 재고가 1개 있습니다. 재 주문이 필요합니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다. 재 주문이 필요합니다.\n", productName, productQuantity);
		} else {
			// 재고가 2개 이상일 경우 : "물건 명" 제품은 재고가 8개 있습니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다.\n", productName, productQuantity);
		}
	}
}
