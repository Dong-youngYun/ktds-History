package com.ktdsuniversity.edu.naver.mv.ntn.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class NtnVO {
	
	@Column("NTN_ID")
	public int ntnId;
	
	@Column("NTN_NM")
	public String ntnNm;

	public int getNtnId() {
		return ntnId;
	}

	public void setNtnId(int ntnId) {
		this.ntnId = ntnId;
	}

	public String getNtnNm() {
		return ntnNm;
	}

	public void setNtnNm(String ntnNm) {
		this.ntnNm = ntnNm;
	}
	
}
