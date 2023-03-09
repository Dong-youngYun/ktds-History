package com.ktdsuniversity.edu.naver.mv.rtng.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.dao.RtngDAO;
import com.ktdsuniversity.edu.naver.mv.rtng.dao.RtngDAOImpl;
import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;

public class RtngServiceImpl implements RtngService {

	private RtngDAO rtngDAO;
	
	public RtngServiceImpl() {
		rtngDAO = new RtngDAOImpl();
	}
	
	@Override
	public boolean createRtng(RtngVO rtngVO) {
		int insertCount = rtngDAO.createRtng(rtngVO);
		return insertCount > 0;
	}

	@Override
	public List<RtngVO> readAllRtng() {
		return null;
	}

	@Override
	public boolean updateRtng(RtngVO rtngVO) {
		return rtngDAO.updateRtng(rtngVO) > 0;
	}

	@Override
	public boolean deleteRtng(String rtngId) {
		return false;
	}

}
