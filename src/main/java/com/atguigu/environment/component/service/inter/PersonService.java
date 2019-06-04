package com.atguigu.environment.component.service.inter;

import java.util.List;
import com.atguigu.environment.model.Person;

public interface PersonService {
	List<Person> getPersonListByDeptId(Integer departmentId);
}
