package com.ktdsuniversity.edu.naver.mv.vd.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;
import com.ktdsuniversity.edu.naver.mv.vd.vo.VdVO;

public interface VdDAO {

	public int createVd(VdVO vdVO);
	
	public List<VdVO> readAllVd();
	
	public int updateVd(VdVO vdVO);
	
	public int deleteVd(String vdId);
}
