package com.ktdsuniversity.edu.naver.mv.ntn.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class NtnDAOImpl extends AbstractDaoPoolSupport<NtnVO> implements NtnDAO {

	@Override
	public int createNtn(NtnVO ntnVO) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO NTN                    ");
		query.append("  (NTN_ID                       ");
		query.append(" , NTN_NM)                      ");
		query.append(" VALUES                         ");
		query.append(" (SEQ_NTN_PK.NEXTVAL/*NTN_ID*/ ");
		query.append(" , ?/*NTN_NM*/)        ");
		
		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, ntnVO.getNtnNm());
		});
	}

	@Override
	public List<NtnVO> readAllNtn() {
		return null;
	}

	@Override
	public int updateNtn(NtnVO ntnVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE NTN             ");
		query.append("    SET NTN_NM = ? ");
		query.append("  WHERE NTN_ID = ?      ");
		return super.update(query.toString(), (pstmt) -> {
			pstmt.setString(1, ntnVO.getNtnNm());
			pstmt.setInt(2, ntnVO.getNtnId());
		});
	}

	@Override
	public int deleteNtn(int NtnId) {
		return 0;
	}

}
