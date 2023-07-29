package com.example.quizApp.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizApp.Entity.Quiz;
@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
