package com.cg.votingapp.exceptions;

public class ScheduleNotFound extends Exception{
	private String message;

	public ScheduleNotFound() {
		this.message = "";
	}
	public ScheduleNotFound(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Schedule not found " + this.message;
	}
}
