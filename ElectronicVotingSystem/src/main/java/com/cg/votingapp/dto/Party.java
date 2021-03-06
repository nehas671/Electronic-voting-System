package com.cg.votingapp.dto;

import java.util.Set;

public class Party {
	private String party_name;
	private String leader;
	private String symbol;
	private Set<Candidate> candidate;
	
	/*
	 * Constructor for class Party Entity
	 */
	
	public Party() {}

	public Party(String party_name, String leader, String symbol) {
		super();
		this.party_name = party_name;
		this.leader = leader;
		this.symbol = symbol;
	}

	public Party(String party_name, String leader, String symbol, Set<Candidate> candidate) {
		super();
		this.party_name = party_name;
		this.leader = leader;
		this.symbol = symbol;
		this.candidate = candidate;
	}
	
	/*
	 *Getters and Setters for the above variables
	 */

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

	public Set<Candidate> getCandidate() {
		return candidate;
	}

	public void setCandidate(Set<Candidate> candidate) {
		this.candidate = candidate;
	}
	/*
	 * To string method for above variables
	 */

	@Override
	public String toString() {
		return "PartyEntity [party_name=" + party_name + ", leader=" + leader + ", symbol=" + symbol + "]";
	}
}

