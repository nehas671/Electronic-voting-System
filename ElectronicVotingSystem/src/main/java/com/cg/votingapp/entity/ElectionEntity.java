package com.cg.votingapp.entity;



import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.service.ElectionServiceImpl;

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
public class ElectionEntity {
	
	@Id
	@Column(name="election_id")
	private int election_id;

	@Column(name="election_name")
	private String election_name;
	
	@Column(name="state")
	private String state;
	
	@Column(name="constituency")
	private String constituency;
	
	



	@Column(name="date")
	private String date;
	
	
	/*---Election to party many to many---*/
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="election_party", joinColumns = { @JoinColumn(name = "election_id") }, 
				inverseJoinColumns = { @JoinColumn(name = "party_name") })
	private Set<PartysEntity> party=new HashSet<PartysEntity>();


	
	
	public ElectionEntity() {
		super();
	}
	


	public ElectionEntity(int election_id, String election_name, String state, String constituency, String date,Set<PartysEntity> parties) {
		super();
	
		this.election_id = election_id;
		this.election_name = election_name;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
		this.party = parties;
		
	}

	public ElectionEntity(int election_id, String election_name, String state, String constituency, String date) {
		super();
	
		this.election_id = election_id;
		this.election_name = election_name;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
		
	}

	
	

	
	/*
	 * Getter and Setter
	 * */

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
	
	public Set<PartysEntity> getParty() {
		return party;
	}

	public void setParty(Set<PartysEntity> party) {
		this.party = party;
	}

	
	
	@Override
	public String toString() {
		return "ElectionEntity [election_id=" + election_id + ", election_name=" + election_name + ", state=" + state
				+ ", constituency=" + constituency + ", date=" + date + "]";
	}
	
	
	
	
}