package com.ktdsuniversity.edu.cafe.menu.mgnt.dao;

public interface MenuMgntDAO {

	public int create(String itemType, MenuMgntVO menuMgntVO);
	
	public int update(String itemType, int itemIdx, MenuMgntVO menuMgntVO);
	
	public int delete(String itemType, int itemIdx);
	
	public MenuMgntVO read(String itemType, int itemIdx);
	
	public List<MenuMgntVO> readSome(String itemType);
	
	public Map<String, List<MenuMgntVO>> readAll();
	
}
