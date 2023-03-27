package bulletin_board;

import java.util.ArrayList;
import java.util.List;

public class BoardListHandler {

	private List<Board> boardList = new ArrayList<>();
	
	public void create (String title, String writer, int number, int hits) {
		Board brd = new Board();
		brd.setTitle(title);
		brd.setWriter(writer);
		brd.setNumber(number);
		brd.setHits(hits);
		boardList.add(brd);
	}
	
	public void update (int index, String title) {
		Board brd = boardList.get(index);
		brd.setTitle(title);
		
	}
	public void delete(int index) {
		boardList.remove(index);
	}
	
	public void read (int index) {
		Board brd = boardList.get(index);
		System.out.println("제목: " + brd.getTitle());
		System.out.println("작성자: " + brd.getWriter());
		System.out.println("순번: " + brd.getNumber());
		System.out.println("조회수 " + brd.getHits());
	}
	
	public static void main(String[] args) {
		BoardListHandler handler = new BoardListHandler();
		
		handler.create("안녕하세요", "윤동영", 1, 1);
		handler.create("안녕하세", "동영", 2, 1);
		handler.create("안녕하", "윤동", 3, 1);
		handler.create("안녕", "윤영", 4, 1);
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		handler.read(3);
		
		handler.update(2, "안녕하세요");
		handler.read(2);
		
		handler.delete(3);
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		handler.read(3);
	}
}
