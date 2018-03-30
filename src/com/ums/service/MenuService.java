package com.ums.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.bean.Menu;
import com.ums.bean.MenuExample;
import com.ums.bean.MenuExample.Criteria;
import com.ums.dao.MenuMapper;

@Service
public class MenuService {
	
	@Autowired
	private MenuMapper menuMapper;
	
	/**
	 * 获取所有菜单
	 * @param menuList
	 * @return
	 */
	public List<Menu> getAllMenus(){
		return menuMapper.selectByExample(null);
	}
	
	/**
	 * 按照指定id获取菜单
	 * @param menuid
	 * @return
	 */
	public Menu getMenuById(Integer id) {
		return menuMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 按照指定id删除子菜单和parentid删除父菜单
	 * @param menuid
	 * @return
	 */
	public void deleteMenusWithIds(Integer id) {
		MenuExample menuExample = new MenuExample();
		Criteria criteriaWithId = menuExample.createCriteria();
		criteriaWithId.andParentmenuidEqualTo(id);
		Criteria criteriaWithParentId = menuExample.createCriteria();
		criteriaWithParentId.andIdEqualTo(id);
		menuExample.or(criteriaWithParentId);
		menuMapper.deleteByExample(menuExample);
	}
	
	/**
	 * 添加新菜单
	 * @param menu
	 * @return
	 */
	public int addMenu(Menu menu) {
		return menuMapper.insert(menu);
	}
	
	/**
	 * 更新菜单
	 * @param menu
	 * @return
	 */
	public void updateMenu(Menu menu) {
		menuMapper.updateByPrimaryKeySelective(menu);
	}
	
	/**
	 * 按照指定id删除子菜单
	 * @param menuid
	 * @return
	 */
	public void deleteSubMenuById(Integer id) {
		menuMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 获取一级主菜单
	 * @param menuList
	 * @return
	 */
	public static List<Menu> getLv1MenuList(List<Menu> menuList){
		List<Menu> mList = new ArrayList<Menu>();
		for (Menu menu : menuList) {
			if (menu.getParentmenuid() == 0 && menu.getIsdisplay()==1) {
				mList.add(menu);
			}
		}
		return mList;
	}
	/**
	 * 获取二级主菜单
	 * @param menuList
	 * @return
	 */
	public static List<Menu> getLv2MenuList(List<Menu> menuList){
		List<Menu> mList = new ArrayList<Menu>();
		for (Menu menu : menuList) {
			if (menu.getMenulvl()==2 &&menu.getIsdisplay()==1) {
				mList.add(menu);
			}
		}
		return mList;
	}
}
