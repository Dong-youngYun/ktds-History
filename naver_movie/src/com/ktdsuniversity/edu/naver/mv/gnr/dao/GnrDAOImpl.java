package com.ktdsuniversity.edu.naver.mv.gnr.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class GnrDAOImpl extends AbstractDaoPoolSupport<GnrVO> implements GnrDAO {

	@Override
	public int createGnr(GnrVO gnrVO) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO GNR                ");
		query.append("  (GNR_ID                       ");
		query.append(" , GNR_NM)                      ");
		query.append(" VALUES                         ");
		query.append("  (SEQ_GNR_PK.NEXTVAL/*GNR_ID*/ ");
		query.append(" , ? /*GNR_NM*/)                ");
		 
		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, gnrVO.getGnrNm());
		});
		
	}

	@Override
	public List<GnrVO> readAllGnr() {
		return null;
	}

	@Override
	public int updateGnr(GnrVO gnrVO) {
		return 0;
	}

	@Override
	public int deleteGnr(int gnrId) {
		return 0;
	}

}
