package com.tts.JavaAppQuestion.service;

import java.util.List;

import com.tts.JavaAppQuestion.model.Question;

public interface QuestionService {
	public List<Question> findAll();
	public Question findQuestionById(Long id);
	public void saveQuestion(Question question);
	public void deleteAll();
	public void deleteById(Long id);
	public void updateQuestionById(Question question, Long id);
}
