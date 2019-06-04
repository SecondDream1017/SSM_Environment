package com.atguigu.environment.mapper;

import java.util.List;

import com.atguigu.environment.model.City;

public interface CityMapper {
	
	List<City> getAllCityList();
	
	void saveCity(City city);
}
