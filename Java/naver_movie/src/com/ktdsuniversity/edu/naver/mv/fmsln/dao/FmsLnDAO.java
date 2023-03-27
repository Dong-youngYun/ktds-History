package com.ktdsuniversity.edu.naver.mv.fmsln.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.fmsln.vo.FmsLnVO;

public interface FmsLnDAO {

	public int createFmsLn(FmsLnVO fmsLnVO);
	
	public List<FmsLnVO> readAllFmsLn();
	
	public int updateFmsLn(FmsLnVO fmsLnVO);
	
	public int deleteFmsLn(String fmsLnId);
}
