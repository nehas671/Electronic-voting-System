package com.cg.votingapp.dto;

import javax.persistence.Column;

public class VoterRequest {
	
	private int user_id;
	private String name;
	private String district;
	private String constituency;
	private String voter_id;
	private double contact_no;
	private String application_status;
	private int age;
	
	public VoterRequest() {
		super();
	}

	public VoterRequest(int user_id, String name, String district, String constituency, String voter_id,
			double contact_no, String application_status,int age) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.voter_id = voter_id;
		this.contact_no = contact_no;
		this.application_status = application_status;
		this.age = age;
	}

	public VoterRequest(String name, String district, String constituency, String voterId, double contactNumber,
			String applicationStatus,int age) {
		super();
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.voter_id = voter_id;
		this.contact_no = contact_no;
		this.application_status = application_status;
		this.age = age;

	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public String getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(String voter_id) {
		this.voter_id = voter_id;
	}

	public double getContact_no() {
		return contact_no;
	}

	public void setContact_no(double contact_no) {
		this.contact_no = contact_no;
	}

	public String getApplication_status() {
		return application_status;
	}

	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "VoterRequest [user_id=" + user_id + ", name=" + name + ", district=" + district + ", constituency="
				+ constituency + ", voter_id=" + voter_id + ", contact_no=" + contact_no + ", application_status="
				+ application_status + ", age=" + age + "]";
	}

	

	
	
	
}
