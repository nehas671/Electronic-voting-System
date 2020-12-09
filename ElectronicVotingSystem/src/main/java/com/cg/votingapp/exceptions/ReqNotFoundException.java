package com.cg.votingapp.exceptions;
public class ReqNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public ReqNotFoundException() {
		this.message = "";
	}
	public ReqNotFoundException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Request not found " + this.message;
	}
	
}
