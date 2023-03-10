package com.ktdsuniversity.edu.naver.mv.ntn.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.ntn.dao.NtnDAO;
import com.ktdsuniversity.edu.naver.mv.ntn.dao.NtnDAOImpl;
import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;

public class NtnServiceImpl implements NtnService {

	private NtnDAO ntnDAO;
	
	public NtnServiceImpl() {
		ntnDAO = new NtnDAOImpl();
	}
	
	@Override
	public boolean createNtn(NtnVO ntnVO) {
		int insertCount = ntnDAO.createNtn(ntnVO);
		return insertCount > 0;
	}

	@Override
	public List<NtnVO> readAllNtn() {
		return ntnDAO.readAllNtn();
	}

	@Override
	public boolean updateNtn(NtnVO ntnVO) {
		return ntnDAO.updateNtn(ntnVO) > 0;
	}

	@Override
	public boolean deleteNtn(int NtnId) {
		return ntnDAO.deleteNtn(NtnId) > 0;
	}


	
}
