package com.ktdsuniversity.edu.naver.mv.pctr.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.pctr.dao.PctrDAO;
import com.ktdsuniversity.edu.naver.mv.pctr.dao.PctrDAOImpl;
import com.ktdsuniversity.edu.naver.mv.pctr.vo.PctrVO;

public class PctrServiceImpl implements PctrService {

	private PctrDAO pctrDAO;
	
	public PctrServiceImpl() {
		pctrDAO = new PctrDAOImpl();
	}
	
	@Override
	public boolean createPctr(PctrVO pctrVO) {
		int insertCount = pctrDAO.createPctr(pctrVO);
		return insertCount > 0;
	}

	@Override
	public List<PctrVO> readAllPctr() {
		return pctrDAO.readAllPctr();
	}

	@Override
	public boolean updatePctr(PctrVO pctrVO) {
		return pctrDAO.updatePctr(pctrVO) > 0;
	}

	@Override
	public boolean deletePctr(String pctrId) {
		return pctrDAO.deletePctr(pctrId) > 0;
	}

}
