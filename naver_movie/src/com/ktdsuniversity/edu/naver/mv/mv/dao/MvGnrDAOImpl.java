package com.ktdsuniversity.edu.naver.mv.mv.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class MvGnrDAOImpl extends AbstractAutoDaoPoolSupport<GnrVO> implements MvGnrDAO {

	@Override
	public int createMvGnr(MvVO mvVO) { //모든 정보를 가진 MvVO 사용
		String mvId = mvVO.getMvId();
		List<GnrVO> gnrList = mvVO.getGnrList();
		
		int insertCount = 0;
		StringBuffer query = new StringBuffer();     
		query.append(" INSERT INTO MV_GNR                ");
		query.append("  (MV_ID                       ");
		query.append(" , GNR_ID)                      ");
		query.append(" VALUES                         ");
		query.append("  (?  ");
		query.append(" , ?)        ");
		
		for (GnrVO gnr: gnrList) {
			insertCount += super.insert(query.toString(), (pstmt) -> { //호출하는만큼 insertCount에 더한다. 이 코드를 서비스에 넣을 수 없어서 DAO에 (복잡해서) 
				pstmt.setString(1, mvId);
				pstmt.setInt(2, gnr.getGnrId());
			});
		}
		
		return insertCount;
	}

	@Override
	public int deleteMvGnr(String mvId) {
		StringBuffer query = new StringBuffer();
		query.append(" DELETE           ");
		query.append("   FROM MV_GNR    ");
		query.append("  WHERE MV_ID = ? ");
		
		return super.delete(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvId);
		});
	}

}
