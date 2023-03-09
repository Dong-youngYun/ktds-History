package com.ktdsuniversity.edu.naver.mv.cmpn.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class CmpnDAOImpl extends AbstractDaoPoolSupport<CmpnVO> implements CmpnDAO {
	
	@Override
	public String createNewCmpnId() {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT 'CO-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_CMPN_PK.NEXTVAL, 5, '0') NEW_SEQ ");
		query.append("   FROM DUAL ");
		return selectOneString(query.toString(), null, (rt) -> {
			return rt.getString("NEW_SEQ");
		});
	}

	@Override
	public int createCmpn(CmpnVO cmpnVO) {
		StringBuffer query = new StringBuffer();                                                                  
		query.append(" INSERT INTO CMPN  ");
		query.append("  (CMPN_ID        ");
		query.append(" , CMPN_NM)       ");
		query.append(" VALUES          ");
		query.append("  (? /*CMPN_ID*/ ");
		query.append(" , ? /*CMPN_NM*/) ");   
		
		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, cmpnVO.getCmpnId());
			pstmt.setString(2, cmpnVO.getCmpnNm());
		});
	}

	@Override
	public List<CmpnVO> readAllCmpn() {
		return null;
	}

	@Override
	public int updateCmpn(CmpnVO cmpnVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE CMPN             ");
		query.append("    SET CMPN_NM = ? ");
		query.append("  WHERE CMPN_ID = ?      ");
		return super.update(query.toString(), (pstmt) -> {
			pstmt.setString(1, cmpnVO.getCmpnNm());
			pstmt.setString(2, cmpnVO.getCmpnId());
		});
	}

	@Override
	public int deleteCmpn(String cmpnId) {
		return 0;
	}


}
