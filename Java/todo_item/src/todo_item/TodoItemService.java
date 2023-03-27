package todo_item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoItemService {

	private List<TodoItemVO> todoItemList;
	
	public TodoItemService() {
		todoItemList = new ArrayList<>();
	}
	
	public void create(String name) {
		todoItemList.add(new TodoItemVO(name));
	}
	
	public void update(int index, boolean check) {
		todoItemList.get(index).setCheck(check);
		//get(index)는 리스트 안에 존재해서 그냥 가져오면 된다.
		//sysout 자체는 void 쪽이든 main 쪽이든 상관x
	}
	
	public void delete(int index) {
		if(todoItemList.size() <= index) {
			System.out.println("아이템이 존재하지 않습니다.");
		}
		todoItemList.remove(index);
	}
	
	public void read () {
		//순번x foreach
		for(int i = 0; i < todoItemList.size(); i+=1) {
			TodoItemVO todoItemVO = todoItemList.get(i);
			System.out.println(todoItemVO);
			//진배 VO override 부분을 당겨오는 것 
			//현재는 메모리 값으로 표시된다.
			String a =" ";
			if(todoItemVO.isCheck()) {
				a="X";
			}
			System.out.println("["+a+"]" + todoItemVO.getName());
		}
			System.out.println(todoItemList.size()+ "개의 아이템이 조회되었습니다.");
	}
	
	public static void main(String[] args) {
		TodoItemService todoItemService = new TodoItemService();
		
		Scanner scan = new Scanner (System.in);
		
		while (true) {
			System.out.println("메뉴를 입력하세요:");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			
			int menu =scan.nextInt();
			scan.nextLine();
			
			if(menu ==1) {
				System.out.println("TODO 명을 입력하세요:");
				String name = scan.nextLine();
				
				todoItemService.create(name);
				System.out.println("아이템이 등록되었습니다.");
			}
			else if (menu==2) {
				System.out.println("수정할 아이템 번호를 입력하세요:");
				int index = scan.nextInt();
				scan.nextLine();
				System.out.println("아이템이 완료되었다면 Y를 입력하세요.");
				String a = scan.nextLine();
				
				todoItemService.update(index, a.equals("Y"));
				if(a.equals("Y")) {
					System.out.println("이 완료되었습니다.");
				}
				else {
					System.out.println( "이 미완료되었습니다.");
				}
				}
			else if (menu==3) {
				System.out.println("삭제할 아이템 번호를 입력하세요:");
				int index = scan.nextInt();
				scan.nextLine();
				
			}
			else if (menu==4) {
				todoItemService.read();
				System.out.println("총");
			}
			else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}
}
