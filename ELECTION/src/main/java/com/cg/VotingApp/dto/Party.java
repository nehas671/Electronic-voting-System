package com.cg.VotingApp.dto;



public class Party {
	private String party_name;
	private String leader;
	private String symbol;
	//private Candidate candidate;
	
	/*
	 * Constructor for class CandidateEntity
	 */
	
	public Party() {}

	

	public Party(String party_name, String leader, String symbol) {
		super();
		this.party_name = party_name;
		this.leader = leader;
		this.symbol = symbol;
		
	}
	
	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/*public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}*/
	

	@Override
	public String toString() {
		return "PartyEntity [party_name=" + party_name + ", leader=" + leader + ", symbol=" + symbol + "]";
	}
}
