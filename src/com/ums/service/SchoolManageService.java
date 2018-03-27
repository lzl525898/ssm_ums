package com.ums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.bean.School;
import com.ums.bean.SchoolExample;
import com.ums.bean.SchoolExample.Criteria;
import com.ums.dao.SchoolMapper;

@Service
public class SchoolManageService {
	
	@Autowired
	private SchoolMapper schoolMapper;
	
	public List<School> getSchools(School school){
		SchoolExample schoolExample = new SchoolExample();
		Criteria criteria =  schoolExample.createCriteria();
		if (school.getProvince()!=null) {
			criteria.andProvinceEqualTo(school.getProvince());
		}
		if (school.getCity()!=null) {
			criteria.andCityEqualTo(school.getCity());
		}
		if (school.getArea()!=null) {
			criteria.andAreaEqualTo(school.getArea());
		}
		return schoolMapper.selectByExample(schoolExample);
	}
	
}
