package com.ktdsuniversity.edu.naver.mv.pctr.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.pctr.vo.PctrVO;

public interface PctrService {

	public boolean createPctr(PctrVO pctrVO);
	
	public List<PctrVO> readAllPctr();
	
	public boolean updatePctr(PctrVO pctrVO);
	
	public boolean deletePctr(String pctrId);
	
}
