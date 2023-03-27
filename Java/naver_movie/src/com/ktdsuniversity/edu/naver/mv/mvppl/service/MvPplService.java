package com.ktdsuniversity.edu.naver.mv.mvppl.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;

public interface MvPplService {

	public boolean createMvPpl(MvPplVO mvPplVO);
	
	public List<MvPplVO> readAllMvPpl();
	
	public boolean updateMvPpl(MvPplVO mvPplVO);
	
	public boolean deleteMvPpl(String mvPplId);
}
