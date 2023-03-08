package com.ktdsuniversity.edu.naver.mv.cmpn.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;

public interface CmpnService {

	public boolean createCmpn(CmpnVO cmpnVO);
	
	public List<CmpnVO> readAllCmpn();
	
	public boolean updateCmpn(CmpnVO cmpnVO);
	
	public boolean deleteCmpn(String cmpnId);
}
