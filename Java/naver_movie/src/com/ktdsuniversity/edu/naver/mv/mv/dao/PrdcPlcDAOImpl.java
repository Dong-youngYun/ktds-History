package com.ktdsuniversity.edu.naver.mv.mv.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class PrdcPlcDAOImpl extends AbstractAutoDaoPoolSupport<NtnVO> implements PrdcPlcDAO {

	@Override
	public int createPrdcPlc(MvVO mvVO) {
		String mvId = mvVO.getMvId();
		List<NtnVO> ntnList = mvVO.getNtnList();
		
		int insertCount = 0;
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO PRDC_PLC ");
		query.append(" (NTN_ID              ");
		query.append(" , MV_ID)             ");
		query.append(" VALUES               ");
		query.append(" (?                   ");
		query.append(" , ?)               ");

		for (NtnVO ntn: ntnList) {
			insertCount += super.insert(query.toString(), (pstmt) -> {
				pstmt.setInt(1, ntn.getNtnId());
				pstmt.setString(2, mvId);
			});
		}
		return insertCount;
	}

	@Override
	public int deletePrdcPlc(String mvId) {
		StringBuffer query = new StringBuffer();
		query.append(" DELETE           ");
		query.append("   FROM PRDC_PLC    ");
		query.append("  WHERE MV_ID = ? ");
		
		return super.delete(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvId);
		});
		
	}

}
