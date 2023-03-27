package com.ktdsuniversity.edu.naver.mv.vd.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;
import com.ktdsuniversity.edu.naver.mv.vd.vo.VdVO;

public interface VdService {

	public boolean createVd(VdVO vdVO);
	
	public List<VdVO> readAllVd();
	
	public boolean updateVd(VdVO vdVO);
	
	public boolean deleteVd(String vdId);
}
