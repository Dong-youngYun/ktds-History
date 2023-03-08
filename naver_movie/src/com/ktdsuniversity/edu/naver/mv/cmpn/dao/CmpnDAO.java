package com.ktdsuniversity.edu.naver.mv.cmpn.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;

public interface CmpnDAO {
	
	public String createNewCmpnId();

	public int createCmpn(CmpnVO cmpnVO);
	
	public List<CmpnVO> readAllCmpn();
	
	public int updateCmpn(CmpnVO cmpnVO);
	
	public int deleteCmpn(String cmpnId);
	
}
