package com.ktdsuniversity.admin.mvppl.service;

import java.util.List;

import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

public interface MvPplService {

	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO);
	
	public boolean createOneMvPpl(MvPplVO mvPplVO);
	
	public boolean updateOneMvPplByMvPplId(MvPplVO mvPplVO);
	
	public boolean deleteOneMvPplByMvPplId(String mvPplId);
	
	public boolean deleteMvPplBySelectedMvPplId(List<String> mvPplIdList);
}
