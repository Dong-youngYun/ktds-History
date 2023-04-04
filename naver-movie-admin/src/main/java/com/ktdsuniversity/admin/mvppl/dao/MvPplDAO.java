package com.ktdsuniversity.admin.mvppl.dao;

import java.util.List;

import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

public interface MvPplDAO {

	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO);
	
	public int createOneMvPpl(MvPplVO mvPplVO);
	
	public int updateOneMvPplByMvPplId(MvPplVO mvPplVO);
	
	public int deleteOneMvPplByMvPplId(String mvPplId);
	
	public int deleteMvPplBySelectedMvPplId(List<String> mvPplIdList);
	
}
