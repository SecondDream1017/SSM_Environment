package com.atguigu.environment.component.handler;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.environment.component.service.inter.CityService;
import com.atguigu.environment.component.service.inter.DepartmentService;
import com.atguigu.environment.component.service.inter.PersonService;
import com.atguigu.environment.component.service.inter.SurveyService;
import com.atguigu.environment.model.City;
import com.atguigu.environment.model.Department;
import com.atguigu.environment.model.Person;
import com.atguigu.environment.model.Survey;

@Controller
public class EnvironmentHandler {

	@Autowired
	private SurveyService surveyService;
	@Autowired
	private CityService cityService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PersonService personService;
	
	@RequestMapping("environment/guest/toShowUI")
	public String toShowUI(Map<String,Object> map){
		List<Survey> surveyList = surveyService.getAllSurveyList();
		map.put("surveyList", surveyList);
		return "jsp/showUI";
	}
	
	@RequestMapping("environment/guest/toErJiUI")
	public String toErJiUI(Map<String,Object> map){
		List<City> allCityList = cityService.getAllCityList();
		map.put("allCityList", allCityList);
		return "jsp/ajaxErJiUI";
	}
	
	@RequestMapping("environment/guest/ajaxTest")
	public void ajaxTest(HttpServletResponse response,HttpServletRequest request) throws IOException{
		String time = request.getParameter("time");
		System.err.println("-------------"+time+"----------------");
		response.getWriter().print("1234");
	}
	
	@RequestMapping("environment/guest/formTest")
	public String formTest(HttpServletResponse response,HttpServletRequest request) throws IOException{
		String cityName = request.getParameter("cityName");
		System.err.println("-------------"+cityName+"----------------");
		response.getWriter().print("1234");
		return "jsp/showUI";
	}
	
	@RequestMapping("environment/guest/getAllCityList")
	@ResponseBody
	public List<City> getAllCityList(HttpServletResponse response,HttpServletRequest request) throws IOException{
		List<City> allCityList = cityService.getAllCityList();
		System.out.println(allCityList);
		return allCityList;
	}
	
	
	@RequestMapping("environment/guest/getDepartmentListByCityId")
	@ResponseBody
	public List<Department> getDepartmentListByCityId(
			@RequestParam("cityId") Integer cityId){
		List<Department> departmentListByCityId = departmentService.getDepartmentListByCityId(cityId);
		return departmentListByCityId;
	}
	
	@RequestMapping("environment/guest/getPersonListByDeptId")
	@ResponseBody
	public List<Person> getPersonListByDeptId(
			@RequestParam("departmentId") Integer departmentId){
		List<Person> PersonListByDeptId = personService.getPersonListByDeptId(departmentId);
		return PersonListByDeptId;
	}
	
	
}

















