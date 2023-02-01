package todo_item2;

public class TodoItemVO {

	/*
	 * 생성자: TodoItemVO(String 아이템명)
	 * 완료여부: boolean(true일 경우는 완료,false는 미완료)
	 * 아이템명: String
	 */
	
	//상수
	//변수
	/**
	 * 아이템명
	 */
	private String itemName;
	/**
	 * 완료여부
	 */
	private boolean isSuccess;
	//boolean은 is 붙이는게 일반적
	
	//생성자
	/**
	 * 생성자
	 * @param itemName 아이템명
	 */
	public TodoItemVO(String itemName) {
		setItemName(itemName);
		//굳이 this.isSuccess = false줄 필요 없다 원래 기본값이 false라서
		
	}
	// Getter Setter
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
}
