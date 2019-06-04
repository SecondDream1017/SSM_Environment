package com.atguigu.environment.mapper;

import java.util.List;

import com.atguigu.environment.model.Department;


public interface DepartmentMapper {

	List<Department> getDepartmentListByCityId(Integer cityId);
}
