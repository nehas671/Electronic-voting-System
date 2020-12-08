package com.cg.votingapp.entity;
import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="result")

public class ResultEntity {

	@Id
	@GeneratedValue
	@Column(name="result_id")
	private int result_id;

	@Column(name="election_id")
	private String election_id;
	
	@Column(name="state")
	private String state;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="candidate_id")
	private int candidate_id;
	

	@Column(name="candidate_name")
	private String candidate_name;
	
	@Column(name="party_name")
	private String party_name;
	
	@Column(name="votes")
	private int votes;

	public ResultEntity() {
		super();
	}

	public ResultEntity(String election_id, String state, Date date, int candidate_id, String candidate_name,
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

	public ResultEntity(int result_id, String election_id, String state, Date date, int candidate_id,
			String candidate_name, String party_name, int votes) {
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
		return "ResultEntity [result_id=" + result_id + ", election_id=" + election_id + ", state=" + state + ", date="
				+ date + ", candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", party_name="
				+ party_name + ", votes=" + votes + "]";
	}
	
	
	
}
