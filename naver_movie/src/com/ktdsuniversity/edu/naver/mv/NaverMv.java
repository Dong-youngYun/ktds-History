package com.ktdsuniversity.edu.naver.mv;

import com.ktdsuniversity.edu.naver.mv.pctr.service.PctrService;
import com.ktdsuniversity.edu.naver.mv.pctr.service.PctrServiceImpl;
import com.ktdsuniversity.edu.naver.mv.pctr.vo.PctrVO;
import com.ktdsuniversity.edu.naver.mv.vd.service.VdService;
import com.ktdsuniversity.edu.naver.mv.vd.service.VdServiceImpl;
import com.ktdsuniversity.edu.naver.mv.vd.vo.VdVO;

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
//		
//		CmmnCdService cmmnCdService = new CmmnCdServiceImpl();
//		
//		CmmnCdVO cmmnCdVO = new CmmnCdVO();
//		cmmnCdVO.setCdId("004_01");
//		cmmnCdVO.setCdNm("예고편");
//		cmmnCdVO.setPrcdncCdId("004");
//		boolean createResult = cmmnCdService.createCmmnCd(cmmnCdVO);
//		System.out.println("공통코드 등록성공? " + createResult);
		
//		MvService mvService = new MvServiceImpl();
//		MvVO mvVO = new MvVO();
//		mvVO.setMvTtl("새로운 영화");
//		mvVO.setEngTtl("New movie");
//		mvVO.setScrnStt("001_01");
//		mvVO.setScrnTm(120);
//		mvVO.setOpngDt("20230301");
//		mvVO.setGrd("002_04");
//		mvVO.setPstr("http://movie.naver.com/ddd.jpg");
//		mvVO.setSmr("영화 줄거리");
//		
//		List<GnrVO> gnrList = new ArrayList<>();
//		GnrVO gnrVO = new GnrVO();
//		gnrVO.setGnrId(2);
//		gnrList.add(gnrVO);
//		mvVO.setGnrList(gnrList);
//		
//		List<NtnVO> ntnList = new ArrayList<>();
//		NtnVO ntnVO = new NtnVO();
//		ntnVO.setNtnId(2);
//		ntnList.add(ntnVO);
//		mvVO.setNtnList(ntnList);
//		
//		List<PrdcPrtcptnCmpnVO> cmpnList = new ArrayList<>();
//		PrdcPrtcptnCmpnVO cmpnVO = new PrdcPrtcptnCmpnVO();
//		cmpnVO.setCmpnId("CO-20230308-00001");
//		cmpnVO.setCrcltncd("006_01");
//		cmpnList.add(cmpnVO);
//		mvVO.setCmpnList(cmpnList);
////		
//		List<PrdcPrtcptnPplVO> mvPplList = new ArrayList<>();
//		PrdcPrtcptnPplVO mvPplVO = new PrdcPrtcptnPplVO();
//		mvPplVO.setMvPplId("PD-20230308-00002");
//		mvPplVO.setMssn("005_01");
//		mvPplVO.setRspnsbltRolNm(null);
//		mvPplList.add(mvPplVO);
//		mvVO.setMvPplList(mvPplList);
////		
//		mvService.createMv(mvVO);
		
//		PctrService pctrService = new PctrServiceImpl();
//		
//		PctrVO pctrVO = new PctrVO();
//		pctrVO.setMvId("MV-20230309-00026");
//		pctrVO.setTp("003_01");
//		pctrVO.setThmbnlPctr("123");
//		pctrVO.setOrgnPctr("123");
//		boolean createResult = pctrService.createPctr(pctrVO);
		
//		VdService vdService = new VdServiceImpl();
//		
//		VdVO vdVO = new VdVO();
//		vdVO.setMvId("MV-20230309-00026");
//		vdVO.setVdTp("004_01");
//		vdVO.setVdTtl("하하");
//		vdVO.setThmbnl("123");
//		vdVO.setVdUrl("123");
//		boolean createResult = vdService.createVd(vdVO);
		
		
//		RtngService rtngService = new RtngServiceImpl();
//		
//		RtngVO rtngVO = new RtngVO();
//		rtngVO.setMvId("MV-20230309-00026");
//		rtngVO.setRtng(5);
//		rtngVO.setRtngDtl("123");
//		rtngVO.setRtngWrtr("123");
//		boolean createResult = rtngService.createRtng(rtngVO);
		
