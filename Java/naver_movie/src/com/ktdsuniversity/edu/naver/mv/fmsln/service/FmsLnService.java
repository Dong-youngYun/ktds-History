package com.ktdsuniversity.edu.naver.mv.fmsln.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.fmsln.vo.FmsLnVO;

public interface FmsLnService {

	public boolean createFmsLn(FmsLnVO fmsLnVO);
	
	public List<FmsLnVO> readAllFmsLn();
	
	public boolean updateFmsLn(FmsLnVO fmsLnVO);
	
	public boolean deleteFmsLn(String fmsLnId);
	
}
