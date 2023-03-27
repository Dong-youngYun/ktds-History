package com.ktdsuniversity.edu.naver.mv.cmpn.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;

/**
 * Cmpn테이블과 연동하기 위한 DAO
 * @author User
 *
 */
public interface CmpnDAO {
	
	public String createNewCmpnId();

	/**
	 * 새로운 회사를 생성한다
	 * @param cmpnVO (새로운 회사의 정보)
	 * @return 새로 등록된 정보의 수
	 */
	public int createCmpn(CmpnVO cmpnVO);
	
	/**
	 * Cmpn 테이블에 등록된 모든 정보를 조회한다.
	 * @return Cmpn 테이블의 모든 정보
	 */
	public List<CmpnVO> readAllCmpn();
	
	/**
	 * Cmpn 테이블에 등록된 회사데이터를 변경한다.
	 * @param cmpnVO
	 * @return 변경된 회사의 수
	 */
	public int updateCmpn(CmpnVO cmpnVO);
	
	/**
	 * Cmpn 테이블에 등록된 회사데이터를 삭제한다.
	 * @param cmpnId (삭제대상id)
	 * @return 삭제된 회사의 수
	 */
	public int deleteCmpn(String cmpnId);
	
}
