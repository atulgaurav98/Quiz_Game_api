package com.ems.service;

import java.util.ArrayList;

import com.ems.beans.Questions;
import com.ems.dao.QuestionsDao;
import com.ems.factory.QuestionsDaoFactory;

public class QuestionsServiceImpl implements QuestionsService {

	@Override
	public ArrayList<Questions> getQuestions() {
		QuestionsDao questionsDao=QuestionsDaoFactory.getQuestionsDao();
		ArrayList<Questions> questionsArr=questionsDao.get();
		return questionsArr;
	}

}
