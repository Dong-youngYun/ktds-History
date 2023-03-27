package com.ktdsuniversity.edu.naver.mv;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.service.CmmnCdService;
import com.ktdsuniversity.edu.naver.mv.cmmncd.service.CmmnCdServiceImpl;
import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;
import com.ktdsuniversity.edu.naver.mv.cmpn.service.CmpnService;
import com.ktdsuniversity.edu.naver.mv.cmpn.service.CmpnServiceImpl;
import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;
import com.ktdsuniversity.edu.naver.mv.fmsln.service.FmsLnService;
import com.ktdsuniversity.edu.naver.mv.fmsln.service.FmsLnServiceImpl;
import com.ktdsuniversity.edu.naver.mv.fmsln.vo.FmsLnVO;
import com.ktdsuniversity.edu.naver.mv.gnr.service.GnrService;
import com.ktdsuniversity.edu.naver.mv.gnr.service.GnrServiceImpl;
import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.mv.service.MvService;
import com.ktdsuniversity.edu.naver.mv.mv.service.MvServiceImpl;
import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.PrdcPrtcptnCmpnVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.PrdcPrtcptnPplVO;
import com.ktdsuniversity.edu.naver.mv.mvppl.service.MvPplService;
import com.ktdsuniversity.edu.naver.mv.mvppl.service.MvPplServiceImpl;
import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;
import com.ktdsuniversity.edu.naver.mv.ntn.service.NtnService;
import com.ktdsuniversity.edu.naver.mv.ntn.service.NtnServiceImpl;
import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;
import com.ktdsuniversity.edu.naver.mv.pctr.service.PctrService;
import com.ktdsuniversity.edu.naver.mv.pctr.service.PctrServiceImpl;
import com.ktdsuniversity.edu.naver.mv.pctr.vo.PctrVO;
import com.ktdsuniversity.edu.naver.mv.rtng.service.RtngService;
import com.ktdsuniversity.edu.naver.mv.rtng.service.RtngServiceImpl;
import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;
import com.ktdsuniversity.edu.naver.mv.vd.service.VdService;
import com.ktdsuniversity.edu.naver.mv.vd.service.VdServiceImpl;
import com.ktdsuniversity.edu.naver.mv.vd.vo.VdVO;

public class NaverMv {

