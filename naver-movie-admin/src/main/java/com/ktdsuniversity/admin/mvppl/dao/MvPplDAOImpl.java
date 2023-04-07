package com.ktdsuniversity.admin.mvppl.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

@Repository
public class MvPplDAOImpl extends SqlSessionDaoSupport implements MvPplDAO {

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public MvPplVO readOneMvPplVOByMvPplId(String mvPplId) {
		return getSqlSession().selectOne("MvPpl.readOneMvPplVOByMvPplId", mvPplId);
	}
	
	@Override
	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO) {
		return getSqlSession().selectList("MvPpl.readAllMvPplVO", mvPplVO);
	}
	
	@Override
	public List<MvPplVO> readAllMvPplVONopagination(String nm) {
		return getSqlSession().selectList("MvPpl.readAllMvPplVONopagination", nm);
	}

	@Override
	public int createOneMvPpl(MvPplVO mvPplVO) {
		return getSqlSession().insert("MvPpl.createOneMvPpl", mvPplVO);
	}

	@Override
	public int updateOneMvPplByMvPplId(MvPplVO mvPplVO) {
		return getSqlSession().update("MvPpl.updateOneMvPplByMvPplId", mvPplVO);
	}

	@Override
	public int deleteOneMvPplByMvPplId(String mvPplId) {
		return getSqlSession().update("MvPpl.deleteOneMvPplByMvPplId", mvPplId);
	}

	@Override
	public int deleteMvPplBySelectedMvPplId(List<String> mvPplIdList) {
		return getSqlSession().update("MvPpl.deleteMvPplBySelectedMvPplId", mvPplIdList);
	}

	

}
