package com.cg.votingapp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voter_request")
public class VoterIdEntity {
	@GeneratedValue
	@Column(name="request_id")
	private int request_id;

	@Column(name="name")
	private String name;
	
	@Column(name="district")
	private String district;
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="constituency")
	private String constituency;
	
	@Column(name="voter_id")
	private String voter_id;
	
	@Column(name="contact_no")
	private double contact_no;
	
	@Column(name="application_status")
	private String application_status;
	
	public VoterIdEntity() {
		
	}
	public VoterIdEntity(int request_id,String name,String district,int user_id,String constituency,String voter_id,double contact_no,String application_status) {
		super();
		this.request_id=request_id;
		this.name=name;
		this.district=district;
		this.user_id=user_id;
		this.constituency=constituency;
		this.voter_id=voter_id;
		this.contact_no=contact_no;
		this.application_status=application_status;
	}
	
	public VoterIdEntity(int userId,String constituency,String voter_id) {
		
	}
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUserId(int user_id) {
		this.user_id = user_id;
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
	@Override
	public String toString() {
		return "VoterIdEntity [userId=" + user_id + ", constituency=" + constituency + ", voter_id=" + voter_id + "]";
	}
	
}
