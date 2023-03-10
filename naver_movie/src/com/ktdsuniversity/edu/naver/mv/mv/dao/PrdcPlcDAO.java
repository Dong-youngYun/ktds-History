package com.ktdsuniversity.edu.naver.mv.mv.dao;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

public interface PrdcPlcDAO {

	/**
	 * 영화 제작지 등록
	 * @param mvVO
	 * @return 등록 건수
	 */
	public int createPrdcPlc(MvVO mvVO);
	
	public int deletePrdcPlc(String mvId);
	
}
