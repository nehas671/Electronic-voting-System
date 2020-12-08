package com.cg.votingapp.dto;

public class CandidateCastVote {
	
	private int candidate_id;
	private String candidate_name;
	private String address;
	private int age;
	private int contact_no;
	private int vote_count;
	private String party_name;
	public CandidateCastVote() {
		super();
	}
	public CandidateCastVote(int candidate_id, String candidate_name, String address, int age, int contact_no, int vote_count,
			String party_name) {
		super();
		this.candidate_id = candidate_id;
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_no = contact_no;
		this.vote_count = vote_count;
		this.party_name = party_name;
	}
	public CandidateCastVote(String candidate_name, String address, int age, int contact_no, int vote_count,
			String party_name) {
		super();
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_no = contact_no;
		this.vote_count = vote_count;
		this.party_name = party_name;
	}
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
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public int getVote_count() {
		return vote_count;
	}
	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	@Override
	public String toString() {
		return "Candidate [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", address=" + address
				+ ", age=" + age + ", contact_no=" + contact_no + ", vote_count=" + vote_count + ", party_name="
				+ party_name + "]";
	}
	
	
}
