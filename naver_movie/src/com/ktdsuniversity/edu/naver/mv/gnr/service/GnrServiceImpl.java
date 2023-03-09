package com.ktdsuniversity.edu.naver.mv.gnr.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.dao.GnrDAO;
import com.ktdsuniversity.edu.naver.mv.gnr.dao.GnrDAOImpl;
import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;

public class GnrServiceImpl implements GnrService {
	
	private GnrDAO gnrDAO;
	
	public GnrServiceImpl() {
		gnrDAO = new GnrDAOImpl();
	}

	@Override
	public boolean createGnr(GnrVO gnrVO) {
		int insertCount = gnrDAO.createGnr(gnrVO);
		return insertCount > 0;
	}

	@Override
	public List<GnrVO> readAllGnr() {
		return null;
	}

	@Override
	public boolean updateGnr(GnrVO gnrVO) {
		return gnrDAO.updateGnr(gnrVO) > 0;
	}

	@Override
	public boolean deleteGnr(int gnrId) {
		return false;
	}

}
