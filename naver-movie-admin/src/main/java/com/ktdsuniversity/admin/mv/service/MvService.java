package com.ktdsuniversity.admin.mv.service;

import org.springframework.web.multipart.MultipartFile;

import com.ktdsuniversity.admin.mv.vo.MvVO;

public interface MvService {

	public boolean createNewMv(MvVO mvVO, MultipartFile uploadFile);
	
	public MvVO readOneMvByMvId(String mvId);
	
}
