package com.atguigu.environment.component.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.atguigu.environment.component.service.inter.SurveyService;
import com.atguigu.environment.mapper.SurveyMapper;
import com.atguigu.environment.model.Survey;

@Service
@Transactional
public class SurveyServiceImpl implements SurveyService{

	@Autowired
	private SurveyMapper surveyMapper;

	@Override
	public List<Survey> getAllSurveyList() {
		List<Survey> allSurveyList = surveyMapper.getAllSurveyList();
		return allSurveyList;
	}
	
	
}















