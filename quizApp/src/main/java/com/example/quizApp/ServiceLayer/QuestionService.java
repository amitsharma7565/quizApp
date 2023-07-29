package com.example.quizApp.ServiceLayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quizApp.Entity.Question;
import com.example.quizApp.dao.QuestionDao;

@Service
public class QuestionService {
@Autowired
	QuestionDao questionDao;

	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}
	public ResponseEntity<Question> addQuestion(Question question) {
		try {
			return new ResponseEntity<Question>(questionDao.save(question),HttpStatus.CREATED);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return new ResponseEntity<Question>(HttpStatus.BAD_REQUEST);
		
	}
	
	public ResponseEntity<List<Question>> getQuestionByCategory(String catergory){
		try {
			return new ResponseEntity<>(questionDao.findByCategory(catergory),HttpStatus.OK);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
		
	}

}
