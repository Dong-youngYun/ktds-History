package gas;

/**
 * 연료
 * @author User
 */
public class Fuel {

	/**
	 * 연료종류
	 * 휘발유, 경유, LPG 
	 */
	private FuelType type;
	
	/**
	 * 연료잔량
	 */
	private int stock;
	
	public Fuel(FuelType type, int stock) {
		setType(type);
		setStock(stock);
		//set type stock 호출
	}

	public FuelType getType() {
		return type;
	}

	public void setType(FuelType type) {
		this.type = type;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
