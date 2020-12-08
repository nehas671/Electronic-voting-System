package com.cg.VotingApp.entity;



import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register_user")
public class ElectionEntity {
	

	@Id
	@GeneratedValue
        @Column(name="application_id")
	private int application_id; 

	@Column(name="name")
	private String name;

	@Column(name="dob")
	private int dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="mobile_number")
	private int mobile_number;
	
	@Column(name="address")
	private String address;

	@Column(name="district")
	private String district;
	
	
	
	public ElectionEntity() {
		super();
	}

	public ElectionEntity(String name, int dob, String gender, int mobile_number, String address, String district) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.mobile_number = mobile_number;
		this.address = address;
                this.district = district;
	}

	public ElectionEntity(String election_name, String state, String constituency, Date date) {
		super();
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	@Override
	public String toString() {
		return "ElectionEntity [election_id=" + election_id + ", election_name=" + election_name + ", state=" + state
				+ ", constituency=" + constituency + ", date=" + date + "]";
	}
	
	
	
	
}

