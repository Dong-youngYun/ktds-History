package com.ktdsuniversity.edu.goodgag.reply.dao;

import com.ktdsuniversity.edu.goodgag.reply.vo.ReplyVO;
import com.ktdsuniversity.edu.goodgag.utils.db.AbstractDaoPoolSupport;

public class ReplyDAOImpl extends AbstractDaoPoolSupport<ReplyVO> implements ReplyDAO {

	@Override
	public String createNewReplyNo() {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT 'RP-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-'  || LPAD(SEQ_REPLIES_PK.NEXTVAL, 5, '0') NEW_SEQ ");
		query.append("   FROM DUAL ");
		
		return selectOneString(query.toString(), null, (rs) -> {
			return rs.getString("NEW_SEQ");
		});
	}

	@Override
	public int createReply(ReplyVO replyVO) {
		StringBuffer query = new StringBuffer();                                
		query.append(" INSERT INTO REPLIES                                      ");
		query.append("  (REPLY_NO                                               ");
		query.append(" , ARTICLE_NO                                             ");
		query.append(" , EMAIL                                                  ");
		query.append(" , REPLY                                                  ");
		query.append(" , REGIST_DATE                                            ");
		query.append(" , MODIFY_DATE                                            ");
		query.append(" , PARENT_REPLY_NO)                                       ");
		query.append(" VALUES                                                   ");
		query.append("  (? /*REPLY_NO*/  ");
		query.append(" , ? /*ARTICLE_NO*/");
		query.append(" , ? /*EMAIL*/                          ");
		query.append(" , ? /*REPLY*/                              ");
		query.append(" , SYSDATE /*REGIST_DATE*/                                   ");
		query.append(" , SYSDATE /*MODIFY_DATE*/                                   ");
		query.append(" , ? /*PARENT_REPLY_NO*/)                                 ");
		
		return insert(query.toString(), (rp) -> {
			rp.setString(1, replyVO.getReplyNo());
			rp.setString(2, replyVO.getArticleNo());
			rp.setString(3, replyVO.getEmail());
			rp.setString(4, replyVO.getReply());
			rp.setString(5, replyVO.getParentReplyNo());
		});
	}

}
