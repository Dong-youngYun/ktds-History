package com.ktdsuniversity.admin.gnr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ktdsuniversity.admin.gnr.service.GnrService;
import com.ktdsuniversity.admin.gnr.vo.GnrVO;

@Controller
public class GnrController {

	@Autowired
	private GnrService gnrService;
	
	@GetMapping("/gnr/list") // http://localhost:8080/admin/gnr/list?gnrNm=장르명&pageNo=2&viewCnt=10
	public String viewGnrListPage(Model model, 
			@RequestParam(required = false) String gnrNm,
			@RequestParam(required = false, defaultValue = "1") int pageNo,
			@RequestParam(required = false, defaultValue = "10") int viewCnt) { //requestParm 필수파라미터 required 가 없으면 에러발생)
		List<GnrVO> gnrList = gnrService.readAllGnrVO(gnrNm);
		model.addAttribute("gnrList", gnrList);
		return "gnr/list";
	}
}
