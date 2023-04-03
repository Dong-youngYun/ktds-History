package com.ktdsuniversity.admin.common.vo;

public abstract class AbstractVO {

	private int pageNo;
	private int viewCnt;
	private int totalCount;
	private int lastPage;
	private int lastGroup;
	private int rnum;

	protected AbstractVO() { // 상속받은 곳에서만 사용할 수 있도록 protected로 작성 / 추상클래스를 인스턴스로 쓸수 없도록
		this.pageNo = 0;
		this.viewCnt = 10; //생성자를 이용해 기본값을 넣어줘서 데이터가 없을때 확인할수 있게 만든다. 
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getLastGroup() {
		return lastGroup;
	}

	public void setLastGroup(int lastGroup) {
		this.lastGroup = lastGroup;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	
	
	
	
}