	public static void main(String[] args) {
		
		GnrService gnrService = new GnrServiceImpl();
		NtnService ntnService = new NtnServiceImpl();
		MvPplService mvPplService = new MvPplServiceImpl();
		CmpnService cmpnService = new CmpnServiceImpl();
		CmmnCdService cmmnCdService = new CmmnCdServiceImpl();
		MvService mvService = new MvServiceImpl();
		PctrService pctrService = new PctrServiceImpl();
		VdService vdService = new VdServiceImpl();
		RtngService rtngService = new RtngServiceImpl();
		FmsLnService fmsLnService = new FmsLnServiceImpl();
	
//		List<CmmnCdVO> cmmnCdList = cmmnCdService.readAllCmmnCd();
//		for (CmmnCdVO cmmnCdVO : cmmnCdList) {
//			System.out.println(cmmnCdVO.getCdId());
//			System.out.println(cmmnCdVO.getCdNm());
//			System.out.println(cmmnCdVO.getPrcdncCdId());
//			System.out.println("=========================");
//		}
//		
//		List<CmpnVO> cmpnList = cmpnService.readAllCmpn();
//		for (CmpnVO cmpnVO : cmpnList) {
//			System.out.println(cmpnVO.getCmpnId());
//			System.out.println(cmpnVO.getCmpnNm());
//			System.out.println("=========================");
//		}
//		
//		List<FmsLnVO> fmsLnList = fmsLnService.readAllFmsLn();
//		for (FmsLnVO fmsLnVO : fmsLnList) {
//			System.out.println(fmsLnVO.getFmsLnId());
//			System.out.println(fmsLnVO.getMvId());
//			System.out.println(fmsLnVO.getMvPpl());
//			System.out.println(fmsLnVO.getFmsLn());
//			System.out.println(fmsLnVO.getXplntn());
//			System.out.println(fmsLnVO.getRgstTm());
//			System.out.println(fmsLnVO.getRgstPplNm());
//			System.out.println(fmsLnVO.getRcmmndCnt());
//			System.out.println("=========================");
//		}
//		
//		List<GnrVO> gnrList = gnrService.readAllGnr();
//		for (GnrVO gnrVO : gnrList) {
//			System.out.println(gnrVO.getGnrId());
//			System.out.println(gnrVO.getGnrNm());
//			System.out.println("=========================");
//		}
//		
//		List<MvPplVO> mvPplList = mvPplService.readAllMvPpl();
//		for (MvPplVO mvPplVO : mvPplList) {
//			System.out.println(mvPplVO.getMvPplId());
//			System.out.println(mvPplVO.getPrflPctr());
//			System.out.println(mvPplVO.getNm());
//			System.out.println(mvPplVO.getRlNm());
//			System.out.println("=========================");
//		}
//		
//		List<NtnVO> ntnList = ntnService.readAllNtn();
//		for (NtnVO ntnVO : ntnList) {
//			System.out.println(ntnVO.getNtnId());
//			System.out.println(ntnVO.getNtnNm());
//			System.out.println("=========================");
//		}
//		
//		List<PctrVO> pctrList = pctrService.readAllPctr();
//		for (PctrVO pctrVO : pctrList) {
//			System.out.println(pctrVO.getPctrId());
//			System.out.println(pctrVO.getMvId());
//			System.out.println(pctrVO.getTp());
//			System.out.println(pctrVO.getThmbnlPctr());
//			System.out.println(pctrVO.getOrgnPctr());
//			System.out.println("=========================");
//		}
//		
//		List<RtngVO> rtngList = rtngService.readAllRtng();
//		for (RtngVO rtngVO : rtngList) {
//			System.out.println(rtngVO.getRtngId());
//			System.out.println(rtngVO.getMvId());
//			System.out.println(rtngVO.getRtng());
//			System.out.println(rtngVO.getRtngDtl());
//			System.out.println(rtngVO.getRtngWrtr());
//			System.out.println(rtngVO.getRtngWrtTm());
//			System.out.println(rtngVO.getLkCnt());
//			System.out.println(rtngVO.getDslkCnt());
//			System.out.println("=========================");
//		}
//		
//		List<VdVO> vdList = vdService.readAllVd();
//		for (VdVO vdVO : vdList) {
//			System.out.println(vdVO.getVdId());
//			System.out.println(vdVO.getMvId());
//			System.out.println(vdVO.getVdTp());
//			System.out.println(vdVO.getVdTtl());
//			System.out.println(vdVO.getThmbnl());
//			System.out.println(vdVO.getVdPlyCnt());
//			System.out.println(vdVO.getVdUrl());
//			System.out.println(vdVO.getRgstDt());
//			System.out.println("=========================");
//		}
		
//		List<MvVO> mvList = mvService.readAllMv();
//		for (MvVO mvVO : mvList) {
//			System.out.println("MV_ID: " + mvVO.getMvId());
//			System.out.println("MV_TTL: " + mvVO.getMvTtl());
//			System.out.println("ENG_TTL: " + mvVO.getEngTtl());
//			System.out.println("SMR: " + mvVO.getSmr());
//			
//			List<GnrVO> mvGnrList = mvVO.getGnrList();
//			List<NtnVO> mvNtnList = mvVO.getNtnList();
//			
//			for (GnrVO mvGnr : mvGnrList) {
//				System.out.println("GNR_ID: " + mvGnr.getGnrId());
//				System.out.println("GNR_NM: " + mvGnr.getGnrNm());
//			}
//			
//			for (NtnVO mvNtn : mvNtnList) {
//				System.out.println("NTN_ID: " + mvNtn.getNtnId());
//				System.out.println("NTN_NM: " + mvNtn.getNtnNm());
//			}
//		}
		
		MvVO oneMvVO = mvService.readOneMv("MV-20230310-00049");
		System.out.println("MV_ID: " + oneMvVO.getMvId());
		System.out.println("MV_TTL: " + oneMvVO.getMvTtl());
		System.out.println("ENG_TTL: " + oneMvVO.getEngTtl());
		System.out.println("SMR: " + oneMvVO.getSmr());
		
		List<GnrVO> mvGnrList = oneMvVO.getGnrList();
		List<NtnVO> mvNtnList = oneMvVO.getNtnList();
		
		for (GnrVO mvGnr : mvGnrList) {
			System.out.println("GNR_ID: " + mvGnr.getGnrId());
			System.out.println("GNR_NM: " + mvGnr.getGnrNm());
		}
		
		for (NtnVO mvNtn : mvNtnList) {
			System.out.println("NTN_ID: " + mvNtn.getNtnId());
			System.out.println("NTN_NM: " + mvNtn.getNtnNm());
		}
//		mvService.deleteMv("MV-20230309-00026");
		
//		gnrService.deleteGnr(2);
//		ntnService.deleteNtn(2);
//		mvPplService.deleteMvPpl("PD-20230308-00002");
//		cmpnService.deleteCmpn("CO-20230308-00001");
//		pctrService.deletePctr("PT-20230309-00025");
//		vdService.deleteVd("VD-20230309-00028");
//		rtngService.deleteRtng("MR-20230309-00026");
//		fmsLnService.deleteFmsLn("FL-20230309-00027");
		
//		GnrVO gnrVO = new GnrVO();
//		gnrVO.setGnrNm("범죄");
//		boolean createResult = gnrService.createGnr(gnrVO);
//		System.out.println("범죄 장르 등록 성공? " + createResult);
//		
//		
//		NtnVO ntnVO = new NtnVO();
//		ntnVO.setNtnNm("대한민국");
//		boolean createResult = ntnService.createNtn(ntnVO);
//		System.out.println("대한민국 국가 등록 성공? " + createResult);
		
//		
//		MvPplVO mvPplVO = new MvPplVO();
//		mvPplVO.setPrflPctr("123.123");
//		mvPplVO.setNm("정두수");
//		mvPplVO.setRlNm("정덕수");
//		boolean createResult = mvPplService.createMvPpl(mvPplVO);
//		System.out.println("영화인 등록 성공?" + createResult);
//		System.out.println(mvPplVO.getMvPplId());
		
//		
//		CmpnVO cmpnVO = new CmpnVO();
//		cmpnVO.setCmpnNm("두궁도희");
//		boolean createResult = cmpnService.createCmpn(cmpnVO);
//		System.out.println("회사등록 성공? " + createResult);
//		System.out.println(cmpnVO.getCmpnId());
		
//		
//		CmmnCdVO cmmnCdVO = new CmmnCdVO();
//		cmmnCdVO.setCdId("004_01");
//		cmmnCdVO.setCdNm("예고편");
//		cmmnCdVO.setPrcdncCdId("004");
//		boolean createResult = cmmnCdService.createCmmnCd(cmmnCdVO);
//		System.out.println("공통코드 등록성공? " + createResult);
		
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
//		gnrVO.setGnrId(25);
//		gnrList.add(gnrVO);
//		mvVO.setGnrList(gnrList);
//		
//		List<NtnVO> ntnList = new ArrayList<>();
//		NtnVO ntnVO = new NtnVO();
//		ntnVO.setNtnId(25);
//		ntnList.add(ntnVO);
//		mvVO.setNtnList(ntnList);
//		
//		List<PrdcPrtcptnCmpnVO> cmpnList = new ArrayList<>();
//		PrdcPrtcptnCmpnVO cmpnVO = new PrdcPrtcptnCmpnVO();
//		cmpnVO.setCmpnId("CO-20230308-00001");
//		cmpnVO.setCrcltncd("006_01");
//		cmpnList.add(cmpnVO);
//		mvVO.setCmpnList(cmpnList);
//
//		List<PrdcPrtcptnPplVO> mvPplList = new ArrayList<>();
//		PrdcPrtcptnPplVO mvPplVO = new PrdcPrtcptnPplVO();
//		mvPplVO.setMvPplId("PD-20230308-00002");
//		mvPplVO.setMssn("005_01");
//		mvPplVO.setRspnsbltRolNm(null);
//		mvPplList.add(mvPplVO);
//		mvVO.setMvPplList(mvPplList);
//		
//		mvService.createMv(mvVO);
//		
//		mvVO.setMvId("MV-20230309-00040");
//		mvVO.setMvTtl("수정된 영화");
//		mvVO.setEngTtl("Updated");
//		mvService.updateMv(mvVO);
		
//		
//		PctrVO pctrVO = new PctrVO();
//		pctrVO.setMvId("MV-20230309-00026");
//		pctrVO.setTp("003_01");
//		pctrVO.setThmbnlPctr("123");
//		pctrVO.setOrgnPctr("123");
//		boolean createResult = pctrService.createPctr(pctrVO);
		
//		
//		VdVO vdVO = new VdVO();
//		vdVO.setMvId("MV-20230309-00026");
//		vdVO.setVdTp("004_01");
//		vdVO.setVdTtl("하하");
//		vdVO.setThmbnl("123");
//		vdVO.setVdUrl("123");
//		boolean createResult = vdService.createVd(vdVO);
		
		
//		
//		RtngVO rtngVO = new RtngVO();
//		rtngVO.setMvId("MV-20230309-00026");
//		rtngVO.setRtng(5);
//		rtngVO.setRtngDtl("123");
//		rtngVO.setRtngWrtr("123");
//		boolean createResult = rtngService.createRtng(rtngVO);
		
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
		
//		VdService vdService = new VdServiceImpl();
//		VdVO vdVO = new VdVO();
//		vdVO.setMvId("MV-20230309-00026");
//		vdVO.setVdTp("004");
//		vdVO.setVdTtl("호호");
//		vdVO.setThmbnl("3242");
//		vdVO.setVdPlyCnt(0);
//		vdVO.setVdUrl("234235");
//		vdVO.setVdId("VD-20230309-00028");
//		vdService.updateVd(vdVO);
		
	}
	
	
}
