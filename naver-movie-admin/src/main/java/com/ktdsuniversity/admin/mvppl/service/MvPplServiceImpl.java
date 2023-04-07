package com.ktdsuniversity.admin.mvppl.service;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ktdsuniversity.admin.common.api.exceptions.ApiException;
import com.ktdsuniversity.admin.mvppl.dao.MvPplDAO;
import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

@Service
public class MvPplServiceImpl implements MvPplService {
	
	private static final Logger logger = LoggerFactory.getLogger(MvPplServiceImpl.class);
	
	@Value("${upload.profile.path:/naver-movie-admin/files/profiles}")
	private String profilePath;

	@Autowired
	private MvPplDAO mvPplDAO;
	
	@Override
	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO) {
		
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
	public List<MvPplVO> readAllMvPplVONopagination(String nm) {
		return mvPplDAO.readAllMvPplVONopagination(nm);
	}

	@Override
	public boolean createOneMvPpl(MvPplVO mvPplVO, MultipartFile uploadFile) {
		
		if (uploadFile != null && !uploadFile.isEmpty()) {
			
			File dir = new File(profilePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			
			String uuidFileName = UUID.randomUUID().toString();
			File profileFile = new File(dir, uuidFileName);
			try {
				uploadFile.transferTo(profileFile);
			} catch (IllegalStateException | IOException e) {
				logger.error(e.getMessage(), e);
			}
			mvPplVO.setPrflPctr(uuidFileName);
		}
		
		return mvPplDAO.createOneMvPpl(mvPplVO) > 0;
	}

	@Override
	public boolean updateOneMvPplByMvPplId(MvPplVO mvPplVO, MultipartFile uploadFile) {
		
		if (uploadFile != null && !uploadFile.isEmpty()) {
			
			File dir = new File(profilePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			
			String uuidFileName = UUID.randomUUID().toString();
			File profileFile = new File(dir, uuidFileName);
			try {
				uploadFile.transferTo(profileFile);
			} catch (IllegalStateException | IOException e) {
				logger.error(e.getMessage(), e);
			}
			mvPplVO.setPrflPctr(uuidFileName);
		}
		
		boolean isModify = false;
		MvPplVO originalMvPplData = mvPplDAO.readOneMvPplVOByMvPplId(mvPplVO.getMvPplId()); // 비교를 위해 원본 조회
		
		MvPplVO updateMvPplVO = new MvPplVO(); //mvPplVO로 하면 모든 정보를 다 받아와서 바뀐 정보만 가져오기 위해 새로 생성해 하나씩 가져온다.
		updateMvPplVO.setMdfyr(mvPplVO.getMdfyr());
		updateMvPplVO.setMvPplId(mvPplVO.getMvPplId());
		updateMvPplVO.setRlNm(mvPplVO.getRlNm()); //nullable
		
		if ( (mvPplVO.getPrflPctr() == null || mvPplVO.getPrflPctr().length() == 0)
				&& mvPplVO.getIsDeletePctr().equals("N")) {
			updateMvPplVO.setPrflPctr(originalMvPplData.getPrflPctr());
		}
		else {
			isModify = true;
			updateMvPplVO.setPrflPctr(mvPplVO.getPrflPctr());
		}
		
		if (!originalMvPplData.getNm().equals(mvPplVO.getNm())) {
			isModify = true;
			updateMvPplVO.setNm(mvPplVO.getNm());
		}
		
		String rlNm = originalMvPplData.getRlNm();
		
		if (rlNm == null) {
			rlNm = "";
		}
		
		if (!rlNm.equals(mvPplVO.getRlNm())) { // 바뀐지 안바뀐지만 알려준다
			isModify = true;
		}
		
		String requestUseYn = mvPplVO.getUseYn() == null || mvPplVO.getUseYn().length() == 0
												? "N" : mvPplVO.getUseYn();
		if (!originalMvPplData.getUseYn().equals(requestUseYn)) {
			isModify = true;
			updateMvPplVO.setUseYn(mvPplVO.getUseYn());
		}
		
		if (isModify) {
			return mvPplDAO.updateOneMvPplByMvPplId(updateMvPplVO) > 0;
		}
		else {
			throw new ApiException("400", "변경된 정보가 없습니다.");
		}
		
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
