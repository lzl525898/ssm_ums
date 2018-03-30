package com.ums.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ums.bean.Menu;
import com.ums.bean.Role;
import com.ums.bean.User;
import com.ums.dao.RoleMapper;
import com.ums.service.MenuService;
import com.ums.service.UserManageService;
import com.ums.utils.FontAwesomeUtil;
import com.ums.utils.ReqResult;

@Controller
@RequestMapping("/menu")
public class MenuManageController {

	@Autowired
	private MenuService menuService;
	@Autowired
	private UserManageService userManageService;

	// 获取所有菜单
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	@ResponseBody
	public ReqResult getMenus(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 10);
		List<Menu> menuList = menuService.getAllMenus();
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<Menu> pageInfo = new PageInfo<Menu>(menuList, 5);
		return ReqResult.success().add("pageInfo", pageInfo);
	}

	// 通过menuid获取菜单信息
	@RequestMapping(value = "/menu/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ReqResult getMenuById(@PathVariable("id") Integer id) {
		Menu menu = menuService.getMenuById(id);
		List<Menu> Lv1MenuList = MenuService.getLv1MenuList(menuService.getAllMenus());
		List<Role> roleList = userManageService.getRolesAll();
		return ReqResult.success().add("menu", menu).add("lv1menus", Lv1MenuList).add("roles", roleList)
				.add("curmenuid", menu.getParentmenuid()).add("currole", 1).add("fontawesome", FontAwesomeUtil.getProperties());
	}

	// 删除指定菜单（父+子）
	@RequestMapping(value = "/menu/{menuid}/{parentid}", method = RequestMethod.DELETE)
	@ResponseBody
	public ReqResult delMenuById(@PathVariable("menuid") Integer id, @PathVariable("parentid") Integer parentid) {
		if (parentid == 0) {
			menuService.deleteMenusWithIds(id);
		} else {
			menuService.deleteSubMenuById(id);
		}
		return ReqResult.success().add("url", "/manage");
	}

	// 获取所有父菜单和用户角色
	@RequestMapping(value = "/select/info", method = RequestMethod.GET)
	@ResponseBody
	public ReqResult getParentMenu() {
		List<Menu> lv1Menus = MenuService.getLv1MenuList(menuService.getAllMenus());
		List<Role> roles = userManageService.getRolesAll();
		return ReqResult.success().add("parents", lv1Menus).add("roles", roles);
	}

	// 添加菜单
	@RequestMapping(value = "/menu", method = RequestMethod.PUT)
	@ResponseBody
	public ReqResult addMenu(Menu menu, HttpServletRequest request) {
		System.out.println("menurole==>" + request.getParameter("menurole"));
		if (menu.getParentmenuid() == 0) {
			menu.setMenulvl(1); // 一级菜单
		} else {
			menu.setMenulvl(2); // 二级菜单
		}
		menu.setIsdisplay(1);
		menu.setMenuimage("fa fa-fw fa-plus");
		menuService.addMenu(menu);
		return ReqResult.success();
	}
	// 修改菜单
	@RequestMapping(value = "/menu/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ReqResult upadteMenu(Menu menu) {
		Menu oldMenu = menuService.getMenuById(menu.getId());
		ReqResult result = ReqResult.success();
		if (oldMenu.getParentmenuid()==0) { // 需要重新加载后台页面
			result.add("status", 0).add("url", "/manage");
		} else if (oldMenu.getParentmenuid()!=0 && menu.getParentmenuid()==0) { // 需要重新加载后台页面
			result.add("status", 0).add("url", "/manage");
		} else { // 只需要刷新当前分页内容
			result.add("status", 1).add("url", "/manage");
		}
		menu.setIsdisplay(1);
		if (menu.getParentmenuid()==0) {
			menu.setMenulvl(1);
		} else {
			menu.setMenulvl(2);
		}
		menuService.updateMenu(menu);
		return result;
	}
}
