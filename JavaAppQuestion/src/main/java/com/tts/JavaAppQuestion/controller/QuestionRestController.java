package com.tts.JavaAppQuestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.JavaAppQuestion.model.Question;
import com.tts.JavaAppQuestion.service.QuestionServiceImpl;

@RestController
@RequestMapping(value="/api")
public class QuestionRestController {

	@Autowired
	QuestionServiceImpl questionService;
	
	@GetMapping(value="/all")
	public List<Question> findAll(){
		return questionService.findAll();
	}
	
	@GetMapping(value="/question/{id}")
	public Question findQuestionById(@PathVariable Long id) {
		return questionService.findQuestionById(id);
	}
	
	@PostMapping(value="/new")
	public void createNewQuestion(@RequestBody Question question) { 
		questionService.saveQuestion(question);
	}
	
	@PutMapping(value="/update/{id}")
	public void udpateQuestion(@RequestBody Question question, @PathVariable Long id) {
		questionService.updateQuestionById(question, id);
	}
	
	@DeleteMapping(value="/deleteAll")
	public void deleteAll() {
		questionService.deleteAll();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteById(@PathVariable Long id) {
		questionService.deleteById(id);
	}
	
}
