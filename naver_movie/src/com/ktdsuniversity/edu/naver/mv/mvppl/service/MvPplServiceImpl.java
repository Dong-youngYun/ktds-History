package com.ktdsuniversity.edu.naver.mv.mvppl.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mvppl.dao.MvPplDAO;
import com.ktdsuniversity.edu.naver.mv.mvppl.dao.MvPplDAOImpl;
import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;

public class MvPplServiceImpl implements MvPplService {

	private MvPplDAO mvPplDAO;
	
	public MvPplServiceImpl() {
		mvPplDAO = new MvPplDAOImpl();
	}
	
	@Override
	public boolean createMvPpl(MvPplVO mvPplVO) {
		mvPplVO.setMvPplId(mvPplDAO.createNewMvPplId());
	
		return mvPplDAO.createMvPpl(mvPplVO) > 0;
	}

	@Override
	public List<MvPplVO> readAllMvPpl() {
		return null;
	}

	@Override
	public boolean updateMvPpl(MvPplVO mvPplVO) {
		return mvPplDAO.updateMvPpl(mvPplVO) > 0;
	}

	@Override
	public boolean deleteMvPpl(String mvPplId) {
		return false;
	}

}
