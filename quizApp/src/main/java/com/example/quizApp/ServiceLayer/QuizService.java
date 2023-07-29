package com.example.quizApp.ServiceLayer;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quizApp.Entity.Question;
import com.example.quizApp.Entity.QuestionWrapper;
import com.example.quizApp.Entity.Quiz;
import com.example.quizApp.Entity.Response;
import com.example.quizApp.dao.QuestionDao;
import com.example.quizApp.dao.QuizDao;

@Service
public class QuizService {
@Autowired
	QuizDao quizDao;
@Autowired
QuestionDao questionDao;




public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
	List<Question> question= questionDao.findRandomQuestionByCategory(category,numQ);
	Quiz quiz = new Quiz();
	quiz.setTitle("Test is begin now");
	quiz.setQuestion(question);
	 quizDao.save(quiz);
	return new ResponseEntity<>("Sucess",HttpStatus.CREATED);

}




public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id) {
java.util.Optional<Quiz> quiz= quizDao.findById(id);
List<Question> questionFromDb=quiz.get().getQuestion();
List<QuestionWrapper> questionForUser=new ArrayList<>();
for(Question q:questionFromDb) {
	QuestionWrapper qw= new QuestionWrapper(q.getId(),q.getQuestionTile(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
	questionForUser.add(qw);
}
return new ResponseEntity<>(questionForUser,HttpStatus.OK);
	
}




public ResponseEntity<Integer> calculateResults(Integer id, List<Response> response) {
	Quiz quiz=quizDao.findById(id).get();
	List<Question> question= quiz.getQuestion();
	int i=0;
	int rightAns=0;
	for(Response responses : response) {
		System.out.println("responses.getResponse() "+responses.getResponse());
		System.out.println("question.get(i) "+question.get(i));
		System.out.println("question.get(i).getRightAnswer() "+question.get(i).getRightAnswer());
		if(responses.getResponse().equals(question.get(i).getRightAnswer())) {
			rightAns++;
		}
		i++;
	}
	return new ResponseEntity<>(rightAns,HttpStatus.OK);
}






}
