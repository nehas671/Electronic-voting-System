package com.cg.votingapp.dto;


public class Election {
	
	private int election_id;
	private String election_name;
	private String state;
	private String constituency;
	private String date;
	
	
	
	/*
	 * Constructors for Election
	  */
	
	public Election() {
		super();
	}
	
	
	public Election(int election_id, String election_name, String state, String constituency, String date) {
		super();
		this.election_id = election_id;
		this.election_name = election_name;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
	}
	
	public Election( String election_name, String state, String constituency, String date) {
		super();
		
		this.election_name = election_name;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
	}
	
	
	/*
	 * Getter and Setter
	 * 
	 */	
	
	
	public int getElection_id() {
		return election_id;
	}
	public void setElection_id(int election_id) {
		this.election_id = election_id;
	}
	public String getElection_name() {
		return election_name;
	}
	public void setElection_name(String election_name) {
		this.election_name = election_name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Election [election_id=" + election_id + ", election_name=" + election_name + ", state=" + state
				+ ", constituency=" + constituency + ", date=" + date + "]";
	}
	
	
	

}