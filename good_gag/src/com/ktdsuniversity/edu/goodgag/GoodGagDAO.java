package com.ktdsuniversity.edu.goodgag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktdsuniversity.edu.goodgag.member.dao.MemberDAO;
import com.ktdsuniversity.edu.goodgag.member.dao.MemberDAOImpl;
import com.ktdsuniversity.edu.goodgag.member.vo.MemberVO;

public class GoodGagDAO {

	public static void printAllReplies() {
		// 1. Oracle Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Database 연결
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","BBS","BBS1234");
		
			// 3. Query 작성
		    StringBuffer query = new StringBuffer();
		    query.append(" SELECT REPLY_NO                                                  ");
		    query.append(" 	    , ARTICLE_NO                                                ");
		    query.append(" 	    , EMAIL                                                     ");
		    query.append(" 	    , REPLY                                                     ");
		    query.append(" 	    , TO_CHAR(REGIST_DATE, 'YYYY-MM-DD HH24:MI:SS') REGIST_DATE ");
		    query.append(" 	    , TO_CHAR(MODIFY_DATE, 'YYYY-MM-DD HH24:MI:SS') MODIFY_DATE ");
		    query.append(" 	    , PARENT_REPLY_NO                                           ");
		    query.append("   FROM REPLIES                                                   ");
		    // 4. Query 실행
		    pstmt = conn.prepareStatement(query.toString());
			rs = pstmt.executeQuery();
		    // 5. Query 결과 받아서 출력하기
			while(rs.next()) {
				String replyNo = rs.getString("REPLY_NO");
				String articleNo = rs.getString("ARTICLE_NO");
				String email = rs.getString("EMAIL");
				String reply = rs.getString("REPLY");
				String registDate = rs.getString("REGIST_DATE");
				String modifyDate = rs.getString("MODIFY_DATE");
				String parentReplyNo = rs.getString("PARENT_REPLY_NO");
				
				System.out.println(replyNo + "\t" + articleNo + "\t" + email + "\t" + reply + "\t" + registDate + "\t" + modifyDate + "\t" + parentReplyNo);
			}
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		// 6. DB 연결 해제하기
		finally {
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException sqle) {}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				}
				catch (SQLException sqle) {}
			}
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException sqle) {}
			}
		}
		
		
		
		
		
	}
	
	public static void printAllArticles() {
		// 1. Oracle Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Database 연결
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","BBS","BBS1234");
		
			// 3. Query 작성
		    StringBuffer query = new StringBuffer();
		    query.append(" SELECT ARTICLE_NO                                                ");
		    query.append(" 	    , EMAIL                                                     ");
		    query.append(" 	    , TITLE                                                     ");
		    query.append(" 	    , DESCRIPT                                                  ");
		    query.append(" 	    , TO_CHAR(REGIST_DATE, 'YYYY-MM-DD HH24:MI:SS') REGIST_DATE ");
		    query.append(" 	    , SOURCE                                                    ");
		    query.append(" 	    , NOTI_YN                                                   ");
		    query.append("   FROM ARTICLE                                                   ");
		    // 4. Query 실행
		    pstmt = conn.prepareStatement(query.toString());
			rs = pstmt.executeQuery();
		    // 5. Query 결과 받아서 출력하기
			while(rs.next()) {
				String articleNo = rs.getString("ARTICLE_NO");
				String email = rs.getString("EMAIL");
				String title = rs.getString("TITLE");
				String descript = rs.getString("DESCRIPT");
				String registDate = rs.getString("REGIST_DATE");
				String source = rs.getString("SOURCE");
				String notiYn = rs.getString("NOTI_YN");
				
				System.out.println(articleNo + "\t" + email + "\t" + title + "\t" + descript + "\t" + registDate + "\t" + source + "\t" + notiYn);
			}
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		// 6. DB 연결 해제하기
		finally {
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException sqle) {}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				}
				catch (SQLException sqle) {}
			}
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException sqle) {}
			}
		}
	}
	
	public static void printOneMembers(String pEmail, String pPassword) {
		
		// 1. Oracle Driver Loading
		// oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Exception이라 try catch 작성 필수
		}
		catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Oracle DB에 연결 (DB url로 연결)
		// jdbc:oracle:thin:@localhost:1521:XE
		Connection conn = null; //db연결 객체 Connection
		PreparedStatement pstmt = null; //DB에게 쿼리를 실행요청 하는 객체
		ResultSet rs = null; //쿼리의 실행결과를 받아오는 객체
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE"
												, "BBS" //계정
												, "BBS1234"); //패스워드
			
			// 3. Query 작성
			// 여러 줄의 String을 작성할 때, 사용할 수 있는 객체
			StringBuffer query = new StringBuffer(); // *를 쓰면 쿼리를 못적는다.
			query.append(" SELECT EMAIL ");
			query.append(" 	    , NICKNAME ");
			query.append("      , VERIFIED_YN ");
			query.append("      , PASSWORD ");
			query.append("      , TO_CHAR(JOIN_DATE, 'YYYY-MM-DD HH24:MI:SS') JOIN_DATE "); //날짜함수를 쓰는 경우 .0000이 붙을 수도 있어 TO_CHAR가 필요 
			query.append("   FROM MEMBER ");
			query.append("  WHERE EMAIL = ? "); //EMAIL값을 주지 않고 ?로 ?가 파라미터
			query.append("    AND PASSWORD = ? ");
			
