package todo_item2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoItemService {

	// 상수
	// 변수
	private List<TodoItemVO> todoItemList;

	// 생성자
	// 멤버변수 초기화는 생성자가 담당한다
	public TodoItemService() {
		todoItemList = new ArrayList<>();
	}

	// Getter Setter
	public List<TodoItemVO> getTodoItemList() {
		return todoItemList;
	}

	public void setTodoItemList(List<TodoItemVO> todoItemList) {
		this.todoItemList = todoItemList;
	}

	// Method
	/*
	 * 등록(String 아이템명): void 
	 * 수정(int index, boolean 완료여부): void 
	 * 삭제(int index) : void
	 * 조회(): void 
	 */
	/**
	 * 등록
	 * @param itemName 아이템명
	 */
	public void create(String itemName) {
//		TodoItemVO todoItemVO = new TodoItemVO(itemName);
		//필요가 없어 편의성느낌 16줄덕분에
		todoItemList.add(new TodoItemVO(itemName));
		//생성자만 add에 넣어준다
		//리스트에 쌓기위해 add
	}
	/**
	 * 수정
	 * @param index 수정할 List index
	 * @param isSuccess 완료여부
	 */
	public void update(int index, boolean isSuccess) {
		TodoItemVO todoItem = todoItemList.get(index);
		todoItem.setSuccess(isSuccess); //여기 뭐 들어 있니 get
		//같은 메모리 주소를 가지니까 이렇게만 해도 업데이트가 된다.
		//setSuceess의 몇번째를 가지고 와서 수정을 해주고 싶다는 소리
	}
	
	/**
	 * 삭제
	 * @param index 삭제할 List index
	 */
	public void delete(int index) {
		todoItemList.remove(index);
	}
	/**
	 * 조회(모든 아이템을 조회한다.)
	 */
	public void read() {
		for(TodoItemVO todoItem: todoItemList) {
//			String successSymbol = " ";
//			if (todoItem.isSuccess()) {
//				successSymbol = "X";
//			}
			String successSymbol = todoItem.isSuccess() ? "X" : " ";
			//삼항 연산자 위의 4줄을 한줄로 (심플할떄만 사용/ 복잡하게 중첩될때는 사용X)
			System.out.println("["+successSymbol+"]" + todoItem.getItemName());
		}
		System.out.println("총" +todoItemList.size() + "개의 아이템이 조회되었습니다.");
	}
	
	//main
	public static void main(String[] args) {
		TodoItemService service = new TodoItemService();
		Scanner scan = new Scanner(System. in);
		
		System.out.println("TODO LIST");
		
		while (true) {
			
		System.out.println("===================");
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 조회");
		System.out.println("5. 종료");
		System.out.println("===================");
		System.out.println("메뉴를 입력하세요:");
		
		int menu =scan.nextInt();
		//nextInt 나오면 nextLine으로 한번 날려
		scan.nextLine();//엔터를 무시하는 코드
		
		if(menu == 1) {
			System.out.println("TODO 명을 입력하세요:");
			String itemName = scan.nextLine();
			service.create(itemName); //scan.nextLine() 을 여기 ()에 옮겨도 된다.
			System.out.println("아이템이 등록되었습니다.");
		}
		else if (menu == 2) {
			System.out.println("수정할 아이템 번호를 입력하세요:");
			int itemIndex = scan.nextInt();
			scan.nextLine(); //엔터를 무시하는 코드
			//여길 위해 위에 getter setter줬다.
			
			int listLength = service.getTodoItemList().size();//size가 0 아이템인덱스가 0일때 잘나오게 하기위해 =이 붙어서 잘되
			//if (service.getTodoItemList().isEmpty() || listLength <= itemIndex) { 데이터가 없냐? 
			if (listLength <= itemIndex) {
				System.out.println("아이템이 존재하지 않습니다.");
			}
			else {
				System.out.println("아이템이 완료되었다면 \"Y\"를 입력하세요:");
				//""안에 "" \사용해서 표현
				String yn =scan.nextLine();
				boolean isY = yn.equalsIgnoreCase("Y");
				service.update(itemIndex, isY);
//				service.update(itemIndex, yn.toUpperCase().equals("Y"));//뭐든 대문자로 바꿔서 은행어플 아이디칠때 대문자로 나오는것
//				service.update(itemIndex, yn.toLowerCase().equals("y"));//뭐든 소문자로 바꿔서
				TodoItemVO todoItem = service.getTodoItemList().get(itemIndex); //아이템명을 가져오기 위해서 접근
				if (isY) {
					System.out.println("[" + todoItem.getItemName() + "] 이 완료되었습니다.");
				}
				else {
					System.out.println("[" + todoItem.getItemName() + "] 이 미완료되었습니다.");
				}
			}
			
			//service.getTodoItemList().size() 사이즈가 0 itemindex도 0이면 어떻게해
		}
		else if (menu == 3) {
			System.out.println("삭제할 아이템 번호를 입력하세요");
			int itemIndex = scan.nextInt();
			scan.nextLine(); // 엔터를 무시하는 코드
			
			int listLength = service.getTodoItemList().size();
			if (listLength <= itemIndex) {
				System.out.println("아이템이 존재하지 않습니다.");
			}
			else {
				service.delete(itemIndex);
				System.out.println("아이템이 삭제되었습니다.");
			}
			
		}
		else if (menu == 4) {
			service.read();
		}
		else {
			System.out.println("프로그램이 종료되었습니다.");
			break;
		}
		}
	}

}
