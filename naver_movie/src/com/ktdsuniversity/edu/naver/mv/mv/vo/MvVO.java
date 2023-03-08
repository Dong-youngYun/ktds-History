package com.ktdsuniversity.edu.naver.mv.mv.vo;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;
import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;
import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;

public class MvVO {

	private String mvId;
	private String mvTtl;
	private String engTtl;
	private String scrnStt;
	private int scrnTm;
	private String opngDt;
	private String grd;
	private String pstr;
	private String smr;
	
	//여러개가 들어와서 list로 표현
	private List<GnrVO> gnrList;
	private List<NtnVO> ntnList;
	private List<CmpnVO> cmpnList;
	private List<MvPplVO> mvPplList;
	
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getMvTtl() {
		return mvTtl;
	}
	public void setMvTtl(String mvTtl) {
		this.mvTtl = mvTtl;
	}
	public String getEngTtl() {
		return engTtl;
	}
	public void setEngTtl(String engTtl) {
		this.engTtl = engTtl;
	}
	public String getScrnStt() {
		return scrnStt;
	}
	public void setScrnStt(String scrnStt) {
		this.scrnStt = scrnStt;
	}
	public int getScrnTm() {
		return scrnTm;
	}
	public void setScrnTm(int scrnTm) {
		this.scrnTm = scrnTm;
	}
	public String getOpngDt() {
		return opngDt;
	}
	public void setOpngDt(String opngDt) {
		this.opngDt = opngDt;
	}
	public String getGrd() {
		return grd;
	}
	public void setGrd(String grd) {
		this.grd = grd;
	}
	public String getPstr() {
		return pstr;
	}
	public void setPstr(String pstr) {
		this.pstr = pstr;
	}
	public String getSmr() {
		return smr;
	}
	public void setSmr(String smr) {
		this.smr = smr;
	}
	public List<GnrVO> getGnrList() {
		return gnrList;
	}
	public void setGnrList(List<GnrVO> gnrList) {
		this.gnrList = gnrList;
	}
	public List<NtnVO> getNtnList() {
		return ntnList;
	}
	public void setNtnList(List<NtnVO> ntnList) {
		this.ntnList = ntnList;
	}
	public List<CmpnVO> getCmpnList() {
		return cmpnList;
	}
	public void setCmpnList(List<CmpnVO> cmpnList) {
		this.cmpnList = cmpnList;
	}
	public List<MvPplVO> getMvPplList() {
		return mvPplList;
	}
	public void setMvPplList(List<MvPplVO> mvPplList) {
		this.mvPplList = mvPplList;
	}
	
	
}