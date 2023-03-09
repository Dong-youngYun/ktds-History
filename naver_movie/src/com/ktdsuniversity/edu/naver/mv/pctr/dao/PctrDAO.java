package com.ktdsuniversity.edu.naver.mv.pctr.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.pctr.vo.PctrVO;

public interface PctrDAO {

	public int createPctr(PctrVO pctrVO);
	
	public List<PctrVO> readAllPctr();
	
	public int updatePctr(PctrVO pctrVO);
	
	public int deletePctr(String pctrId);
	
}
