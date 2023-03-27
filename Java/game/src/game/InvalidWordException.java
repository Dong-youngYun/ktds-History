package game;

/**
 * 3자리 미만의 단어를 입력했을 경우 던질 예외
 * @author User
 *
 */
public class InvalidWordException extends RuntimeException {//우리가 만드는 예외는 항상 runtimeexception을 받는다.

	private static final long serialVersionUID = -7037212777087331376L; 
	
	public InvalidWordException() {
		super();
	}

}
