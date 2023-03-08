package com.ktdsuniversity.edu.naver.mv.mv.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

public class MvGnrDAOImpl implements MvGnrDAO {

	@Override
	public int createMvGnr(MvVO mvVO) {
		String mvId = mvVO.getMvId();
		List<GnrVO> gnrList = mvVO.getGnrList();
		
		
		return 0;
	}

}
