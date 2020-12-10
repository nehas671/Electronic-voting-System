package com.cg.votingapp.exceptions;

//Exception class for Election doesn't exists
public class ElectionNotFoundException extends Exception
{
	private String message;
	
	public ElectionNotFoundException()
	{
		this.message = "";
	}
	
	public ElectionNotFoundException(String message)
	{
		this.message = message;
	}
	
	@Override
	public String toString()
	{
		return "Election not found " + this.message;
	}
}