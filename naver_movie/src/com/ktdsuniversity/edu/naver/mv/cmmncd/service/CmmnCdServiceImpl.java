package com.ktdsuniversity.edu.naver.mv.cmmncd.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.dao.CmmnCdDAO;
import com.ktdsuniversity.edu.naver.mv.cmmncd.dao.CmmnCdDAOImpl;
import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;

public class CmmnCdServiceImpl implements CmmnCdService {

	private CmmnCdDAO cmmnCdDAO;
	
	public CmmnCdServiceImpl() {
		cmmnCdDAO = new CmmnCdDAOImpl();
	}
	
	@Override
	public boolean createCmmnCd(CmmnCdVO cmmnCdVO) {
		int insertCount = cmmnCdDAO.createCmmnCd(cmmnCdVO);
		return insertCount > 0;
	}

	@Override
	public List<CmmnCdVO> readAllCmmnCd() {
		return null;
	}

	@Override
	public boolean updateCmmnCd(CmmnCdVO cmmnCdVO) {
		return false;
	}

	@Override
	public boolean deleteCmmnCd(String cdId) {
		return false;
	}

}
