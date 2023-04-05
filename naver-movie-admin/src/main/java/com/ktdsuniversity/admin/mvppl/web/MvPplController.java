package com.ktdsuniversity.admin.mvppl.web;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ktdsuniversity.admin.common.util.DownloadUtil;
import com.ktdsuniversity.admin.mvppl.service.MvPplService;
import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

@Controller
public class MvPplController {

	@Autowired
	private MvPplService mvPplService;
	
	@Value("${upload.profile.path:/naver-movie-admin/files/profiles}")
	private String profilePath;
	
	@GetMapping("/mvppl/list")
	public String viewMvPplListPage(MvPplVO mvPplVO, Model model) {
		List<MvPplVO> mvPplList = mvPplService.readAllMvPplVO(mvPplVO);
		model.addAttribute("mvPplList", mvPplList);
		model.addAttribute("mvPplVO", mvPplVO);
		
		return "mvppl/list";
	}
	
	@GetMapping("/mvppl/prfl/{filename}/") // 마지막에 / 필요 사이에 . 같은게 있으면 안된다.
	public void downloadPrflPctr(
			@PathVariable String filename,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		File imageFile = new File(profilePath, filename);
		if (imageFile.exists() && imageFile.isFile()) {
			
			DownloadUtil dnUtil = new DownloadUtil(response, request, profilePath + "/" + filename);
			dnUtil.download(filename);
		}
		else {
			DownloadUtil dnUtil = new DownloadUtil(response, request, profilePath + "/baseProfile.png");
			dnUtil.download("baseProfile.png");
		}
		
	}
	
	
}
