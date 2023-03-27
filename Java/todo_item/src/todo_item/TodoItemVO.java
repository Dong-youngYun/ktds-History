package todo_item;

public class TodoItemVO {

	private String name;
	
	private boolean check;
	
	public TodoItemVO(String name) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
	
}
