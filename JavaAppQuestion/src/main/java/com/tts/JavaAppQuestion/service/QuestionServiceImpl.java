package com.tts.JavaAppQuestion.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.JavaAppQuestion.model.Question;
import com.tts.JavaAppQuestion.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> findAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question findQuestionById(Long id) {
		return questionRepository.findQuestionById(id);
	}

	@Override
	public void saveQuestion(Question question) {
		questionRepository.save(question);
	}

	@Override
	public void deleteAll() {
		questionRepository.deleteAll();
	}

	@Override
	public void deleteById(Long id) {
		questionRepository.deleteById(id);
	}

	@Override
	public void updateQuestionById(Question inputQuestion, Long id) {
		Question updatedQuestion = questionRepository.findQuestionById(id);
		String title = inputQuestion.getTitle();
		String classification = inputQuestion.getClassification();
		String question = inputQuestion.getQuestion();
		Map<Integer, String> answerOptions = inputQuestion.getAnswerOptions();
		Integer correctAnswer = inputQuestion.getCorrectAnswer();
		Integer difficultyRating = inputQuestion.getDifficutlyRating();
		if(title != null) updatedQuestion.setTitle(title);
		if(classification != null) updatedQuestion.setClassification(classification);
		if(question != null) updatedQuestion.setQuestion(question);
		if(answerOptions != null) updatedQuestion.setAnswerOptions(answerOptions);
		if(correctAnswer != null) updatedQuestion.setCorrectAnswer(correctAnswer);
		if(difficultyRating != null) updatedQuestion.setDifficutlyRating(difficultyRating);
		questionRepository.save(updatedQuestion);
	}
	

}
