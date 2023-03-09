package com.ktdsuniversity.edu.naver.mv.mv.dao;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

public interface MvDAO {

	/**
	 * 영화의 새로운 PK(ID)를 발급 받는다.
	 * @return 영화의 새로운 ID
	 */
	public String createNewMvId();
	
	/**
	 * 영화 등록 (영화의 순수한 정보만 등록)
	 * @param mvVO
	 * @return
	 */
	public int createMv(MvVO mvVO);
	
	
}
