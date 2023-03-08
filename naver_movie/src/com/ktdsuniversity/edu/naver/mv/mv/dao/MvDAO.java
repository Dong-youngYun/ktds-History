package com.ktdsuniversity.edu.naver.mv.mv.dao;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

public interface MvDAO {

	/**
	 * 영화 등록 (영화의 순수한 정보만 등록)
	 * @param mvVO
	 * @return
	 */
	public int createMovie(MvVO mvVO);
	
	
}
