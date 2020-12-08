package com.cg.votingapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="candidate")
public class CandidateEntity {
	
	@Id
	@GeneratedValue
	@Column(name="candidate_id")
	private int candidate_id;

	@Column(name="candidate_name")
	private String candidate_name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private int age;
	
	@Column(name="contact_number")
	private int contact_details;
	
	@Column(name="count")
	private int count;
	
	/*
	 * Creating many to one relation with party
	 */
	
	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinColumn(name="party_name")
	private PartyEntity party;
	
	/*
	 * Constructor for class CandidateEntity
	 */
	
	public CandidateEntity() {}
	
	public CandidateEntity(String candidate_name, String address, int age, int contact_details, int count) {
		super();
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_details = contact_details;
		this.count=count;
	}
	
	public CandidateEntity(String candidate_name, String address, int age, int contact_details, int count, PartyEntity party) {
		super();
		this.candidate_name = candidate_name;
		this.address = address;
		this.age = age;
		this.contact_details = contact_details;
		this.count=count;
		this.party = party;
	}

	/*
	 *Getters and Setters for the above variables
	 */
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getContact_details() {
		return contact_details;
	}

	public void setContact_details(int contact_details) {
		this.contact_details = contact_details;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public PartyEntity getParty() {
		return party;
	}

	public void setParty(PartyEntity party) {
		this.party = party;
	}
	
	/*
	 * ToString method for the above variables
	 */

	@Override
	public String toString() {
		return "CandidateEntity [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", address="
				+ address + ", age=" + age + ", contact_details=" + contact_details + ", party=" + party + ", count=" + count + "]";
	}
	
}
