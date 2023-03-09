package com.ktdsuniversity.edu.naver.mv.mvppl.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class MvPplDAOImpl extends AbstractDaoPoolSupport<MvPplVO> implements MvPplDAO {

	@Override
	public String createNewMvPplId() {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT 'PD-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_MV_PPL_PK.NEXTVAL, 5, '0') NEW_SEQ ");
		query.append("   FROM DUAL ");
		return selectOneString(query.toString(), null, (rm) -> {
			return rm.getString("NEW_SEQ");
		});
	}
	
	@Override
	public int createMvPpl(MvPplVO mvPplVO) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO MV_PPL                   ");
		query.append("  (MV_PPL_ID                          ");
		query.append(" , PRFL_PCTR                          ");
		query.append(" , NM                                 ");
		query.append(" , RL_NM)                             ");
		query.append(" VALUES                               ");
		query.append("  (? /*MV_PPL_ID*/ ");
		query.append(" , ? /*PRFL_PCTR*/                     ");
		query.append(" , ? /*NM*/                            ");
		query.append(" , ? /*RL_NM*/)                        ");
		
		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvPplVO.getMvPplId());
			pstmt.setString(2, mvPplVO.getPrflPctr());
			pstmt.setString(3, mvPplVO.getNm());
			pstmt.setString(4, mvPplVO.getRlNm());
		});
	}

	@Override
	public List<MvPplVO> readAllMvPpl() {
		return null;
	}

	@Override
	public int updateMvPpl(MvPplVO mvPplVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE MV_PPL             ");
		query.append("    SET PRFL_PCTR = ? ");
		query.append("      , NM = ? ");
		query.append("      , RL_NM = ? ");
		query.append("  WHERE MV_PPL_ID = ?      ");
		return super.update(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvPplVO.getPrflPctr());
			pstmt.setString(2, mvPplVO.getNm());
			pstmt.setString(3, mvPplVO.getRlNm());
			pstmt.setString(4, mvPplVO.getMvPplId());
		});
	}

	@Override
	public int deleteMvPpl(String mvPplId) {
		return 0;
	}


}
