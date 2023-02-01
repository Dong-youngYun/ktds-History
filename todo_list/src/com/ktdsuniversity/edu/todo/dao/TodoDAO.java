package com.ktdsuniversity.edu.todo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.todo.vo.TodoVO; // 직접쓰면 *가 나오는데*는 vo 안에 있는 모든 클래스를 인풋하겟다 무거워져 (절대 쓰지마)

public class TodoDAO {

	private static int count = 1;

	private Map<Integer, TodoVO> dataSource; // data관리라 datasource 적어줄게(그냥) 에러는 패키지가 달라서 생기는 문제

	public TodoDAO() {
		dataSource = new HashMap<>();
	}

	// 등록 (Map이 지금은 DB역할 DB에서 돌려준 개수를 가지고 한다./몇개를 생성했냐 생성한 수를 돌려주는 거야 그래서 int)
	public int create(String itemName) {
		dataSource.put(count++, new TodoVO(itemName)); // 1넣으면 1/ 넣고나서 2가 된다.
		//기존에는 TodoVO todoVO = newTodoVO 쓰고 set~ 쓰던걸 TodoVO 클래스에서 setItemName(itemName);으로 설정해둬서
		//바로 DAO 클래스에서 쓸수 있게 만듬
		return 1;
	}

	// 조회(1회)
	public TodoVO read(int number) {
		return dataSource.get(number); // key 를 넣으면 data를 가져와라
	}

	// 조회(모든건)
	public List<TodoVO> readAll() { //다음 lamda할때 할거야
		return dataSource.entrySet()
						   .stream()
						   .map(entry -> entry.getValue())
						   .collect(Collectors.toList());
	}
	// 수정
	public int update(int key, boolean isSuccess) { //몇번 키에 있는 값을 이 값으로 바꿔라
		TodoVO todoVO = dataSource.get(key);
		todoVO.setSuccess(isSuccess);
		return 1;
	}
	
	// 삭제(1회)
	public int delete(int key) {
		dataSource.remove(key);
		return 1;
	}
	// 삭제(모든건)
	public int deleteAll() {
		int size = dataSource.size(); //사이즈를 먼저 가져오고 지워 반대로면 0이되
		dataSource.clear();
		return size; //이 만큼 지웟어
	}

}
