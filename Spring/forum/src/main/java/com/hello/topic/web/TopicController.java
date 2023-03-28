package com.hello.topic.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.hello.common.handler.DownloadUtil;
import com.hello.member.vo.MemberVO;
import com.hello.topic.service.TopicService;
import com.hello.topic.vo.TopicVO;

@Controller
public class TopicController {
	
	private static final Logger logger = LoggerFactory.getLogger(TopicController.class);
	
	@Autowired
	private TopicService topicService;
	
	
	@Value("${upload.path}") //설정정보를 읽어오는 경우
	private String uploadPath;
	
	@GetMapping("/topics")
	public String viewTopicListPage(Model model) {
		List<TopicVO> topicList = topicService.readAllTopics();
		model.addAttribute("topicList",topicList);
		return "topic/list";
	}
	
	@GetMapping("/topic/{topicId}")
	public String viewTopicDetailPage(@PathVariable int topicId, Model model) { //파라미터 순서는 의미가 없다 Spring이 알아서 넣어준다.
		//System.out.println("URL 변수 topicId의 값: " + topicId);
		logger.info("URL 변수 topicId의 값: {}", topicId );
		
		TopicVO topic = topicService.readOneTopicByTopicId(topicId);
		model.addAttribute("topic", topic);
		
		return "topic/detail";
	}
	
	@GetMapping("/topic/write")
	public String viewTopicWritePage() {
		return "topic/write";
	}
	
	@PostMapping("/topic/write") //PostMapping DB에 반영 // 컬렉션으로 받는다.
	public String doTopicWrite(TopicVO topicVO,
							   List<MultipartFile> uploadFile,
							   @SessionAttribute("__USER_SESSION_DATA__") MemberVO memberVO) {
		//TopicVO에 MultipartFile을 넣을 수도 있지만 DB로 정보를 보내서 메모리 차지하게 된다. 그냥 파라미터로 MultipartFile을 작성해서 처리
		//write.jsp의 action을 따라와서 post타입의 메소드를 찾아서 작성한 것이다.
	
		topicVO.setEmail(memberVO.getEmail());
		
		boolean createResult = topicService.createNewTopic(topicVO, uploadFile);
		
		//uploadHandler.upload(uploadFile, topicVO.getId()); //호출 이후부터 알수 있어서 아래로 이동
		
		if (!createResult) {
			return "topic/write";
		}
		
		return "redirect:/topic/" + topicVO.getId(); //redirect-단순히 페이지를 옮겨라가 아니라 브라우저에게 직접 요청 /30같은 그냥 숫자라 생각하면 된다.
	}
	
	@GetMapping("/topic/delete/{topicId}")
	public String doTopicDelete(@PathVariable int topicId) {
		boolean deleteResult = topicService.deleteOneTopic(topicId);
		if (deleteResult) {
			return "redirect:/topics";
		}
		else {
			return "redirect:/topic/" + topicId;
		}
	}
	@GetMapping("/topic/update/{topicId}")
	public String viewTopicUpdatePage(@PathVariable int topicId, Model model) {
		TopicVO topic = topicService.readOneTopicByTopicId(topicId);
		model.addAttribute("topic",topic); // 원글을 보여주기위해 모델을 사용
		return "topic/update";
	}
	
	@PostMapping("/topic/update/{topicId}")
	public String doTopicUpdate(@PathVariable int topicId, 
								TopicVO topicVO,
								@SessionAttribute("__USER_SESSION_DATA__") MemberVO memberVO) { //다른 컨트롤러에서 Session 받아오기
		memberVO.setEmail(memberVO.getEmail());
		topicVO.setId(topicId); //update.jsp에는 id에 대한 정보가 없어서 PostMapping의 url에서 넘어온 id정보를 TopicVO에 넣어준다.
		boolean updateResult = topicService.updateOneTopic(topicVO);
		
		if (updateResult) {
			return "redirect:/topic/" + topicId;
		}
		else {
			return "redirect:/topics";
		}
	}
	
	@GetMapping("/topic/download/{topicId}")
	public void downloadFile(@PathVariable int topicId
					, HttpServletRequest request
					, HttpServletResponse response) {
		
		TopicVO topic = topicService.readOneTopicByTopicId(topicId);
		
		new DownloadUtil(response, request, this.uploadPath + "/" + topic.getFileName()).download(topic.getOriginFileName());
	}
	
}
