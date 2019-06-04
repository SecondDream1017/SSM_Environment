package com.atguigu.environment.component.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.environment.component.service.inter.CityService;
import com.atguigu.environment.component.service.inter.DepartmentService;
import com.atguigu.environment.component.service.inter.PersonService;
import com.atguigu.environment.component.service.inter.SurveyService;
import com.atguigu.environment.model.City;
import com.atguigu.environment.model.Department;
import com.atguigu.environment.model.Person;
import com.atguigu.environment.model.Survey;
import com.atguigu.environment.model.User;

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
	
	private static Logger logger = 
			Logger.getLogger(EnvironmentHandler.class);
	
	@RequestMapping("environment/guest/toModelAndViewUI")
	public ModelAndView test(){
		ModelAndView model = new ModelAndView();
		model.setViewName("jsp/eclassStudentUI");
		//model.addObject("name", "gaoming");
		Map<String,String> map = new HashMap<>();
		map.put("aa", "aa值");
		map.put("bb", "bb值");
		map.put("cc", "cc值");
		//model.addObject("mapValue", map);
		model.addAllObjects(map);
		
		return model;
	}
	
	@ResponseBody
	@RequestMapping("environment/guest/ajaxTest")
	public Map<String,Object> ajaxTest(User user){
		System.out.println(user.getName());
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("name", "gaoming");
		map.put("age", 27);
		return map;
	}
	
	
	@RequestMapping("environment/guest/toShowUI")
	public String toShowUI(Map<String,Object> map){
		List<Survey> surveyList = surveyService.getAllSurveyList();
		map.put("surveyList", surveyList);
		return "jsp/showUI";
	}
	
	@RequestMapping("environment/guest/toErJiUI")
	public String toErJiUI(Map<String,Object> map){
		/*List<City> allCityList = cityService.getAllCityList();
		map.put("allCityList", allCityList);*/
		System.out.println("12344");
		return "jsp/ajaxErJiUI";
	}
	
	/*@RequestMapping("environment/guest/ajaxTest")
	public void ajaxTest(HttpServletResponse response,HttpServletRequest request) throws IOException{
		String time = request.getParameter("time");
		System.err.println("-------------"+time+"----------------");
		response.getWriter().print("1234");
	}*/
	
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
	
	@RequestMapping("environment/guest/saveCity")
	public String saveCity(HttpServletRequest request,@RequestBody City city) throws IOException{
		String cityName = request.getParameter("name");
		System.err.println("-------------"+cityName+"----------------");
		//response.getWriter().print("1234");
		return "jsp/showUI";
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
	
	@RequestMapping("environment/guest/toEclassStudentUI")
	public ModelAndView toEclassStudentUI(){
		logger.error("这个是日志的信息......");
		System.out.println("22222");
		logger.info("这个是日志的信息2222");
		ModelAndView model = new ModelAndView();
		model.setViewName("jsp/eclassStudentUI");
		return model;
	}
	
	@RequestMapping("environment/guest/toEclassStudentUI2")
	public String toEclassStudentUI2(){
		logger.error("这个是日志的信息......");
		ModelAndView model = new ModelAndView();
		model.setViewName("jsp/eclassStudentUI");
		return "jsp/eclassStudentUI";
	}
	
	
}

















