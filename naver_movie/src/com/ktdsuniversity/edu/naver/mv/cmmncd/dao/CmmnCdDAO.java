package com.ktdsuniversity.edu.naver.mv.cmmncd.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;

public interface CmmnCdDAO {

	public int createCmmnCd(CmmnCdVO cmmnCdVO);
	
	public List<CmmnCdVO> readAllCmmnCd();
	
	public int updateCmmnCd(CmmnCdVO cmmnCdVO);
	
	public int deleteCmmnCd(String cdId);
}
