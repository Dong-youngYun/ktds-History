package com.ktdsuniversity.edu.cafe.menu.mgnt.dao;

public class MenuMgntDAOImpl {

	private Map<String, List<MenuMgntVO>> dataSource;

	public MenuMgntDAOImpl() {			//생성자 Hint!!
		dataSource = new HashMap<>();
		dataSource.put("커피", new ArrayList<>());
		dataSource.put("음료", new ArrayList<>());
		dataSource.put("티", new ArrayList<>());
		dataSource.put("디저트", new ArrayList<>());
	}

	public int create(String itemType, MenuMgntVO menuMgntVO);
	
	public int update(String itemType, int itemIdx, MenuMgntVO menuMgntVO);
	
	public int delete(String itemType, int itemIdx);
	
	public MenuMgntVO read(String itemType, int itemIdx);
	
	public List<MenuMgntVO> readSome(String itemType);
	
	public Map<String, List<MenuMgntVO>> readAll();
	
}
