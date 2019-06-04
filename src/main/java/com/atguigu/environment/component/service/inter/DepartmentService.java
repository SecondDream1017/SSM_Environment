package com.atguigu.environment.component.service.inter;

import java.util.List;

import com.atguigu.environment.model.City;
import com.atguigu.environment.model.Department;

public interface DepartmentService {

	List<Department> getDepartmentListByCityId(Integer cityId);
}
