package com.ktdsuniversity.edu.naver.mv.rtng.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;

public interface RtngService {

	
	public boolean createRtng(RtngVO rtngVO);
	
	public List<RtngVO> readAllRtng();
	
	public boolean updateRtng(RtngVO rtngVO);
	
	public boolean deleteRtng(String rtngId);
}
