package com.example.quizApp.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Quiz {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String title;
@ManyToMany
//here many to many because one quiz has multiple question
private List<Question> question;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public List<Question> getQuestion() {
	return question;
}
public void setQuestion(List<Question> question) {
	this.question = question;
}
public Quiz(int id, String title, List<Question> question) {
	super();
	this.id = id;
	this.title = title;
	this.question = question;
}
public Quiz() {
	super();
	// TODO Auto-generated constructor stub
}


}
