package store;

/**
 * 실행 클래스
 * @author User
 *
 */
public class Main {
	Store store = new Store();
	
	public static void main(String[] args) {
		//메인은 편의점만 가지면 되 물건은 x
		Main main = new Main();
		main.store.addproducts();
		main.store.checkQuantity();
		//편의점 변수(인스턴스|객체)
		//store.addproducts();
		//store.checkQuantity();
		 
		//편의점을 만들고, 입고를 시키고, 재고를 확인한다.
		
	}

}
