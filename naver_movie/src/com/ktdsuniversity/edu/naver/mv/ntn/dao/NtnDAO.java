package com.ktdsuniversity.edu.naver.mv.ntn.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;

public interface NtnDAO {

	public int createNtn(NtnVO ntnVO);
	
	public List<NtnVO> readAllNtn();
	
	public int updateNtn(NtnVO ntnVO);
	
	public int deleteNtn(int NtnId);
	
}
