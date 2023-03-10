package com.ktdsuniversity.edu.naver.mv.mvppl.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class MvPplVO {
	
	@Column("MV_PPL_ID")
	public String mvPplId;
	
	@Column("PRFL_PCTR")
	public String prflPctr;
	
	@Column("NM")
	public String nm;
	
	@Column("RL_NM")
	public String rlNm;

	public String getMvPplId() {
		return mvPplId;
	}

	public void setMvPplId(String mvPplId) {
		this.mvPplId = mvPplId;
	}

	public String getPrflPctr() {
		return prflPctr;
	}

	public void setPrflPctr(String prflPctr) {
		this.prflPctr = prflPctr;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getRlNm() {
		return rlNm;
	}

	public void setRlNm(String rlNm) {
		this.rlNm = rlNm;
	}
	
	
	
}
