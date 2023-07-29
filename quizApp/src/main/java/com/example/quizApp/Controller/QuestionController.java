package com.example.quizApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizApp.Entity.Question;
import com.example.quizApp.ServiceLayer.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
@GetMapping("/allQuestions")
public ResponseEntity<List<Question>> getAllQuestions() {
	return questionService.getAllQuestions();
}
@PostMapping("/add")
public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
	return questionService.addQuestion(question);	
}

@GetMapping("/category/{category}")
public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
	return questionService.getQuestionByCategory(category);
	
}

 
}
