package com.ktdsuniversity.edu.naver.mv.pctr.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class PctrVO {
	
	@Column("PCTR_ID")
	public String pctrId;
	
	@Column("MV_ID")
	public String mvId;
	
	@Column("TP")
	public String tp;
	
	@Column("THMBNL_PCTR")
	public String thmbnlPctr;
	
	@Column("ORGN_PCTR")
	public String orgnPctr;
	
	public String getPctrId() {
		return pctrId;
	}

	public void setPctrId(String pctrId) {
		this.pctrId = pctrId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public String getThmbnlPctr() {
		return thmbnlPctr;
	}

	public void setThmbnlPctr(String thmbnlPctr) {
		this.thmbnlPctr = thmbnlPctr;
	}

	public String getOrgnPctr() {
		return orgnPctr;
	}

	public void setOrgnPctr(String orgnPctr) {
		this.orgnPctr = orgnPctr;
	}
}
