package com.ktdsuniversity.edu.naver.mv.gnr.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;

/**
 * GNR 테이블과 연동하기 위한 DAO
 * @author User
 *
 */
public interface GnrDAO {
	
	/**
	 * 새로운 장르를 생성한다
	 * @param gnrVO (새로운 장르의 정보)
	 * @return 새로 등록된 정보의 수
	 */
	public int createGnr(GnrVO gnrVO);
	
	/**
	 * GNR 테이블에 등록된 모든 정보를 조회한다.
	 * @return GNR 테이블의 모든 정보
	 */
	public List<GnrVO> readAllGnr(); //장르의 목록을 전달하기때문에 List사용 (모든장르를 가져오는 것이라 파라미터가 없다)
	
	/**
	 * GNR 테이블에 등록된 장르데이터를 변경한다.
	 * @param gnrVO (gnrId: 변경대상id, gnrNm: 장르의 새로운 이름)
	 * @return 변경된 장르의 수
	 */
	public int updateGnr(GnrVO gnrVO); //어떤 값으로 바꿀지 알려주기 위해 GnrVO를 파라미터로 지정 (VO에서 바꾸고 싶은 gnrId 와 gnrNm을 변경)
	
	/**
	 * GNR 테이블에 등록된 장르데이터를 삭제한다.
	 * @param gnrId (삭제대상id)
	 * @return 삭제된 장르의 수
	 */
	public int deleteGnr(int gnrId); //pk의 datetype이 숫자라서 int / 이름은 그대로 사용
}
