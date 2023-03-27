package com.ktdsuniversity.edu.naver.mv.rtng.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class RtngVO {
	
	@Column("RTNG_ID")
	public String rtngId;
	
	@Column("MV_ID")
	public String mvId;
	
	@Column("RTNG")
	public int rtng;
	
	@Column("RTNG_DTL")
	public String rtngDtl;
	
	@Column("RTNG_WRTR")
	public String rtngWrtr;
	
	@Column("RTNG_WRT_TM")
	public String rtngWrtTm;
	
	@Column("LK_CNT")
	public int lkCnt;
	
	@Column("DSLK_CNT")
	public int dslkCnt;

	public String getRtngId() {
		return rtngId;
	}

	public void setRtngId(String rtngId) {
		this.rtngId = rtngId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public int getRtng() {
		return rtng;
	}

	public void setRtng(int rtng) {
		this.rtng = rtng;
	}

	public String getRtngDtl() {
		return rtngDtl;
	}

	public void setRtngDtl(String rtngDtl) {
		this.rtngDtl = rtngDtl;
	}

	public String getRtngWrtr() {
		return rtngWrtr;
	}

	public void setRtngWrtr(String rtngWrtr) {
		this.rtngWrtr = rtngWrtr;
	}

	public String getRtngWrtTm() {
		return rtngWrtTm;
	}

	public void setRtngWrtTm(String rtngWrtTm) {
		this.rtngWrtTm = rtngWrtTm;
	}

	public int getLkCnt() {
		return lkCnt;
	}

	public void setLkCnt(int lkCnt) {
		this.lkCnt = lkCnt;
	}

	public int getDslkCnt() {
		return dslkCnt;
	}

	public void setDslkCnt(int dslkCnt) {
		this.dslkCnt = dslkCnt;
	}
	
	
	
}

