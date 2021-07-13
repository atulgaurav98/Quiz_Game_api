package com.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ems.beans.Questions;
import com.ems.factory.ConnectionFactory;

public class QuestionsDaoImpl implements QuestionsDao {

	@Override
	public ArrayList<Questions> get() {
		
		Questions questions;
		ArrayList<Questions> questionsArr=new ArrayList<>();
		
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM quiz_game");
			
			while(rs.next()) {
				questions=new Questions();
				questions.setStatus("success");
				questions.setQuestion_id(rs.getInt("question_id"));
				questions.setQuestion_type(rs.getString("question_type"));
				questions.setQuestions(rs.getString("questions"));
				questions.setOption1(rs.getString("option1"));
				questions.setOption2(rs.getString("option2"));
				questions.setOption3(rs.getString("option3"));
				questions.setOption4(rs.getString("option4"));
				questions.setAnswers(rs.getString("answers"));
				questionsArr.add(questions);
				
			}
			
		} catch (Exception e) {
			questions=new Questions();
			questions.setStatus("Failure");
			e.printStackTrace();
		}
		return questionsArr;
	}

}
