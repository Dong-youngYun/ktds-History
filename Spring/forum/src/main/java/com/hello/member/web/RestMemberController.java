package com.hello.member.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.common.exceptions.AjaxResponseException;
import com.hello.common.util.StringUtil;
import com.hello.member.service.MemberService;
import com.hello.member.vo.MemberVO;

@Controller
public class RestMemberController {

	private static final Logger logger = LoggerFactory.getLogger(RestMemberController.class);

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/api/member/check/{email}/")
	@ResponseBody
	public Map<String, Object> doCheckDuplicatedEmail(@PathVariable String email) {
		int emailCount = memberService.readCountMemberByEmail(email);
		Map<String, Object> result = new HashMap<>();
		result.put("email_count", emailCount);
		return result;
	}
	
	@PostMapping("/api/member/login")
	@ResponseBody //응답을 JSON형태로 전송한다.
	public Map<String, Object> doLogin(MemberVO memberVO, HttpSession session) {

		if (memberVO.getEmail() == null || memberVO.getEmail().length() == 0) {
			throw new AjaxResponseException("email은 필수값입니다.");
		}
		if (memberVO.getPassword() == null || memberVO.getPassword().length() == 0) {
			throw new AjaxResponseException("password는 필수값입니다.");
		}
		// 로그인 처리
		// 회원 데이터 조회
		MemberVO memberData = memberService.readOneMemberByEmailAndPassword(memberVO);

		// 회원 데이터가 있는지 확인
		if (memberData != null) {
			// 로그인 성공!
			// 세션에 데이터 저장
			session.setAttribute("__USER_SESSION_DATA__", memberData);
			
			Map<String, Object> result = new HashMap<>();
			result.put("loginResult", true);
			return result;
			
		} else {
			// 로그인 실패!
			Map<String, Object> result = new HashMap<>();
			result.put("loginResult", false);
			result.put("errorCode", "NOT_FOUND_USER");
			return result;
		}
	}

	// 파라미터를 받아오는 방법3
	@PostMapping("/api/member/regist")
	@ResponseBody
	public Map<String, Object> doMemberRegist(MemberVO memberVO) {

		String email = memberVO.getEmail();
		String name = memberVO.getName();
		String password = memberVO.getPassword();
		String passwordConfirm = memberVO.getPasswordConfirm();

		if (StringUtil.isEmpty(email)) {
			throw new AjaxResponseException("email은 필수 값입니다.");
		}
		if (StringUtil.isEmpty(name)) {
			throw new AjaxResponseException("name은 필수 값입니다.");
		}
		if (StringUtil.isEmpty(password)) {
			throw new AjaxResponseException("password은 필수 값입니다.");
		}
		if (StringUtil.isEmpty(passwordConfirm)) {
			throw new AjaxResponseException("passwordConfirm은 필수 값입니다.");
		}
		if (StringUtil.isExceedLength(email, 100)) {
			throw new AjaxResponseException("email은 100글자까지 작성할 수 있습니다.");
		}
		if (StringUtil.isExceedLength(name, 10)) {
			throw new AjaxResponseException("name은 10글자까지 작성할 수 있습니다.");
		}
		if (StringUtil.isExceedLength(password, 10)) {
			throw new AjaxResponseException("password은 10글자까지 작성할 수 있습니다.");
		}
		if (StringUtil.isExceedLength(passwordConfirm, 10)) {
			throw new AjaxResponseException("passwordConfirm은 10글자까지 작성할 수 있습니다.");
		}
		if (!StringUtil.isMatchTo(password, passwordConfirm)) {
			throw new AjaxResponseException("password가 일치하지 않습니다.");
		}

		boolean isSuccess = memberService.createNewMember(memberVO);
		// System.out.println("회원등록성공여부:" + isSuccess);
		logger.debug("회원등록 성공여부: {} ", isSuccess);

		Map<String,Object> registResult = new HashMap<>();
		registResult.put("registResult", isSuccess);
		return registResult;
	}
}
