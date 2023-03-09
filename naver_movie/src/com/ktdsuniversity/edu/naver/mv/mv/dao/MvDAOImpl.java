package com.ktdsuniversity.edu.naver.mv.mv.dao;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class MvDAOImpl extends AbstractDaoPoolSupport<MvVO> implements MvDAO {
	
	@Override
	public String createNewMvId() {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT 'MV-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_MV_PK.NEXTVAL, 5, '0') NEW_SEQ ");
		query.append("   FROM DUAL ");
		return super.selectOneString(query.toString(), null, (rs) -> {
			return rs.getString("NEW_SEQ");
		});
	}

	@Override
	public int createMv(MvVO mvVO) {
		StringBuffer query = new StringBuffer();                                                         
		query.append(" INSERT INTO MOVIE.MV                                                               ");
		query.append("  (MV_ID                                                                            ");
		query.append("  , MV_TTL                                                                          ");
		query.append("  , ENG_TTL                                                                         ");
		query.append("  , SCRN_STT                                                                        ");
		query.append("  , SCRN_TM                                                                         ");
		query.append("  , OPNG_DT                                                                         ");
		query.append("  , GRD                                                                             ");
		query.append("  , PSTR                                                                            ");
		query.append("  , SMR)                                                                            ");
		query.append("  VALUES                                                                            ");
		query.append("   ( ? ");
		query.append("   , ?   ");
		query.append("   , ?   ");
		query.append("   , ?   ");
		query.append("   , ?   ");
		query.append("   , TO_DATE(?, 'YYYYMMDD')     ");
		query.append("   , ?   ");
		query.append("   , ?   ");
		query.append("   , ?)  ");
		return super.insert(query.toString(), (pstmt) -> {
			
			pstmt.setString(1, mvVO.getMvId());
			pstmt.setString(2, mvVO.getMvTtl());
			pstmt.setString(3, mvVO.getEngTtl());
			pstmt.setString(4, mvVO.getScrnStt());
			pstmt.setInt(5, mvVO.getScrnTm());
			pstmt.setString(6, mvVO.getOpngDt());
			pstmt.setString(7, mvVO.getGrd());
			pstmt.setString(8, mvVO.getPstr());
			pstmt.setString(9, mvVO.getSmr());
		});
	}


	
	
}
