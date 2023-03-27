package com.ktdsuniversity.edu.naver.mv.cmmncd.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;
/**
 * CmmnCd 테이블과 연동하기 위한 DAO
 * @author User
 *
 */
public interface CmmnCdDAO {

	public int createCmmnCd(CmmnCdVO cmmnCdVO);
	
	public List<CmmnCdVO> readAllCmmnCd();
	
	public int updateCmmnCd(CmmnCdVO cmmnCdVO);
	
	public int deleteCmmnCd(String cdId);
}
