package com.ktdsuniversity.edu.naver.mv.vd.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;
import com.ktdsuniversity.edu.naver.mv.vd.vo.VdVO;

public class VdDAOImpl extends AbstractDaoPoolSupport<VdVO> implements VdDAO {

	@Override
	public int createVd(VdVO vdVO) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO VD  ");
		query.append("  (VD_ID         ");
		query.append(" , MV_ID         ");
		query.append(" , VD_TP         ");
		query.append(" , VD_TTL        ");
		query.append(" , THMBNL        ");
		query.append(" , VD_PLY_CNT    ");
		query.append(" , VD_URL        ");
		query.append(" , RGST_DT)      ");
		query.append(" VALUES          ");
		query.append("  ('VD-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_CMPN_PK.NEXTVAL, 5, '0')  ");
		query.append(" , ?            ");
		query.append(" , ?            ");
		query.append(" , ?            ");
		query.append(" , ?            ");
		query.append(" , 0             ");
		query.append(" , ?            ");
		query.append(" , SYSDATE )     ");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, vdVO.mvId);
			pstmt.setString(2, vdVO.vdTp);
			pstmt.setString(3, vdVO.vdTtl);
			pstmt.setString(4, vdVO.thmbnl);
			pstmt.setString(5, vdVO.vdUrl);
		});
	}

	@Override
	public List<VdVO> readAllVd() {
		return null;
	}

	@Override
	public int updateVd(VdVO vdVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE VD             ");
		query.append("    SET MV_ID = ? ");
		query.append("      ,  VD_TP = ? ");
		query.append("      ,  VD_TTL = ? ");
		query.append("      , THMBNL = ? ");
		query.append("      , VD_PLY_CNT = ? ");
		query.append("      , VD_URL = ? ");
		query.append("  WHERE VD_ID = ?      ");
		return super.update(query.toString(), (pstmt) -> {
			pstmt.setString(1, vdVO.getMvId());
			pstmt.setString(2, vdVO.getVdTp());
			pstmt.setString(3, vdVO.getVdTtl());
			pstmt.setString(4, vdVO.getThmbnl());
			pstmt.setInt(5, vdVO.getVdPlyCnt());
			pstmt.setString(6, vdVO.getVdUrl());
			pstmt.setString(7, vdVO.getVdId());
		});
	}

	@Override
	public int deleteVd(String vdId) {
		return 0;
	}

}
