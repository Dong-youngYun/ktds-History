package com.ktdsuniversity.edu.naver.mv.mv.dao;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

public interface MvGnrDAO {

	public int createMvGnr(MvVO mvVO); //영화ID 와 장르정보를 가진 MvVO를 파라미터로 설정
	
	public int deleteMvGnr(String mvId);
	
	
}
