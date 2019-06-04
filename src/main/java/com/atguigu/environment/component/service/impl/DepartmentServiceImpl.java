package com.atguigu.environment.component.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.environment.component.service.inter.DepartmentService;
import com.atguigu.environment.mapper.DepartmentMapper;
import com.atguigu.environment.model.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> getDepartmentListByCityId(Integer cityId) {
		List<Department> departmentList = departmentMapper.getDepartmentListByCityId(cityId);
		return departmentList;
	}

}
