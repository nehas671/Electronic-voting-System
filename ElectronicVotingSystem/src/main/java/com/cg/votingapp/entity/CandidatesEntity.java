package com.cg.votingapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Creating Table for Candidate
@Entity
@Table(name="candidate")
public class CandidatesEntity
{	
	@Id
	@Column(name="candidate_id")
	private int candidate_id;
	
	@Column(name="candidate_name")
	private String candidate_name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private int age;
	
	@Column(name="contact_no")
	private int contact_no;
	
	@Column(name="vote_count")
	private int vote_count;
	

	//Many-to-one relation between Candidate and Party
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="party_name", insertable=false , updatable=false)
	private PartysEntity party;

	//Default Constructor
	public CandidatesEntity()
	{
		super();
	}

	//Parameterized Constructors
	public CandidatesEntity(int candidate_id, String candidate_name, String address, int age, int contact_no,
			int vote_count)
	{
		super();
		this.candidate_id = candidate_id;
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_no = contact_no;
		this.vote_count = vote_count;
	}

	public CandidatesEntity(int candidate_id, String candidate_name, String address, int age, int contact_no,
			int vote_count, PartysEntity party)
	{
		super();
		this.candidate_id = candidate_id;
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_no = contact_no;
		this.vote_count = vote_count;
		this.party = party;
	}

	//Getters and Setters
	public int getCandidate_id()
	{
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id)
	{
		this.candidate_id = candidate_id;
	}

	public String getCandidate_name()
	{
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name)
	{
		this.candidate_name = candidate_name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getContact_no()
	{
		return contact_no;
	}

	public void setContact_no(int contact_no)
	{
		this.contact_no = contact_no;
	}

	public int getVote_count()
	{
		return vote_count;
	}

	public void setVote_count(int vote_count)
	{
		this.vote_count = vote_count;
	}

	public PartysEntity getParty() 
	{
		return party;
	}

	public void setParty(PartysEntity party)
	{
		this.party = party;
	}

	//ToString Method
	@Override
	public String toString()
	{
		return "CandidateEntity [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", address="
				+ address + ", age=" + age + ", contact_no=" + contact_no + ", vote_count=" + vote_count + "]";
	}	
}