package com.ktdsuniversity.edu.naver.mv.rtng.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;

public interface RtngDAO {
	
	public int createRtng(RtngVO rtngVO);
	
	public List<RtngVO> readAllRtng();
	
	public int updateRtng(RtngVO rtngVO);
	
	public int deleteRtng(String rtngId);

}
