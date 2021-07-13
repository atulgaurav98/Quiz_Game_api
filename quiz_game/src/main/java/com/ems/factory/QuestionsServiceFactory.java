package com.ems.factory;

import com.ems.service.QuestionsService;
import com.ems.service.QuestionsServiceImpl;

public class QuestionsServiceFactory {
	private static QuestionsService questionsService=null;
	static {
		questionsService=new QuestionsServiceImpl();
	}
	public static QuestionsService getQuestionsService() {
		return questionsService;
	}
}
