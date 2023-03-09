package com.ktdsuniversity.edu.naver.mv.vd.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;
import com.ktdsuniversity.edu.naver.mv.vd.dao.VdDAO;
import com.ktdsuniversity.edu.naver.mv.vd.dao.VdDAOImpl;
import com.ktdsuniversity.edu.naver.mv.vd.vo.VdVO;

public class VdServiceImpl implements VdService {

	private VdDAO vdDAO;
	
	public VdServiceImpl() {
		vdDAO = new VdDAOImpl();
	}
	@Override
	public boolean createVd(VdVO vdVO) {
		int insertCount = vdDAO.createVd(vdVO);
		return insertCount > 0;
	}

	@Override
	public List<VdVO> readAllVd() {
		return null;
	}

	@Override
	public boolean updateVd(VdVO vdVO) {
		return vdDAO.updateVd(vdVO) > 0;
	}

	@Override
	public boolean deleteVd(String vdId) {
		return false;
	}

}
