package com.cg.votingapp.dto;

public class Candidates
{
	private int candidate_id;
	private String candidate_name;
	private String address;
	private int age;
	private long contact_number;
	private int count;
	private Partys party;
	
	//Default Constructor
	public Candidates() 
	{
		super();
	}
	
	//Parameterized Constructors
	public Candidates(int candidate_id, String candidate_name, String address, int age, long contact_number, int count)
	{
		super();
		this.candidate_id=candidate_id;
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_number = contact_number;
		this.count=count;
	}
	
	public Candidates(int candidate_id, String candidate_name, String address, int age, long contact_number, int count, Partys party)
	{
		super();
		this.candidate_id=candidate_id;
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_number = contact_number;
		this.count=count;
		this.party = party;
	}

	//Getter and Setter methods
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

	public long getContact_number()
	{
		return contact_number;
	}

	public void setContact_details(long contact_number)
	{
		this.contact_number = contact_number;
	}
	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public Partys getParty()
	{
		return party;
	}

	public void setParty(Partys party)
	{
		this.party = party;
	}

	//toString Method
	@Override
	public String toString()
	{
		return "CandidateEntity [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", address="
				+ address + ", age=" + age + ", contact_details=" + contact_number + ", count=" + count + "]";
	}	
}