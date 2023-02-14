package com.ktdsuniversity.edu.infext;

public class Main {
	//인터페이스가 2개니까 메소드도 두개로 만들어보자.
	public static void memberManage(MemberService memberService) {
		memberService.regist();
		memberService.updateMyInfo();
		
//		if(memberService instanceof VipMemberService) { //지금 전달받은 memberService가 VipMemberService의 객체냐? 물어보는 것
////		VipMemberService vipMemberService = (VipMemberService) memberService; //super class가 sub class에게 가려 한다. 상속을 받은 자식이 부모에게 갈 수있어 캐스팅 필요/ 위 검사 없이 캐스팅하려하면 에러난다.
////		vipMemberService.addPoint(50);
//			((VipMemberService) memberService).addPoint(50); //실무방식 http요청을 할때 많이 사용
//		}
//		
		memberService.unregist();
	}
	
//	public static void vipMemberManage(VipMemberService memberService) { //필요없는 코드 addPoint 호출 못하더라도
//		memberService.regist();
//		memberService.updateMyInfo();
//		memberService.addPoint(50);	//회원 정보 수정하면 50점 준다 / addPoint를 사용하기 위해 두개로 쪼갯다.
//		memberService.unregist();
//	}
	
	public static void main(String[] args) {
		
		//Sub class is a Super class
		MemberService memberService = new MemberServiceImpl();
		MemberService vipMemberService = new VipMemberServiceImpl(); //vip 굳이 쓸 필요없다.
		
		memberManage(memberService);
		memberManage(vipMemberService); //타입이 같아서 에러x
		//동작에는 문제 없지만 왜 이렇게 했지? 구조에 대한 상속과 규칙이 무시된 코드
		
//		vipMemberService.addPoint(100); MemberService에는 addPoint 메소드가 없다.
	}
	
}
