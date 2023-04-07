package com.ktdsuniversity.admin.mvppl.dao;

import java.util.List;

import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

public interface MvPplDAO {

	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO);
	public List<MvPplVO> readAllMvPplVONopagination(String nm);
	
	public MvPplVO readOneMvPplVOByMvPplId(String mvPplId); // update를 위한 비교를 위해 원본 정보를 가져오기
	
	public int createOneMvPpl(MvPplVO mvPplVO);
	
	public int updateOneMvPplByMvPplId(MvPplVO mvPplVO);
	
	public int deleteOneMvPplByMvPplId(String mvPplId);
	
	public int deleteMvPplBySelectedMvPplId(List<String> mvPplIdList);
	
}
