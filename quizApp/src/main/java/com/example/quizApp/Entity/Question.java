package com.example.quizApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Question {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="id")
private Integer id;
@Column(name="question_tile")
private String questionTile;
@Column(name="option1")
private String option1;
@Column(name="option2")
private String option2;
@Column(name="option3")
private String option3;
@Column(name="option4")
private String option4;
@Column(name="right_answer")
private String rightAnswer;
@Column(name="diffculty_level")
private String diffcultyLevel;
@Column(name="category")
private String category;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getQuestionTile() {
	return questionTile;
}
public void setQuestionTile(String questionTile) {
	this.questionTile = questionTile;
}
public String getOption1() {
	return option1;
}
public void setOption1(String option1) {
	this.option1 = option1;
}
public String getOption2() {
	return option2;
}
public void setOption2(String option2) {
	this.option2 = option2;
}
public String getOption3() {
	return option3;
}
public void setOption3(String option3) {
	this.option3 = option3;
}
public String getOption4() {
	return option4;
}
public void setOption4(String option4) {
	this.option4 = option4;
}

public String getRightAnswer() {
	return rightAnswer;
}
public void setRightAnswer(String rightAnswer) {
	this.rightAnswer = rightAnswer;
}
public String getDiffcultyLevel() {
	return diffcultyLevel;
}
public void setDiffcultyLevel(String diffcultyLevel) {
	this.diffcultyLevel = diffcultyLevel;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "Question [id=" + id + ", questionTile=" + questionTile + ", option1=" + option1 + ", option2=" + option2
			+ ", option3=" + option3 + ", option4=" + option4 + ", rightAnswer=" + rightAnswer + ", diffcultyLevel="
			+ diffcultyLevel + ", category=" + category + "]";
}
public Question(Integer id, String questionTile, String option1, String option2, String option3, String option4,
		String rightAnswer, String diffcultyLevel, String category) {
	super();
	this.id = id;
	this.questionTile = questionTile;
	this.option1 = option1;
	this.option2 = option2;
	this.option3 = option3;
	this.option4 = option4;
	this.rightAnswer = rightAnswer;
	this.diffcultyLevel = diffcultyLevel;
	this.category = category;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}


}
