package com.cg.votingapp.dto;

public class Candidate {
	private int candidate_id;
	private String candidate_name;
	private String address;
	private int age;
	private long contact_number;
	private int count;
	private Party party;
	
	/*
	 * Constructor for class Candidate
	 */
	
	public Candidate() {}
	
	public Candidate(int candidate_id, String candidate_name, String address, int age, long contact_number, int count) {
		super();
		this.candidate_id=candidate_id;
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_number = contact_number;
		this.count=count;
	}
	
	public Candidate(int candidate_id, String candidate_name, String address, int age, long contact_number, int count, Party party) {
		super();
		this.candidate_id=candidate_id;
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_number = contact_number;
		this.count=count;
		this.party = party;
	}

	/*
	 *Getters and Setters for the above variables
	 */
	
	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_details(long contact_number) {
		this.contact_number = contact_number;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}
	
	/*
	 * ToString method for the above variables
	 */

	@Override
	public String toString() {
		return "CandidateEntity [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", address="
				+ address + ", age=" + age + ", contact_details=" + contact_number + ", count=" + count + "]";
	}
	
}
