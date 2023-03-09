package com.ktdsuniversity.edu.naver.mv.mv.vo;

import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;

public class PrdcPrtcptnPplVO extends MvPplVO {

	/**
	 * 임무
	 */
	private String mssn;
	
	/**
	 * 담당역할명
	 */
	private String rspnsbltRolNm;

	public String getMssn() {
		return mssn;
	}

	public void setMssn(String mssn) {
		this.mssn = mssn;
	}

	public String getRspnsbltRolNm() {
		return rspnsbltRolNm;
	}

	public void setRspnsbltRolNm(String rspnsbltRolNm) {
		this.rspnsbltRolNm = rspnsbltRolNm;
	}
	
	
}
