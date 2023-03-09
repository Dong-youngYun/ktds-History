package com.ktdsuniversity.edu.naver.mv.mv.service;

import com.ktdsuniversity.edu.naver.mv.mv.dao.MvDAO;
import com.ktdsuniversity.edu.naver.mv.mv.dao.MvDAOImpl;
import com.ktdsuniversity.edu.naver.mv.mv.dao.MvGnrDAO;
import com.ktdsuniversity.edu.naver.mv.mv.dao.MvGnrDAOImpl;
import com.ktdsuniversity.edu.naver.mv.mv.dao.PrdcPlcDAO;
import com.ktdsuniversity.edu.naver.mv.mv.dao.PrdcPlcDAOImpl;
import com.ktdsuniversity.edu.naver.mv.mv.dao.PrdcPrtcptnCmpnDAO;
import com.ktdsuniversity.edu.naver.mv.mv.dao.PrdcPrtcptnCmpnDAOImpl;
import com.ktdsuniversity.edu.naver.mv.mv.dao.PrdcPrtcptnPplDAO;
import com.ktdsuniversity.edu.naver.mv.mv.dao.PrdcPrtcptnPplDAOImpl;
import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

public class MvServiceImpl implements MvService {

	private MvDAO mvDAO;
	private MvGnrDAO mvGnrDAO;
	private PrdcPlcDAO prdcPlcDAO;
	private PrdcPrtcptnCmpnDAO prdcPrtcptnCmpnDAO;
	private PrdcPrtcptnPplDAO prdcPrtcptnPplDAO;
	
	public MvServiceImpl() {
		mvDAO = new MvDAOImpl();
		mvGnrDAO = new MvGnrDAOImpl();
		prdcPlcDAO = new PrdcPlcDAOImpl(); 
		prdcPrtcptnCmpnDAO = new PrdcPrtcptnCmpnDAOImpl();
		prdcPrtcptnPplDAO = new PrdcPrtcptnPplDAOImpl();
		
	}
	
	@Override
	public boolean createMv(MvVO mvVO) {
		// 1. 영화의 새로운 ID를 발급받는다.
		String newMvId = mvDAO.createNewMvId();
		
		// 2. 발급받은 ID를 mvVO의 mvId에 할당한다.
		mvVO.setMvId(newMvId);
		
		// 3. 영화를 등록한다.
		int insertCount = mvDAO.createMv(mvVO);
		
		// 4. 영화_장르를 등록한다.
		if (insertCount == 1) {
			insertCount += mvGnrDAO.createMvGnr(mvVO);
		}
		
		// 5. 제작지를 등록한다.
		if (insertCount >= 2) { // 장르가 최소 1개 이상 들어가있어서
			insertCount += prdcPlcDAO.createPrdcPlc(mvVO);
		}
		
		// 6. 영화참여회사를 등록한다.
		if(insertCount >=3) {
		   insertCount += prdcPrtcptnCmpnDAO.createPrdcPrtcptnCmpn(mvVO);
		}
		
		// 7. 영화참여인을 등록한다.
		if(insertCount >=4) {
		   insertCount += prdcPrtcptnPplDAO.createPrdcPrtcptnPpl(mvVO);
		}
		
		return false;
	}

}
