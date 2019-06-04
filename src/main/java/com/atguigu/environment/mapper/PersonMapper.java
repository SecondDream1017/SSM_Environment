package com.atguigu.environment.mapper;

import java.util.List;
import com.atguigu.environment.model.Person;

public interface PersonMapper {

	List<Person> getPersonListByDeptId(Integer departmentId);
	
}
