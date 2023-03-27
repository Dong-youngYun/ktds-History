package com.ktdsuniversity.edu.naver.mv.vd.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class VdVO {

	@Column("VD_ID")
	public String vdId;
	
	@Column("MV_ID")
	public String mvId;
	
	@Column("VD_TP")
	public String vdTp;
	
	@Column("VD_TTL")
	public String vdTtl;
	
	@Column("THMBNL")
	public String thmbnl;
	
	@Column("VD_PLY_CNT")
	public int vdPlyCnt;
	
	@Column("VD_URL")
	public String vdUrl;
	
	@Column("RGST_DT")
	public String rgstDt;

	public String getVdId() {
		return vdId;
	}

	public void setVdId(String vdId) {
		this.vdId = vdId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getVdTp() {
		return vdTp;
	}

	public void setVdTp(String vdTp) {
		this.vdTp = vdTp;
	}

	public String getVdTtl() {
		return vdTtl;
	}

	public void setVdTtl(String vdTtl) {
		this.vdTtl = vdTtl;
	}

	public String getThmbnl() {
		return thmbnl;
	}

	public void setThmbnl(String thmbnl) {
		this.thmbnl = thmbnl;
	}

	public int getVdPlyCnt() {
		return vdPlyCnt;
	}

	public void setVdPlyCnt(int vdPlyCnt) {
		this.vdPlyCnt = vdPlyCnt;
	}

	public String getVdUrl() {
		return vdUrl;
	}

	public void setVdUrl(String vdUrl) {
		this.vdUrl = vdUrl;
	}

	public String getRgstDt() {
		return rgstDt;
	}

	public void setRgstDt(String rgstDt) {
		this.rgstDt = rgstDt;
	}
	
	
}

