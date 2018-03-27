package com.ums.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ums.bean.School;
import com.ums.service.SchoolManageService;
import com.ums.utils.ReqResult;

@Controller
@RequestMapping("/school")
public class SchoolManageController {
	
	@Autowired
	private SchoolManageService schoolManageService;
	
	@RequestMapping(value="/getSchool", method=RequestMethod.POST)
	@ResponseBody
	public ReqResult getSchool(School school, HttpServletRequest request) {
		List<School> schoolList = schoolManageService.getSchools(school);
		return schoolList.size()==0 ? ReqResult.fail("没有学校") : ReqResult.success().add("schools", schoolList);
	}
	
}
