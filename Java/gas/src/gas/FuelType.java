package gas;

/**
 * 연료의 종류
 * @author User
 *
 */
//enum 오타의 위험성을 없애기위해 (최소화x)
public enum FuelType {
	//오로지 값만 붙고 ,로 구분한다. 마지막엔 ;붙일수도 안붙일 수도있어
	/**휘발유
	 * 
	 */
	GASOLIN,
	/**
	 * 경유
	 */
	DIESEL,
	/**
	 * LPG
	 */
	LPG;
	
}
