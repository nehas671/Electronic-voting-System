package com.cg.votingapp.dto;

public class Partys
{	
	private String party_name;
	private String leader;
	private String symbol;
	
	//Default Constructor
	public Partys()
	{
		super();
	}
	
	//Parameterized Constructor
	public Partys(String party_name, String leader, String symbol)
	{
		super();
		this.party_name = party_name;
		this.leader = leader;
		this.symbol = symbol;
	}

	//Getters and Setters
	public String getParty_name()
	{
		return party_name;
	}

	public void setParty_name(String party_name)
	{
		this.party_name = party_name;
	}

	public String getLeader()
	{
		return leader;
	}

	public void setLeader(String leader)
	{
		this.leader = leader;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	//ToString Method
	@Override
	public String toString()
	{
		return "Party [party_name=" + party_name + ", leader=" + leader + ", symbol=" + symbol + "]";
	}
}