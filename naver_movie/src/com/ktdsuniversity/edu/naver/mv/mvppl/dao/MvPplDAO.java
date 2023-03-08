package com.ktdsuniversity.edu.naver.mv.mvppl.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;

public interface MvPplDAO {

	public String createNewMvPplId();
	
	public int createMvPpl(MvPplVO mvPplVO);
	
	public List<MvPplVO> readAllMvPpl();
	
	public int updateMvPpl(MvPplVO mvPplVO);
	
	public int deleteMvPpl(String mvPplId);
}
