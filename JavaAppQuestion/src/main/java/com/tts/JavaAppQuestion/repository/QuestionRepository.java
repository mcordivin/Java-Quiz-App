package com.tts.JavaAppQuestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.JavaAppQuestion.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository <Question, Long>{
	public Question findQuestionById(Long id);
}
