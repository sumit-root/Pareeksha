package com.app.dto;

import java.util.ArrayList;

public class QuestionResponsedto {
	
	private Long questionId;
    private String question;
    private int points;
    private ArrayList<ChoiceResponsedto> choices;
    
    public QuestionResponsedto() {
		System.out.println("In Constructor of "+getClass().getName());
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

	public ArrayList<ChoiceResponsedto> getChoices() {
		return choices;
	}

	public void setChoices(ArrayList<ChoiceResponsedto> choices) {
		this.choices = choices;
	}
	
	//Helper method to add choice to QuestionResponseDto
	public void addChoice(ChoiceResponsedto choice) {
		choices.add(choice);
	}

	@Override
	public String toString() {
		return "QuestionResponsedto [questionId=" + questionId + ", question=" + question + ", points=" + points
				+ ", choices=" + choices + "]";
	}
    
    
}