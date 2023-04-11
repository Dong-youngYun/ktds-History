package com.ktdsuniversity.admin.mv.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.admin.mv.vo.MvVO;

@Repository
public class MvDAOImpl extends SqlSessionDaoSupport implements MvDAO {

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int createNewMv(MvVO mvVO) {
		return getSqlSession().insert("Mv.createNewMv", mvVO);
	}

	@Override
	public int updateONeMv(MvVO mvVO) {
		return getSqlSession().update("Mv.updateONeMv", mvVO);
	}

	@Override
	public int deleteOneMvByMvId(String mvId) {
		return getSqlSession().update("Mv.deleteOneMvByMvId", mvId);
	}

	@Override
	public int deleteMvByMvIdList(List<String> mvIdList) {
		return getSqlSession().update("Mv.deleteMvByMvIdList", mvIdList);
	}

	@Override
	public MvVO readOneMvByMvId(String mvId) { //selectOne의 결과가 1건이 초과 되면 에러가 발생한다.
		return getSqlSession().selectOne("Mv.readOneMvByMvId", mvId);
	}

	@Override
	public List<MvVO> readAllMv(MvVO mvVO) { // 몇건이 나오던 상관이 없다. 검색조건이 mvVO
		return getSqlSession().selectList("Mv.readAllMv", mvVO);
	}
	
}
