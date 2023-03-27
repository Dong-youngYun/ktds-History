package com.ktdsuniversity.edu.cafe.menu.mgnt.service;

public class MenuMgntServiceImpl {

	private MenuMgntDAO menuMgntDAO;
	
	public boolean create(String itemType,MenuMgntVO menuMgntVO);
	
	public boolean update(String itemType, int itemIdx, MenuMgntVO menuMgntVO);
	
	public boolean delete(String itemType, int itemIdx);
	
	public MenuMgntVO read(String itemType, int itemIdx);
	
	public List<MenuMgntVO> readSome(String itemType);
	
	public Map<String, List<MenuMgntVO>> readAll();

	
}
