package com.ktdsuniversity.admin.mvppl.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

public interface MvPplService {

	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO);
	
	public boolean createOneMvPpl(MvPplVO mvPplVO, MultipartFile uploadFile);
	
	public boolean updateOneMvPplByMvPplId(MvPplVO mvPplVO, MultipartFile uploadFile);
	
	public boolean deleteOneMvPplByMvPplId(String mvPplId);
	
	public boolean deleteMvPplBySelectedMvPplId(List<String> mvPplIdList);
}
