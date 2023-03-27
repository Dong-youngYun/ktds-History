package com.ktdsuniversity.edu.naver.mv.ntn.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;

public interface NtnService {

	public boolean createNtn(NtnVO ntnVO);
	
	public List<NtnVO> readAllNtn();
	
	public boolean updateNtn(NtnVO ntnVO);
	
	public boolean deleteNtn(int NtnId);
}
