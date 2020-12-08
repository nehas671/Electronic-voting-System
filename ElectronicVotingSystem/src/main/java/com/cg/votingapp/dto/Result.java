package com.cg.votingapp.dto;

import java.util.Date;

public class Result {

	
	private int result_id;
	private String election_id;
	private String state;
	private Date date;
	private int candidate_id;
	private String candidate_name;
	private String party_name;
	private int votes;
	public Result() {
		super();
	}
	public Result(int result_id, String election_id, String state, Date date, int candidate_id, String candidate_name,
			String party_name, int votes) {
		super();
		this.result_id = result_id;
		this.election_id = election_id;
		this.state = state;
		this.date = date;
		this.candidate_id = candidate_id;
		this.candidate_name = candidate_name;
		this.party_name = party_name;
		this.votes = votes;
	}
	public Result(String election_id, String state, Date date, int candidate_id, String candidate_name,
			String party_name, int votes) {
		super();
		this.election_id = election_id;
		this.state = state;
		this.date = date;
		this.candidate_id = candidate_id;
		this.candidate_name = candidate_name;
		this.party_name = party_name;
		this.votes = votes;
	}
	public int getResult_id() {
		return result_id;
	}
	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}
	public String getElection_id() {
		return election_id;
	}
	public void setElection_id(String election_id) {
		this.election_id = election_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "Result [result_id=" + result_id + ", election_id=" + election_id + ", state=" + state + ", date=" + date
				+ ", candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", party_name=" + party_name
				+ ", votes=" + votes + "]";
	}
	
	
	
	
	
	
	
}
