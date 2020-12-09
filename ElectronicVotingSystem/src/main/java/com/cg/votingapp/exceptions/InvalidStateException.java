package com.cg.votingapp.exceptions;

public class InvalidStateException extends Exception{

private String message;
	
	public InvalidStateException() {
		this.message = "";
	}
	public InvalidStateException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "State not found " + this.message;
	}
}
