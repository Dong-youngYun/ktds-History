package gas;

import java.util.HashMap;
import java.util.Map;

public class Street {

	public static final Map<FuelType, Double> PRICES; //final을 지우면 에러x (한번값이 설정되면 바뀌지 않아 /반드시 값이 할당되어야 한다) 할당이 안되서 생기는 문제
	
	//static 변수의 초기화나 할당은 여기서 한다.
	static {
		PRICES = new HashMap<>(); //map 상수가 만들어 진 상태
		PRICES.put(FuelType.GASOLIN, 1569.67);
		PRICES.put(FuelType.DIESEL, 1651.15);
		PRICES.put(FuelType.LPG, 1039.35);
		
	}
	
//	/**
//	 * 가솔린 리터당 가격 값변화를 막기위해 상수 지정
//	 */
//	public static final double GASOLIN_PRICE = 1569.67;
//	/**
//	 * 경유 리터당 가격
//	 */
//	public static final double DIESEL_PRICE = 1651.15;
//	/**
//	 * LPG 리터당 가격
//	 */
//	public static final double LPG_PRICE = 1039.35;
	
	public static void main(String[] args) {
		
		GasStation gasStation = new GasStation ();
		
		Customer customer = new Customer ();
		customer.setFuel(new Fuel(FuelType.DIESEL, 50));
		customer.setMoney(1_000_000);
		
		customer.buy(gasStation, FuelType.GASOLIN, 50);
		
		
	}
	
}
