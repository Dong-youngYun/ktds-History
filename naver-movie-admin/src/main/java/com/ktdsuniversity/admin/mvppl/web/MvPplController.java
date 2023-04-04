package com.ktdsuniversity.admin.mvppl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ktdsuniversity.admin.mvppl.service.MvPplService;
import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

@Controller
public class MvPplController {

	@Autowired
	private MvPplService mvPplService;
	
	@GetMapping("/mvppl/list")
	public String viewMvPplListPage(MvPplVO mvPplVO, Model model) {
		List<MvPplVO> mvPplList = mvPplService.readAllMvPplVO(mvPplVO);
		model.addAttribute("mvPplList", mvPplList);
		model.addAttribute("mvPplVO", mvPplVO);
		
		return "mvppl/list";
	}
}
