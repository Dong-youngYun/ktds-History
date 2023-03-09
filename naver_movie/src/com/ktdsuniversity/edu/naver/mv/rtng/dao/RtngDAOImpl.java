package com.ktdsuniversity.edu.naver.mv.rtng.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtngVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractDaoPoolSupport;

public class RtngDAOImpl extends AbstractDaoPoolSupport<RtngVO> implements RtngDAO {

	@Override
	public int createRtng(RtngVO rtngVO) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO RTNG ");
		query.append(" (RTNG_ID         ");
		query.append(" , MV_ID          ");
		query.append(" , RTNG           ");
		query.append(" , RTNG_DTL       ");
		query.append(" , RTNG_WRTR      ");
		query.append(" , RTNG_WRT_TM    ");
		query.append(" , LK_CNT         ");
		query.append(" , DSLK_CNT)      ");
		query.append(" VALUES           ");
		query.append("  ('MR-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_CMPN_PK.NEXTVAL, 5, '0')  ");
		query.append(" , ?             ");
		query.append(" , ?              ");
		query.append(" , ?             ");
		query.append(" , ?             ");
		query.append(" , SYSDATE        "); //DB에 들어간 날짜를 기록
		query.append(" , 0              "); //등록이 처음되는 것이라서 0으로 설정
		query.append(" , 0)             ");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, rtngVO.getMvId());
			pstmt.setInt(2, rtngVO.getRtng());
			pstmt.setString(3, rtngVO.getRtngDtl());
			pstmt.setString(4, rtngVO.getRtngWrtr());
		});
	}

	@Override
	public List<RtngVO> readAllRtng() {
		return null;
	}

	@Override
	public int updateRtng(RtngVO rtngVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE RTNG             ");
		query.append("    SET MV_ID = ? ");
		query.append("    , RTNG = ? ");
		query.append("    , RTNG_DTL = ? ");
		query.append("    , RTNG_WRTR = ? ");
		query.append("    , RTNG_WRT_TM = SYSDATE ");
		query.append("    , LK_CNT = ? ");
		query.append("    , DSLK_CNT = ? ");
		query.append("  WHERE RTNG_ID = ?      ");
		return super.update(query.toString(), (pstmt) -> {
			pstmt.setString(1, rtngVO.getMvId());
			pstmt.setInt(2, rtngVO.getRtng());
			pstmt.setString(3, rtngVO.getRtngDtl());
			pstmt.setString(4, rtngVO.getRtngWrtr());
			pstmt.setInt(5, rtngVO.getLkCnt());
			pstmt.setInt(6, rtngVO.getDslkCnt());
			pstmt.setString(7, rtngVO.getRtngId());
		});
	}

	@Override
	public int deleteRtng(String rtngId) {
		return 0;
	}

}
