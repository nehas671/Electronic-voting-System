package com.cg.VotingApp.entity;


import java.sql.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.service.ElectionServiceImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;





@Entity
@Table(name="election")
public class ElectionEntity {
	
	@Id
	@GeneratedValue
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
	
	
	
	
	
	

	/*@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "election_party", 
				joinColumns = { @JoinColumn(name = "election_id") }, 
				inverseJoinColumns = { @JoinColumn(name = "party_Name") })
	private Set<Party> parties = new HashSet<Party>();*/

	
	private static Logger logger;
	

	
	
	public ElectionEntity() {
		super();
	}

	public ElectionEntity(int election_id, String election_name, String state, String constituency, String date) {
		super();
		

		this.election_id = election_id;
		this.election_name = election_name;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
		
	}

	public ElectionEntity(String election_name, String state, String constituency, String date) {
		super();
		
		logger = LogManager.getLogger(ElectionServiceImpl.class.getName());
		logger.info("addddiggg");
		this.election_name = election_name;
		this.state = state;
		this.constituency = constituency;
		this.date = date;
	}

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
		return "ElectionEntity [election_id=" + election_id + ", election_name=" + election_name + ", state=" + state
				+ ", constituency=" + constituency + ", date=" + date + "]";
	}
	
	
	
	
}

