package com.books.springbootLibrary.requestmodels.requestmodels;

import lombok.Data;

@Data
public class AdminQuestionRequest {

    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	private String response;
}
