package com.hello.reply.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.hello.member.vo.MemberVO;
import com.hello.reply.service.ReplyService;
import com.hello.reply.vo.ReplyVO;

@Controller
public class ReplyController {
	
	@Autowired
	private ReplyService replyService; //Impl같은 클래스가 들어오면 Spring의 장점인 유연성 확장성을 사용할 수 없다.
	
	@PostMapping("/topic/reply/create")
	public String doCreateReply(ReplyVO replyVO,
								@SessionAttribute("__USER_SESSION_DATA__") MemberVO memberVO) {
		replyVO.setEmail(memberVO.getEmail());
		
		boolean createResult = replyService.createNewReply(replyVO);
		if (createResult) {
			return "redirect:/topic/" + replyVO.getTopicId();
		}
		return "redirect:/topic/" +replyVO.getTopicId() + "?errorCode=createFail";
	}
	
	@PostMapping("/topic/reply/update/{replyId}") //{replyId} PathVariable
	public String doUpdateReply(@PathVariable int replyId, ReplyVO replyVO) {
		replyVO.setReplyId(replyId);
		boolean updateResult = replyService.updateOneReply(replyVO);
		if (updateResult) {
			return "redirect:/topic/" +replyVO.getTopicId();
		}
		return "redirect:/topic/" +replyVO.getTopicId() + "?errorCode=updateFail";
	}
	
	@GetMapping("/topic/reply/delete/{topicId}/{replyId}") //form 전송을 할 필요가 없어서 Get/ 링크걸어서 삭제할거다.
	public String doDeleteReply(@PathVariable int topicId, @PathVariable int replyId) {
		boolean deleteResult = replyService.deleteOneReplyByReplyId(replyId);
		if (deleteResult) {
			return "redirect:/topic/" + topicId;
		}
		return "redirect:/topic/" + topicId + "?errorCode=deleteFail";
	}
	
	
}
