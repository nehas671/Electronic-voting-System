package com.cg.votingapp.dto;

import javax.persistence.Column;

public class VoterRequest {
	
	private int userId;
	private String name;
	private String district;
	private String constituency;
	private String voterId;
	private int contactNumber;
	private String applicationStatus;
	
	public VoterRequest() {
		super();
	}

	public VoterRequest(int userId, String name, String district, String constituency, String voterId,
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

	public VoterRequest(String name, String district, String constituency, String voterId, int contactNumber,
			String applicationStatus) {
		super();
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.voterId = voterId;
		this.contactNumber = contactNumber;
		this.applicationStatus = applicationStatus;
	}

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

	@Override
	public String toString() {
		return "VoterRequest [name=" + name + ", district=" + district + ", constituency=" + constituency + ", voterId="
				+ voterId + ", applicationStatus=" + applicationStatus + "]";
	}

	
	
}
