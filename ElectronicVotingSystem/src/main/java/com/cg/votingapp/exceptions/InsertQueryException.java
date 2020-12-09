package com.cg.votingapp.exceptions;

public class InsertQueryException extends Exception{
	
	private String message;
	
	public InsertQueryException () {;
	this.message = "";
	}
	public InsertQueryException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "InsertQueryException [message=" + message + "]";
	}
}
