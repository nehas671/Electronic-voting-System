package com.cg.votingapp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="election")
public class ElectionsEntity
{	
	@Id
	@Column(name="election_id")
	private int electionId;
	
	@Column(name="election_name")
	private String electionName;
	
	@Column(name="state")
	private String state;
	
	@Column(name="constituency")
	private String constituency;
	
	@Column(name="date")
	private Date date;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="election_party", joinColumns = { @JoinColumn(name = "election_id") }, 
				inverseJoinColumns = { @JoinColumn(name = "party_name") })
	private Set<PartysEntity> party=new HashSet<PartysEntity>();

	public ElectionsEntity()
	{
		super();
	}

	public ElectionsEntity(int electionId, String electionName, String state, String constituency, Date date,
			Set<PartysEntity> party)
	{
		super();
		this.electionId = electionId;
		this.electionName = electionName;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
		this.party = party;
	}

	public ElectionsEntity(String electionName, String state, String constituency, Date date, Set<PartysEntity> party)
	{
		super();
		this.electionName = electionName;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
		this.party = party;
	}

	public ElectionsEntity(int electionId, String electionName, String state, String constituency, Date date)
	{
		super();
		this.electionId = electionId;
		this.electionName = electionName;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
	}

	public int getElectionId()
	{
		return electionId;
	}

	public void setElectionId(int electionId)
	{
		this.electionId = electionId;
	}

	public String getElectionName()
	{
		return electionName;
	}

	public void setElectionName(String electionName)
	{
		this.electionName = electionName;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getConstituency()
	{
		return constituency;
	}

	public void setConstituency(String constituency)
	{
		this.constituency = constituency;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Set<PartysEntity> getParty()
	{
		return party;
	}

	public void setParty(Set<PartysEntity> party)
	{
		this.party = party;
	}

	@Override
	public String toString()
	{
		return "ElectionEntity [electionId=" + electionId + ", electionName=" + electionName + ", state=" + state
				+ ", constituency=" + constituency + ", date=" + date + ", party=" + party + "]";
	}
}