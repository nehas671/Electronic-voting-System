package com.cg.votingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.logging.log4j.Logger;

@Entity
@Table(name="voter_request")
public class VoterRequestEntity {

	@Id
	@Column(name="userId")
	private int userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="district")
	private String district;
	
	@Column(name="constituency")
	private String constituency;
	
	@Column(name="voter_id")
	private String voterId;
	
	@Column(name="contact_no")
	private int contactNumber;
	
	@Column(name="application_status")
	private String applicationStatus;

	
	
	private static Logger logger;
	
	
				//  Constructors
	
	
	public VoterRequestEntity() {
		super();
	}


	public VoterRequestEntity(int userId, String name, String district, String constituency, String voterId,
		int contactNumber, String applicationStatus) {
		super();
		this.userId = userId;
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.voterId = voterId;
		this.contactNumber = contactNumber;
		this.applicationStatus = applicationStatus;
	}


	public VoterRequestEntity(String name, String district, String constituency, String voterId, int contactNumber,
			String applicationStatus) {
		super();
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.voterId = voterId;
		this.contactNumber = contactNumber;
		this.applicationStatus = applicationStatus;
	}

	
	
			// Getters and Setters
	
	

	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getConstituency() {
		return constituency;
	}


	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}


	public String getVoterId() {
		return voterId;
	}


	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}


	public int getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getApplicationStatus() {
		return applicationStatus;
	}


	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	
			//toString function
	

	@Override
	public String toString() {
		return "VoterRequest [name=" + name + ", district=" + district + ", constituency=" + constituency + ", voterId="
				+ voterId + ", applicationStatus=" + applicationStatus + "]";
	}
	
	
	
	
	
	
	
			
	
	


}
