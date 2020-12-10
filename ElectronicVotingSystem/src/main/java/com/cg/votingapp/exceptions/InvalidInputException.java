package com.cg.votingapp.exceptions;

//Exception for Invalid Inputs
public class InvalidInputException extends Exception
{
	private String message;

	public InvalidInputException()
	{
		this.message = "";
	}
	
	public InvalidInputException(String message)
	{
		this.message = message;
	}
	
	@Override
	public String toString()
	{
		return "Election not found " + this.message;
	}
}