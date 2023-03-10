package com.ktdsuniversity.edu.naver.mv.cmpn.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class CmpnVO {

	/**
	 * 회사아이디
	 */
	@Column("CMPN_ID")
	public String cmpnId;
	/**
	 * 회사명
	 */
	@Column("CMPN_NM")
	public String cmpnNm;

	/**
	 * 회사ID반환
	 * @return 회사ID
	 */
	public String getCmpnId() {
		return cmpnId;
	}

	/**
	 * 회사ID 셋팅
	 * @param cmpnId
	 */
	public void setCmpnId(String cmpnId) {
		this.cmpnId = cmpnId;
	}

	/**
	 * 회사명 반환
	 * @return 회사명
	 */
	public String getCmpnNm() {
		return cmpnNm;
	}

	/**
	 * 회사명 셋팅
	 * @param cmpnNm
	 */
	public void setCmpnNm(String cmpnNm) {
		this.cmpnNm = cmpnNm;
	}
}
