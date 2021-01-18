package com.app.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private Long questionId;
	@Column(columnDefinition = "TEXT")
	private String question;
	@Lob
	private byte[] image;
	@Column(length = 30)
	private String imageContentType;
	private int points;
	@ManyToOne
	@JoinColumn(name="paper_id")
	private Paper paper;
	
	public Questions() {
		System.out.println("In Constructor of "+getClass().getName());
	}

	public Questions(Long questionId, String question, int points) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.points = points;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@JsonIgnore
	public Paper getPaper() {
		return paper;
	}

	@JsonProperty
	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", points=" + points + ", paper="
				+ paper + "]";
	}
	
	
}