package com.ktdsuniversity.admin.gnr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.admin.common.api.exceptions.ApiArgsException;
import com.ktdsuniversity.admin.common.api.exceptions.ApiException;
import com.ktdsuniversity.admin.common.api.vo.ApiResponseVO;
import com.ktdsuniversity.admin.gnr.dao.GnrDAO;
import com.ktdsuniversity.admin.gnr.vo.GnrVO;

@Service
public class GnrServiceImpl implements GnrService {

	@Autowired
	private GnrDAO gnrDAO;
	
	@Override
	public List<GnrVO> readAllGnrVO(GnrVO gnrVO) {
		return gnrDAO.readAllGnrVO(gnrVO);
	}

	@Override
	public boolean createOneGnr(GnrVO gnrVO) {
		
		return gnrDAO.createOneGnr(gnrVO) > 0;
	}

	@Override
	public boolean updateOneGnr(GnrVO gnrVO) {
		if (gnrVO.getGnrNm() == null || gnrVO.getGnrNm().trim().length() == 0) {
			throw new ApiArgsException("404", "장르명은 필수값입니다.");
		}
		
		return gnrDAO.updateOneGnr(gnrVO) > 0;
	}

	@Override
	public boolean deleteOneGnr(int gnrId) {
		return gnrDAO.deleteOneGnr(gnrId) > 0;
	}

	@Override
	public boolean deleteGnrBySelectedGnrId(List<Integer> gnrId) {
		
		int delCount = gnrDAO.deleteGnrBySelectedGnrId(gnrId);
		boolean isSuccess = delCount == gnrId.size();
		
		if (!isSuccess) {
			throw new ApiException("500", "삭제에 실패했습니다. 요청건수:("+gnrId.size() +"건), 삭제건수:("+delCount+"건)");
		}
		
		return isSuccess; 
	}

}
