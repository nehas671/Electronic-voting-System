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
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="district")
	private String district;
	
	@Column(name="constituency")
	private String constituency;
	
	@Column(name="voter_id")
	private String voterId;
	
	@Column(name="contact_no")
	private double contact_no;
	
	@Column(name="application_status")
	private String application_status;
	
	@Column(name="age")
	private int age;
	
	
	private static Logger logger;
	
	
				//  Constructors
	
	
	public VoterRequestEntity() {
		super();
	}


	public VoterRequestEntity(int user_id, String name, String district, String constituency, String voterId,
		double contact_no, String application_status,int age) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.voterId = voterId;
		this.contact_no = contact_no;
		this.application_status = application_status;
		this.age = age;
	}


	public VoterRequestEntity(String name, String district, String constituency, String voterId, double contact_no,
			String application_status,int age) {
		super();
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.voterId = voterId;
		this.contact_no = contact_no;
		this.application_status = application_status;
		this.age = age;
	}

	
	
			// Getters and Setters
	
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


	public String getVoterId() {
		return voterId;
	}


	public void setVoterId(String voterId) {
		this.voterId = voterId;
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
	

	

	
			//toString function
	

	
	@Override
	public String toString() {
		return "VoterRequestEntity [user_id=" + user_id + ", name=" + name + ", district=" + district
				+ ", constituency=" + constituency + ", voterId=" + voterId + ", contact_no=" + contact_no
				+ ", application_status=" + application_status + ", age=" + age + "]";
	}


	
	
		
}
