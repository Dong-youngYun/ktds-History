package com.ktdsuniversity.edu.naver.mv.gnr.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class GnrVO {

	/**
	 * 장르아이디
	 */
	@Column("GNR_ID")
	private int gnrId;
	/**
	 * 장르명
	 */
	@Column("GNR_NM")
	private String gnrNm;
	
	/**
	 * 장르ID셋팅
	 * @param gnrId
	 */
	public void setGnrId(int gnrId) {
		this.gnrId = gnrId;
	}
	
	/**
	 * 장르ID 반환
	 * @return 장르ID
	 */
	public int getGnrId() {
		return gnrId;
	}
	
	/**
	 * 장르명 셋팅
	 * @param gnrNm
	 */
	public void setGnrNm(String gnrNm) {
		this.gnrNm = gnrNm;
	}
	
	/**
	 * 장르명 반환
	 * @return 장르명
	 */
	public String getGnrNm() {
		return gnrNm;
	}
}
