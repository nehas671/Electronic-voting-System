package com.cg.votingapp.exceptions;

public class NullValueFoundException extends Exception {
	private String message;
	
	public NullValueFoundException() {
		this.message = "";
	}
	public NullValueFoundException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Item not found " + this.message;
	}
}
