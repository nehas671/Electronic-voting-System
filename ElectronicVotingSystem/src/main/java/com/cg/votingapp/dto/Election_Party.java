package com.cg.votingapp.dto;

public class Election_Party
{	
	private int election_id;
	private String party_name;
	
	//Default Constructor
	public Election_Party()
	{
		super();
	}
	
	//Parameterized Constructor
	public Election_Party(int election_id, String party_name)
	{
		super();
		this.election_id = election_id;
		this.party_name = party_name;
	}
	
	//Getters and Setters
	public int getElection_id()
	{
		return election_id;
	}
	
	public void setElection_id(int election_id)
	{
		this.election_id = election_id;
	}
	
	public String getParty_name()
	{
		return party_name;
	}
	
	public void setParty_name(String party_name)
	{
		this.party_name = party_name;
	}
	
	//ToString method
	@Override
	public String toString()
	{
		return "Election_Party [election_id=" + election_id + ", party_name=" + party_name + "]";
	}
}