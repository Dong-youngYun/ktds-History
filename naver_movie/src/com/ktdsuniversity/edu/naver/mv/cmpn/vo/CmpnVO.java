package com.ktdsuniversity.edu.naver.mv.cmpn.vo;

public class CmpnVO {

	/**
	 * 회사아이디
	 */
	public String cmpnId;
	/**
	 * 회사명
	 */
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
