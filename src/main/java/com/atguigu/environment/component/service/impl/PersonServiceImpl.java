package com.atguigu.environment.component.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.environment.component.service.inter.PersonService;
import com.atguigu.environment.mapper.PersonMapper;
import com.atguigu.environment.model.Person;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public List<Person> getPersonListByDeptId(Integer departmentId) {
		return personMapper.getPersonListByDeptId(departmentId);
	}

}
