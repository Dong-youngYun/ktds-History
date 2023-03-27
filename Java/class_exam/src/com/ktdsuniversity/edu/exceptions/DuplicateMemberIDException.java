package com.ktdsuniversity.edu.exceptions;

/**
 * 사용자 예외는 반드시 RuntimeException 을 상속 받는다.
 * @author User
 *
 */
public class DuplicateMemberIDException extends RuntimeException {//화면으로 전송될 예외니까 try catch를 걸면 안된다. RuntimeException crtl클릭하면 아래 형태 확인가능
																	//Serializable을 구현하고 있어서 노란줄
	private static final long serialVersionUID = 300748820639462251L; //클러스터링 이란걸 쓸때 필요한 것 / 객체가 가지는 고유한 ID

	//사용자 예외는 필요에 따라 생성자를 Overriding 한다.
	public DuplicateMemberIDException(String memberID) {
		super(memberID); //부모의 생성자 RuntimeException
	}
	
}
