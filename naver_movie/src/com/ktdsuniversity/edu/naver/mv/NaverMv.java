package com.ktdsuniversity.edu.naver.mv;

import com.ktdsuniversity.edu.naver.mv.cmmncd.service.CmmnCdService;
import com.ktdsuniversity.edu.naver.mv.cmmncd.service.CmmnCdServiceImpl;
import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;
import com.ktdsuniversity.edu.naver.mv.cmpn.service.CmpnService;
import com.ktdsuniversity.edu.naver.mv.cmpn.service.CmpnServiceImpl;
import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;

public class NaverMv {

	public static void main(String[] args) {
		
//		GnrService gnrService = new GnrServiceImpl();
//		
//		GnrVO gnrVO = new GnrVO();
//		gnrVO.setGnrNm("범죄");
//		boolean createResult = gnrService.createGnr(gnrVO);
//		System.out.println("범죄 장르 등록 성공? " + createResult);
//		
//		NtnService ntnService = new NtnServiceImpl();
//		
//		NtnVO ntnVO = new NtnVO();
//		ntnVO.setNtnNm("대한민국");
//		createResult = ntnService.createNtn(ntnVO);
//		System.out.println("대한민국 국가 등록 성공? " + createResult);
		
//		MvPplService mvPplService = new MvPplServiceImpl();
//		
//		MvPplVO mvPplVO = new MvPplVO();
//		mvPplVO.setPrflPctr("123.123");
//		mvPplVO.setNm("정두수");
//		mvPplVO.setRlNm("정덕수");
//		boolean createResult = mvPplService.createMvPpl(mvPplVO);
//		System.out.println("영화인 등록 성공?" + createResult);
//		System.out.println(mvPplVO.getMvPplId());
		
//		CmpnService cmpnService = new CmpnServiceImpl();
//		
//		CmpnVO cmpnVO = new CmpnVO();
//		cmpnVO.setCmpnNm("두궁도희");
//		boolean createResult = cmpnService.createCmpn(cmpnVO);
//		System.out.println("회사등록 성공? " + createResult);
//		System.out.println(cmpnVO.getCmpnId());
		
		CmmnCdService cmmnCdService = new CmmnCdServiceImpl();
		
		CmmnCdVO cmmnCdVO = new CmmnCdVO();
		cmmnCdVO.setCdId("");
		cmmnCdVO.setCdNm("상영상태");
		cmmnCdVO.setPrcdncCdId("");
		boolean createResult = cmmnCdService.createCmmnCd(cmmnCdVO);
		System.out.println("공통코드 등록성공? " + createResult);
		
	}
	
	
}
