package com.ems.factory;

import com.ems.dao.QuestionsDao;
import com.ems.dao.QuestionsDaoImpl;

public class QuestionsDaoFactory {
	private static QuestionsDao questionsDao=null;
	static {
		questionsDao=new QuestionsDaoImpl();
	}
	public static QuestionsDao getQuestionsDao() {
		return questionsDao;
	}
}
