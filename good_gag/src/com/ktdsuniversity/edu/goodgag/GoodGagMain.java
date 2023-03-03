package com.ktdsuniversity.edu.goodgag;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.article.service.ArticleService;
import com.ktdsuniversity.edu.goodgag.article.service.ArticleServiceImpl;
import com.ktdsuniversity.edu.goodgag.article.vo.ArticleVO;
import com.ktdsuniversity.edu.goodgag.member.dao.MemberDAO;
import com.ktdsuniversity.edu.goodgag.member.dao.MemberDAOImpl;
import com.ktdsuniversity.edu.goodgag.member.vo.MemberVO;
import com.ktdsuniversity.edu.goodgag.reply.service.ReplyService;
import com.ktdsuniversity.edu.goodgag.reply.service.ReplyServiceImpl;
import com.ktdsuniversity.edu.goodgag.reply.vo.ReplyVO;

public class GoodGagMain {
	
	public static void main(String[] args) {
		//회원가입
		MemberDAO memberDAO = new MemberDAOImpl();
		MemberVO memberVO = new MemberVO();
		memberVO.setEmail("mcjang1116@gmail.com");
		memberVO.setNickname("장민창");
		memberVO.setPassword("1234");
//		memberDAO.createMember(memberVO);
		
		//게시글작성
//		ArticleDAO articleDAO = new ArticleDAOImpl();
		ArticleService articleService = new ArticleServiceImpl();
		ArticleVO articleVO = new ArticleVO();
		articleVO.setEmail(memberVO.getEmail()); //직접 쓰지 말고 데이터를 가져와
		articleVO.setTitle("ㅁㄴㅇㄹ");
		articleVO.setDescript("ㅁㄴㅇㄹㄴ");
		articleVO.setSource("ㅁㄴㅇㄹ");
		articleVO.setNotiYn("N");
		boolean isSuccess = articleService.createArticle(articleVO);
		System.out.println(isSuccess);
		System.out.println(articleVO.getArticleNo());
//		articleDAO.createArticle(articleVO);
		
		//게시글 목록 조회(댓글 개수 포함)
		List<ArticleVO> articleList = articleService.getAllArticles();
		for (ArticleVO eachArticle : articleList) {
			System.out.println("======================");
			System.out.println(eachArticle.getTitle());
			System.out.println(eachArticle.getArticleNo());
			System.out.println(eachArticle.getMemberVO().getNickname());
			System.out.println(eachArticle.getReplyList().size());
		}
		//게시글 상세 조회(댓글 포함)
		
		//게시글 수정
		
		//댓글 작성
		ReplyService replyService = new ReplyServiceImpl();
		ReplyVO replyVO = new ReplyVO();
		replyVO.setArticleNo(articleVO.getArticleNo());
		replyVO.setEmail(memberVO.getEmail());
		replyVO.setReply("sdf");
		replyVO.setParentReplyNo("RP-20230302-00001");
		boolean Success = replyService.createReply(replyVO);
		System.out.println(Success);
		System.out.println(replyVO.getReplyNo());
		//댓글 수정
		
		//`게시글 삭제
		
		//댓글 삭제
		
		//`게시글 좋아요
		
		//`게시글 싫어요
		
		//게시글 신고
		
		//댓글 좋아요
		
		//댓글 싫어요
	}

}
