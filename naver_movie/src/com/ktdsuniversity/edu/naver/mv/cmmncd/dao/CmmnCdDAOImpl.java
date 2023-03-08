package com.ktdsuniversity.edu.naver.mv.cmmncd.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class CmmnCdDAOImpl extends AbstractDaoPoolSupport<CmmnCdVO> implements CmmnCdDAO {

	@Override
	public int createCmmnCd(CmmnCdVO cmmnCdVO) {
		StringBuffer query = new StringBuffer(); 
		query.append(" INSERT INTO CMMN_CD ");
		query.append("  (CD_ID             ");
		query.append(" , CD_NM)            ");
		query.append(" VALUES              ");
		query.append("  (?/*CD_ID*/        ");
		query.append(" , ? /*CD_NM*/      ");
		query.append(" , ? /*PRCDNC_CD_NM*/)      ");
		
		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, cmmnCdVO.getCdId());
			pstmt.setString(2, cmmnCdVO.getCdNm());
			pstmt.setString(3, cmmnCdVO.getPrcdncCdId());
		});
	}

	@Override
	public List<CmmnCdVO> readAllCmmnCd() {
		return null;
	}

	@Override
	public int updateCmmnCd(CmmnCdVO cmmnCdVO) {
		return 0;
	}

	@Override
	public int deleteCmmnCd(String cdId) {
		return 0;
	}

}
