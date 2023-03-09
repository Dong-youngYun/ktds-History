package com.ktdsuniversity.edu.naver.mv.fmsln.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.fmsln.vo.FmsLnVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class FmsLnDAOImpl extends AbstractDaoPoolSupport<FmsLnVO> implements FmsLnDAO {

	@Override
	public int createFmsLn(FmsLnVO fmsLnVO) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO MOVIE.FMS_LN ");
		query.append("  (FMS_LN_ID              ");
		query.append(" , MV_ID                  ");
		query.append(" , MV_PPL                 ");
		query.append(" , FMS_LN                 ");
		query.append(" , XPLNTN                 ");
		query.append(" , RGST_TM                ");
		query.append(" , RGST_PPL_NM            ");
		query.append(" , RCMMND_CNT)            ");
		query.append(" VALUES                   ");
		query.append("  ('FL-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_CMPN_PK.NEXTVAL, 5, '0')                     ");
		query.append(" , ?                     ");
		query.append(" , ?                     ");
		query.append(" , ?                     ");
		query.append(" , ?                     ");
		query.append(" , SYSDATE                     ");
		query.append(" , '윤동영'                     ");
		query.append(" , 0)                     ");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, fmsLnVO.getMvId());
			pstmt.setString(2, fmsLnVO.getMvPpl());
			pstmt.setString(3, fmsLnVO.getFmsLn());
			pstmt.setString(4, fmsLnVO.getXplntn());
		});
	}

	@Override
	public List<FmsLnVO> readAllFmsLn() {
		return null;
	}

	@Override
	public int updateFmsLn(FmsLnVO fmsLnVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE FMS_LN             ");
		query.append("    SET MV_ID = ? ");
		query.append("      ,  MV_PPL = ? ");
		query.append("      ,  FMS_LN = ? ");
		query.append("      , XPLNTN = ? ");
		query.append("      , RGST_TM = SYSDATE ");
		query.append("      , RGST_PPL_NM = ? ");
		query.append("      , RCMMND_CNT = ? ");
		query.append("  WHERE FMS_LN_ID = ?      ");
		return super.update(query.toString(), (pstmt) -> {
			pstmt.setString(1, fmsLnVO.getMvId());
			pstmt.setString(2, fmsLnVO.getMvPpl());
			pstmt.setString(3, fmsLnVO.getFmsLn());
			pstmt.setString(4, fmsLnVO.getXplntn());
			pstmt.setString(5, fmsLnVO.getRgstPplNm());
			pstmt.setInt(6, fmsLnVO.getRcmmndCnt());
			pstmt.setString(7, fmsLnVO.getFmsLnId());
		});
	}

	@Override
	public int deleteFmsLn(String fmsLnId) {
		return 0;
	}

}
