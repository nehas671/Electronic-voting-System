package com.cg.votingapp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Creating Party Entity
@Entity
@Table(name="party")
public class PartysEntity
{
	@Id
	@GeneratedValue
	@Column(name="party_name")
	private String party_name;
	
	@Column(name="leader")
	private String leader;
	
	@Column(name="symbol")
	private String symbol;
	
	//Creating one to many relation with party	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER, mappedBy="party")
	private Set<CandidatesEntity> candidate;
	
	//Default Constructor
	public PartysEntity() 
	{
		super();
	}

	//Parameterized Constructor
	public PartysEntity(String party_name, String leader, String symbol)
	{
		super();
		this.party_name = party_name;
		this.leader = leader;
		this.symbol = symbol;
	}

	public PartysEntity(String party_name, String leader, String symbol, Set<CandidatesEntity> candidate)
	{
		super();
		this.party_name = party_name;
		this.leader = leader;
		this.symbol = symbol;
		this.candidate = candidate;
	}
	
	//Getter and Setter methods
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

	public Set<CandidatesEntity> getCandidate()
	{
		return candidate;
	}

	public void setEntity(Set<CandidatesEntity> candidate)
	{
		this.candidate = candidate;
	}
	
	//toString method
	@Override
	public String toString()
	{
		return "PartyEntity [party_name=" + party_name + ", leader=" + leader + ", symbol=" + symbol + "]";
	}
}