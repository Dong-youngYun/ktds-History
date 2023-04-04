package com.ktdsuniversity.admin.mvppl.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.admin.common.api.exceptions.ApiException;
import com.ktdsuniversity.admin.mvppl.dao.MvPplDAO;
import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

@Service
public class MvPplServiceImpl implements MvPplService {

	@Autowired
	private MvPplDAO mvPplDAO;
	
	@Override
	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO) {
		
		// TODO
		// Calender -> 같은 코드 반복사용이 많아서 Util로 빼서 작성
		// startDt가 비어있을 경우, 현재일의 한달전 날짜를 가져와서 세팅한다.
		if (mvPplVO.getStartDt() == null || mvPplVO.getStartDt().length() == 0) {
			Calendar cal = Calendar.getInstance(); // 현재날짜 가져오기
			cal.add(Calendar.MONTH, -1); // 한 달 전
			// 연도
			int year = cal.get(Calendar.YEAR);
			// 월
			int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11 -> 1 ~ 12
			// 일
			int day = cal.get(Calendar.DAY_OF_MONTH);
			
			// 2023-04-04 -> 2023-4-4
			// 4 -> 04, 10 -> 10
			String strMonth = month < 10 ? "0" + month : month + ""; // 아니라면 문자열로 바꿔라
			String strDay = day < 10 ? "0" + day : day + "";
			
			String startDt = year + "-" + strMonth + "-" + strDay;
			mvPplVO.setStartDt(startDt);
		}
		
		// endDt가 비어있을 경우, 현재일을 가져와서 세팅한다.
		if (mvPplVO.getEndDt() == null || mvPplVO.getEndDt().length() == 0) {
			Calendar cal = Calendar.getInstance(); // 현재날짜 가져오기
			// 연도
			int year = cal.get(Calendar.YEAR);
			// 월
			int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11 -> 1 ~ 12
			// 일
			int day = cal.get(Calendar.DAY_OF_MONTH);
			
			// 2023-04-04 -> 2023-4-4
			// 4 -> 04, 10 -> 10
			String strMonth = month < 10 ? "0" + month : month + ""; // 아니라면 문자열로 바꿔라
			String strDay = day < 10 ? "0" + day : day + "";
			
			String endDt = year + "-" + strMonth + "-" + strDay;
			mvPplVO.setEndDt(endDt);
		}
		// Jodatime JVM 메모리 소모가 심하다.
		
		return mvPplDAO.readAllMvPplVO(mvPplVO);
	}

	@Override
	public boolean createOneMvPpl(MvPplVO mvPplVO) {
		return mvPplDAO.createOneMvPpl(mvPplVO) > 0;
	}

	@Override
	public boolean updateOneMvPplByMvPplId(MvPplVO mvPplVO) {
		return mvPplDAO.updateOneMvPplByMvPplId(mvPplVO) > 0;
	}

	@Override
	public boolean deleteOneMvPplByMvPplId(String mvPplId) {
		return mvPplDAO.deleteOneMvPplByMvPplId(mvPplId) > 0;
	}

	@Override
	public boolean deleteMvPplBySelectedMvPplId(List<String> mvPplIdList) {
		
		int deleteCount = mvPplDAO.deleteMvPplBySelectedMvPplId(mvPplIdList);
		boolean isSuccess = deleteCount == mvPplIdList.size();
		if (isSuccess) {
			throw new ApiException("500", "삭제에 실패했습니다. 요청건수:(" +
							mvPplIdList.size()+"건), 삭제건수("+deleteCount+"건)");
		}
		
		return isSuccess;
	}

}
