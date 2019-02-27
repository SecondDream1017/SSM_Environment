package com.atguigu.environment.component.handler;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.atguigu.environment.component.service.SurveyService;
import com.atguigu.environment.model.Survey;

@Controller
public class EnvironmentHandler {

	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping("environment/guest/toShowUI")
	public String toShowUI(Map<String,Object> map){
		List<Survey> surveyList = surveyService.getAllSurveyList();
		map.put("surveyList", surveyList);
		return "jsp/showUI";
	}
}
