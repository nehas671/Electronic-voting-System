package com.cg.votingapp.exceptions;
public class UserNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public UserNotFoundException() {
		this.message = "";
	}
	public UserNotFoundException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "User not found " + this.message;
	}
	
}

