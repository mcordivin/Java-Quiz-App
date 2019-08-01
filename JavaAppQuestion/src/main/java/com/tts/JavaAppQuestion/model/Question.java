package com.tts.JavaAppQuestion.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String classification;
	private String question;
	private Map<Integer, String> answerOptions;
	private Integer correctAnswer;
	private Integer difficutlyRating;
	
	public Question() {}

	public Question(String title, String classification, String question, Map<Integer, String> answerOptions,
			Integer correctAnswer, Integer difficutlyRating) {
		this.title = title;
		this.classification = classification;
		this.question = question;
		this.answerOptions = answerOptions;
		this.correctAnswer = correctAnswer;
		this.difficutlyRating = difficutlyRating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<Integer, String> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(Map<Integer, String> answerOptions) {
		this.answerOptions = answerOptions;
	}

	public Integer getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Integer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Integer getDifficutlyRating() {
		return difficutlyRating;
	}

	public void setDifficutlyRating(Integer difficutlyRating) {
		this.difficutlyRating = difficutlyRating;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", classification=" + classification + ", question="
				+ question + ", answerOptions=" + answerOptions + ", correctAnswer=" + correctAnswer
				+ ", difficutlyRating=" + difficutlyRating + "]";
	}
	
}
