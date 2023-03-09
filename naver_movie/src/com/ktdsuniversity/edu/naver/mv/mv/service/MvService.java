package com.ktdsuniversity.edu.naver.mv.mv.service;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

public interface MvService {

	/**
	 * 영화 등록 
	 * @param mvVO
	 * @return 영화등록 성공여부
	 */
	public boolean createMv(MvVO mvVO);
	
}
