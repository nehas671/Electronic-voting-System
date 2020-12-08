package com.cg.VotingApp.exception;



public class ElectionNotFoundException extends Exception {
	private String message;
	
	public ElectionNotFoundException() {
		this.message = "";
	}
	public ElectionNotFoundException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Election not found " + this.message;
	}
	
}