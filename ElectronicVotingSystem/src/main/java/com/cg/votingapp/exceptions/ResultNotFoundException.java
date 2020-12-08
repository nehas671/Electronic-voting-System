package com.cg.votingapp.exceptions;

public class ResultNotFoundException extends Exception {

	
	private String message;
	
	public ResultNotFoundException() {
		this.message = "";
	}
	public ResultNotFoundException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result not found " + this.message;
	}
	
	}

	
	
	
