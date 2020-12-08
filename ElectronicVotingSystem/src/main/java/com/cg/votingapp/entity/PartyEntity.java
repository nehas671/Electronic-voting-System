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


@Entity
@Table(name="party")
public class PartyEntity {
	@Id
	@Column(name="party_name")
	private String party_name;
	
	@Column(name="leader")
	private String leader;
	
	@Column(name="symbol")
	private String symbol;
	
	/*
	 * Creating one to many relation with party
	 */
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER, mappedBy="party")
	private Set<CandidateEntity> candidate;
	
	/*
	 * Constructor for class CandidateEntity
	 */
	
	public PartyEntity() {}

	public PartyEntity(String party_name, String leader, String symbol) {
		super();
		this.party_name = party_name;
		this.leader = leader;
		this.symbol = symbol;
	}

	public PartyEntity(String party_name, String leader, String symbol, Set<CandidateEntity> candidate) {
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

	public Set<CandidateEntity> getCandidate() {
		return candidate;
	}

	public void setEntity(Set<CandidateEntity> candidate) {
		this.candidate = candidate;
	}
	

	@Override
	public String toString() {
		return "PartyEntity [party_name=" + party_name + ", leader=" + leader + ", symbol=" + symbol + "]";
	}
}