//			query.append("abc");
//			query.append("def");
//			query.toString(); 한칸씩 띄우지 않으면 abcdef로 붙어 나온다
			// 3-1. 쿼리 실행하기
			pstmt = conn.prepareStatement(query.toString());
			// 3-2. 쿼리 파라미터 바인딩하기
			pstmt.setString(1, pEmail); // 처음 나오는 ?에게 바인딩
			pstmt.setString(2, pPassword);
			rs = pstmt.executeQuery();//ResultSet 리턴
			
			// 4. Query 결과 받아오기
			// ResultSet
			// rs.next() ==> Cursor를 한 칸 아래로 내린다. / 처음 만날때 첫번째 데이터에 위치하게 된다.
			while (rs.next()) {
				//rs.get~~~("컬럼명") => Cursor가 가리키는 ROW의 COLUMN 데이터를 받아온다.
				String email = rs.getString("EMAIL");
				String nickName = rs.getString("NICKNAME");
				String verifiedYn = rs.getString("VERIFIED_YN");
				String password = rs.getString("PASSWORD");
				String joinDate = rs.getString("JOIN_DATE");// date식을 안쓰고 String으로 받는다.
				
				System.out.println(email + "\t" + nickName + "\t" + verifiedYn
						+ "\t" + password + "\t" + joinDate);
			}
		}
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		finally {
			// 5. DB 연결 해제 finally DB에러 발생시/ DB 출력이 끝난후
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException sqle) {} //닫다가 에러 낫을때 우리가 할 수 있는게 없다. 그래서 {}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				}
				catch (SQLException sqle) {} 
			}
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException sqle) {} 
			}
//			rs.close(); nullpointerException 가능성 존재 rs에 값을 준적이 없다.
//			pstmt.close();
//			conn.close();
			
		}
		
	}
	
	public static void printAllMembers() {
		
		// 1. Oracle Driver Loading
		// oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Exception이라 try catch 작성 필수
		}
		catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Oracle DB에 연결 (DB url로 연결)
		// jdbc:oracle:thin:@localhost:1521:XE
		Connection conn = null; //db연결 객체 Connection
		PreparedStatement pstmt = null; //DB에게 쿼리를 실행요청 하는 객체
		ResultSet rs = null; //쿼리의 실행결과를 받아오는 객체
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE"
												, "BBS" //계정
												, "BBS1234"); //패스워드
			
			// 3. Query 작성
			// 여러 줄의 String을 작성할 때, 사용할 수 있는 객체
			StringBuffer query = new StringBuffer(); // *를 쓰면 쿼리를 못적는다.
			query.append(" SELECT EMAIL ");
			query.append(" 	    , NICKNAME ");
			query.append("      , VERIFIED_YN ");
			query.append("      , PASSWORD ");
			query.append("      , TO_CHAR(JOIN_DATE, 'YYYY-MM-DD HH24:MI:SS') JOIN_DATE "); //날짜함수를 쓰는 경우 .0000이 붙을 수도 있어 TO_CHAR가 필요 
			query.append("   FROM MEMBER ");
			
//			query.append("abc");
//			query.append("def");
//			query.toString(); 한칸씩 띄우지 않으면 abcdef로 붙어 나온다
			// 3-1. 쿼리 실행하기
			pstmt = conn.prepareStatement(query.toString());
			rs = pstmt.executeQuery();//ResultSet 리턴
			
			// 4. Query 결과 받아오기
			// ResultSet
			// rs.next() ==> Cursor를 한 칸 아래로 내린다. / 처음 만날때 첫번째 데이터에 위치하게 된다.
			while (rs.next()) {
				//rs.get~~~("컬럼명") => Cursor가 가리키는 ROW의 COLUMN 데이터를 받아온다.
				String email = rs.getString("EMAIL");
				String nickName = rs.getString("NICKNAME");
				String verifiedYn = rs.getString("VERIFIED_YN");
				String password = rs.getString("PASSWORD");
				String joinDate = rs.getString("JOIN_DATE");// date식을 안쓰고 String으로 받는다.
				
				System.out.println(email + "\t" + nickName + "\t" + verifiedYn
						+ "\t" + password + "\t" + joinDate);
			}
		}
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		finally {
			// 5. DB 연결 해제 finally DB에러 발생시/ DB 출력이 끝난후
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException sqle) {} //닫다가 에러 낫을때 우리가 할 수 있는게 없다. 그래서 {}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				}
				catch (SQLException sqle) {} 
			}
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException sqle) {} 
			}
//			rs.close(); nullpointerException 가능성 존재 rs에 값을 준적이 없다.
//			pstmt.close();
//			conn.close();
			
		}
		
	}
	
	public static void main(String[] args) {
//		printAllMembers();
//		printAllArticles();
//		printAllReplies();
//		printOneMembers("b@gmail.com", "SADRSERWR"); 
//		printOneMembers("c@gmail.com", "111"); //EMAIL과 PASSWORD에서 맞는 것만 가져온다.
		
		MemberDAO memberDAO = new MemberDAOImpl();
		List<MemberVO> allMemberList = memberDAO.getAllMembers();
		MemberVO member = memberDAO.getOneMember("b@gmail.com", "SADRSERWR");
		
		for (MemberVO eachMember: allMemberList) {
			System.out.println(eachMember.getEmail());
			System.out.println(eachMember.getNickname());
			System.out.println(eachMember.getVerifiedYn());
			System.out.println(eachMember.getPassword());
			System.out.println(eachMember.getJoinDate());
			System.out.println("==========================");
		}
		
		System.out.println(member.getEmail());
		System.out.println(member.getNickname());
		System.out.println(member.getVerifiedYn());
		System.out.println(member.getPassword());
		System.out.println(member.getJoinDate());
		
	}
	
}