//		FmsLnService fmsLnService = new FmsLnServiceImpl();
//		
//		FmsLnVO fmsLnVO = new FmsLnVO();
//		fmsLnVO.setMvId("MV-20230309-00026");
//		fmsLnVO.setMvPpl("PD-20230308-00002");
//		fmsLnVO.setFmsLn("1233");
//		fmsLnVO.setXplntn("124235");
//		boolean createResult = fmsLnService.createFmsLn(fmsLnVO);
//		
//		GnrService gnrService = new GnrServiceImpl();
//		GnrVO gnrVO = new GnrVO();
//		gnrVO.setGnrId(2);
//		gnrVO.setGnrNm("스릴러");
//		gnrService.updateGnr(gnrVO);
		
//		NtnService ntnService = new NtnServiceImpl();
//		NtnVO ntnVO = new NtnVO();
//		ntnVO.setNtnId(2);
//		ntnVO.setNtnNm("미국");
//		ntnService.updateNtn(ntnVO);
		
//		CmpnService cmpnService = new CmpnServiceImpl();
//		CmpnVO cmpnVO = new CmpnVO();
//		cmpnVO.setCmpnId("CO-20230308-00001");
//		cmpnVO.setCmpnNm("딴딴");
//		cmpnService.updateCmpn(cmpnVO);
		
//		MvPplService mvPplService = new MvPplServiceImpl();
//		MvPplVO mvPplVO = new MvPplVO();
//		mvPplVO.setPrflPctr("1123.123");
//		mvPplVO.setNm("뚜뚜");
//		mvPplVO.setRlNm("또또");
//		mvPplVO.setMvPplId("PD-20230308-00002");
//		mvPplService.updateMvPpl(mvPplVO);
//		
//		RtngService rtngService = new RtngServiceImpl();
//		RtngVO rtngVO = new RtngVO();
//		rtngVO.setMvId("MV-20230309-00026");
//		rtngVO.setRtng(3);
//		rtngVO.setRtngDtl("1234");
//		rtngVO.setRtngWrtr("12432");
//		rtngVO.setLkCnt(0);
//		rtngVO.setDslkCnt(0);
//		rtngVO.setRtngId("MR-20230309-00026");
//		rtngService.updateRtng(rtngVO);
		
//		FmsLnService fmsLnService = new FmsLnServiceImpl();
//		FmsLnVO fmsLnVO = new FmsLnVO();
//		fmsLnVO.setMvId("MV-20230309-00026");
//		fmsLnVO.setMvPpl("PD-20230308-00002");
//		fmsLnVO.setFmsLn("2352");
//		fmsLnVO.setXplntn("435346");
//		fmsLnVO.setRgstPplNm("정더수");
//		fmsLnVO.setRcmmndCnt(2);
//		fmsLnVO.setFmsLnId("FL-20230309-00027");
//		fmsLnService.updateFmsLn(fmsLnVO);
		
//		PctrService pctrService = new PctrServiceImpl();
//		PctrVO pctrVO = new PctrVO();
//		pctrVO.setMvId("MV-20230309-00026");
//		pctrVO.setTp("003");
//		pctrVO.setThmbnlPctr("1425");
//		pctrVO.setOrgnPctr("12432");
//		pctrVO.setPctrId("PT-20230309-00025");
//		pctrService.updatePctr(pctrVO);
		
		VdService vdService = new VdServiceImpl();
		VdVO vdVO = new VdVO();
		vdVO.setMvId("MV-20230309-00026");
		vdVO.setVdTp("004");
		vdVO.setVdTtl("호호");
		vdVO.setThmbnl("3242");
		vdVO.setVdPlyCnt(0);
		vdVO.setVdUrl("234235");
		vdVO.setVdId("VD-20230309-00028");
		vdService.updateVd(vdVO);
		
	}
	
	
}
