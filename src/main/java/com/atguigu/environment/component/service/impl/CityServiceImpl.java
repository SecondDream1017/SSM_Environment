package com.atguigu.environment.component.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.environment.component.service.inter.CityService;
import com.atguigu.environment.mapper.CityMapper;
import com.atguigu.environment.model.City;

@Service
@Transactional
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;
	
	@Override
	public List<City> getAllCityList() {
		List<City> cityList = cityMapper.getAllCityList();
		return cityList;
	}

	@Override
	public void saveCity(City city) {
		cityMapper.saveCity(city);
	}

}
