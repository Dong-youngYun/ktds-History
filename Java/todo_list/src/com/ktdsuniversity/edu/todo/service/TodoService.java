package com.ktdsuniversity.edu.todo.service;

import java.util.List;

import com.ktdsuniversity.edu.todo.dao.TodoDAO;
import com.ktdsuniversity.edu.todo.vo.TodoVO;

public class TodoService {
//service의 역할은 호출만 (그냥 DAO에 토스만 해줘, 실제처리는 DAO에서)
	private TodoDAO todoDAO; //변수를 만들어줘
	
	public TodoService() {
		todoDAO = new TodoDAO(); //객체 없으니 만들어줘 생성자에서
	}
	
	//등록
	public boolean create(String itemName) { //등록 성공했냐 실패했냐?
		return todoDAO.create(itemName) > 0; // DAO에게 돌려주고 받아서 확인
	}
	//조회 (1건)
	public TodoVO read(int key) {
		return todoDAO.read(key);
	}
	//조회 (모든건)
	public List<TodoVO> readAll (){
		return todoDAO.readAll();
	}
	//수정
	public boolean update(int key,boolean isSuccess) {
		return todoDAO.update(key, isSuccess) > 0;
	}
	
	//삭제 (1건)
	public boolean delete(int key) { //삭제 성공햿냐 실패했냐?
		return todoDAO.delete(key) > 0;
	}
	//삭제 (모든건)
	public boolean deleteAll() {
		return todoDAO.deleteAll() > 0;
	}
	
}
