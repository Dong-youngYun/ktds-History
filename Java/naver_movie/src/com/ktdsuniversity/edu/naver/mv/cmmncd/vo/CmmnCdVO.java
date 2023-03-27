package com.ktdsuniversity.edu.naver.mv.cmmncd.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class CmmnCdVO {

	@Column("CD_ID")
	public String cdId;
	
	@Column("CD_NM")
	public String cdNm;
	
	@Column("PRCDNC_CD_ID")
	public String prcdncCdId;

	public String getCdId() {
		return cdId;
	}

	public void setCdId(String cdId) {
		this.cdId = cdId;
	}

	public String getCdNm() {
		return cdNm;
	}

	public void setCdNm(String cdNm) {
		this.cdNm = cdNm;
	}

	public String getPrcdncCdId() {
		return prcdncCdId;
	}

	public void setPrcdncCdId(String prcdncCdId) {
		this.prcdncCdId = prcdncCdId;
	}
}
