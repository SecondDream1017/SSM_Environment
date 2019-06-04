package com.atguigu.environment.component.service.inter;

import java.util.List;

import com.atguigu.environment.model.City;

public interface CityService {

	List<City> getAllCityList();
	
	void saveCity(City city);
}
