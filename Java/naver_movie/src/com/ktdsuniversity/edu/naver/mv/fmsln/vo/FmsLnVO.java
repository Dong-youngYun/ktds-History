package com.ktdsuniversity.edu.naver.mv.fmsln.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class FmsLnVO {
	
	@Column("FMS_LN_ID")
	public String fmsLnId;
	
	@Column("MV_ID")
	public String mvId;
	
	@Column("MV_PPL")
	public String mvPpl;
	
	@Column("FMS_LN")
	public String fmsLn;
	
	@Column("XPLNTN")
	public String xplntn;
	
	@Column("RGST_TM")
	public String rgstTm;
	
	@Column("RGST_PPL_NM")
	public String rgstPplNm;
	
	@Column("RCMMND_CNT")
	public int rcmmndCnt;

	public String getFmsLnId() {
		return fmsLnId;
	}

	public void setFmsLnId(String fmsLnId) {
		this.fmsLnId = fmsLnId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getMvPpl() {
		return mvPpl;
	}

	public void setMvPpl(String mvPpl) {
		this.mvPpl = mvPpl;
	}

	public String getFmsLn() {
		return fmsLn;
	}

	public void setFmsLn(String fmsLn) {
		this.fmsLn = fmsLn;
	}

	public String getXplntn() {
		return xplntn;
	}

	public void setXplntn(String xplntn) {
		this.xplntn = xplntn;
	}

	public String getRgstTm() {
		return rgstTm;
	}

	public void setRgstTm(String rgstTm) {
		this.rgstTm = rgstTm;
	}

	public String getRgstPplNm() {
		return rgstPplNm;
	}

	public void setRgstPplNm(String rgstPplNm) {
		this.rgstPplNm = rgstPplNm;
	}

	public int getRcmmndCnt() {
		return rcmmndCnt;
	}

	public void setRcmmndCnt(int rcmmndCnt) {
		this.rcmmndCnt = rcmmndCnt;
	}
	
	
	
}
