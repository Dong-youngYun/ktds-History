package com.ktdsuniversity.edu.naver.mv.gnr.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
//처음 만들때 DAO에 있는 내용들을 모두 Service로 복사
public interface GnrService {

	/**
	 * 새로운 장르를 생성한다
	 * @param gnrVO (새로운 장르의 정보)
	 * @return 등록한 결과
	 */
	public boolean createGnr(GnrVO gnrVO);
	
	/**
	 * GNR 테이블에 등록된 모든 정보를 조회한다.
	 * @return GNR 테이블의 모든 정보
	 */
	public List<GnrVO> readAllGnr();
	
	/**
	 * GNR 테이블에 등록된 장르데이터를 변경한다.
	 * @param gnrVO (gnrId: 변경대상id, gnrNm: 장르의 새로운 이름)
	 * @return 변경의 결과
	 */
	public boolean updateGnr(GnrVO gnrVO); 
	
	/**
	 * GNR 테이블에 등록된 장르데이터를 삭제한다.
	 * @param gnrId (삭제대상id)
	 * @return 삭제의 결과
	 */
	public boolean deleteGnr(int gnrId); 
	
}
