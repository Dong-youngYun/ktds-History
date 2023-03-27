package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
	/**
	 * 게시글 목록
	 */
	private List<BoardVO> boardList = new ArrayList<>();

	/**
	 * 게시글 등록 
	 * 순번은 boardList 의 size로 생성을 하고 
	 * 조회수는 0으로 초기화 한다.
	 * @param subject 제목
	 * @param writer  작성자
	 */
	public void create(String subject, String writer) {
		BoardVO boardVO = new BoardVO();
		boardVO.setNumber(boardList.size());
		boardVO.setSubject(subject);
		boardVO.setWriter(writer);
		boardVO.setReadCount(0);
		boardList.add(boardVO);
	}

	/**
	 * 게시글 수정
	 * 제목만 수정할 수 있다.
	 * @param index 게시글의 인덱스
	 * @param subject 제목
	 */
	public void update(int index, String subject) {
		BoardVO boardVO = boardList.get(index);
		boardVO.setSubject(subject);
	}

	/**
	 * 게시글 삭제 한 건의 게시글만 삭제할 수 있다.
	 * @param index 삭제하려는 게시글의 인덱스
	 */

	public void delete(int index) {
		boardList.remove(index);
	}

	/**
	 * 게시글 조회
	 * @param index 조회하려는 게시글의 인덱스
	 */
	public void read(int index) {
		
		if (boardList.size() <= index) {
			System.out.println(index + "번 게시글은 존재하지 않습니다.");
			return; //메소드를 종료하라는 메소드
		}
		
		BoardVO boardVO = boardList.get(index);
		int readCount = boardVO.getReadCount();
		readCount +=1;
		//readCount++; 표현이 모호해진다.
		boardVO.setReadCount(readCount);
		
		System.out.println("순번: " + boardVO.getNumber());
		System.out.println("제목: " + boardVO.getSubject());
		System.out.println("작성자: " + boardVO.getWriter());
		System.out.println("조회수: " + boardVO.getReadCount());
	}
	
	public void readAll() {
		for(int i = 0; i < boardList.size(); i+=1)
			read(i);
//		BoardVO boardVO = boardList.get(i);
//		System.out.println("순번: " + boardVO.getNumber());
//		System.out.println("제목: " + boardVO.getSubject());
//		System.out.println("작성자: " + boardVO.getWriter());
//		System.out.println("조회수: " + boardVO.getReadCount());
		
	}
	
	public void readAllWithoutIndex() {
		for(BoardVO boardVO: boardList) {
			System.out.println("순번: " + boardVO.getNumber());
			System.out.println("제목: " + boardVO.getSubject());
			System.out.println("작성자: " +boardVO.getWriter());
			System.out.println("조회수: " +boardVO.getReadCount());
		}
		
	}

	public static void main(String[] args) {
		BoardService boardService = new BoardService();
		
		//Crtl + Shift + O
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			
			int menu = scan.nextInt();
			scan.nextLine();
			//버그라서 엔터 날림
			if (menu ==1) {
				//등록
				System.out.println("제목을 입력하세요.");
				String subject = scan.nextLine();
				
				System.out.println("작성자를 입력하세요");
				String writer = scan.nextLine();
				
				boardService.create(subject, writer);
				System.out.println("게시글이 등록됐습니다.");
			}
			else if (menu ==2) {
				//수정
			}
			else if (menu ==3) {
				//삭제
			}
			else if (menu ==4) {
				//조회
				boardService.readAll();
				System.out.println("모든 게시글을 조회했습니다.");
			}
			else {
				//종료
				System.out.println("종료합니다.");
				break;
			}
		}
//		boardService.create("첫 번째 게시글", "장민창");
//		boardService.create("두 번째 게시글", "장민창");
//		boardService.create("세 번째 게시글", "장민창");
//		boardService.create("네 번째 게시글", "장민창");
//		boardService.create("다섯 번째 게시글", "장민창");
//		boardService.create("여섯 번째 게시글", "장민창");
//		
//		boardService.read(0);
//		boardService.read(1);
//		boardService.read(2);
//		boardService.read(3);
//		boardService.read(4);
//		boardService.read(5);
//		
//		boardService.update(1, "수정한 게시글 원래는 두번째 게시글");
//		boardService.read(1);
//		
//		boardService.delete(5);
//		
//		boardService.read(1);
//		boardService.read(2);
//		boardService.read(3);
//		boardService.read(4);
//		boardService.read(5);
	}

}
