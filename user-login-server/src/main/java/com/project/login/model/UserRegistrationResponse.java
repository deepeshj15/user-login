package com.project.login.model;

public class UserRegistrationResponse {

	private String status;
	private int statusCode;
	private String message;

	public UserRegistrationResponse(final String status, final int statusCode, final String message) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
