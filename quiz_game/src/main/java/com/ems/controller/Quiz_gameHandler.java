package com.ems.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ems.beans.Questions;
import com.ems.factory.QuestionsServiceFactory;
import com.ems.service.QuestionsService;


public class Quiz_gameHandler implements RequestHandler<Map<String, String>, Map<String, ArrayList<Questions>>>{
	
	@Override
	public Map<String, ArrayList<Questions>> handleRequest(Map<String, String> input, Context context) 
	{
		ArrayList<Questions> questionsArr;
		Map<String, ArrayList<Questions>> hm=new HashMap<>();
		QuestionsService questionsService=QuestionsServiceFactory.getQuestionsService();
		questionsArr=questionsService.getQuestions();
		hm.put("body", questionsArr);
		return hm;
	}

}
