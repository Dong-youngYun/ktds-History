package com.ktdsuniversity.edu.naver.mv.cmpn.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.dao.CmpnDAO;
import com.ktdsuniversity.edu.naver.mv.cmpn.dao.CmpnDAOImpl;
import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;

public class CmpnServiceImpl implements CmpnService {
	
	private CmpnDAO cmpnDAO;
	
	public CmpnServiceImpl() {
		cmpnDAO = new CmpnDAOImpl();
	}

	@Override
	public boolean createCmpn(CmpnVO cmpnVO) {
		cmpnVO.setCmpnId(cmpnDAO.createNewCmpnId());
		return cmpnDAO.createCmpn(cmpnVO) > 0;
	}

	@Override
	public List<CmpnVO> readAllCmpn() {
		return null;
	}

	@Override
	public boolean updateCmpn(CmpnVO cmpnVO) {
		return cmpnDAO.updateCmpn(cmpnVO) > 0;
	}

	@Override
	public boolean deleteCmpn(String cmpnId) {
		return false;
	}

	
}
