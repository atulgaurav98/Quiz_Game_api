package tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.ems.beans.Questions;
import com.ems.factory.QuestionsServiceFactory;
import com.ems.service.QuestionsService;

public class Test {

	public static void main(String[] args) {
		ArrayList<Questions> questionsArr;
		Map<String, ArrayList<Questions>> hm=new HashMap<>();
		QuestionsService questionsService=QuestionsServiceFactory.getQuestionsService();
		questionsArr=questionsService.getQuestions();
		hm.put("body", questionsArr);
		System.out.println(hm.values());
			}
		
	}

