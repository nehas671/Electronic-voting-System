package com.cg.votingapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "election_party")

public class ElectionPartyEntity {

@Id
@Column(name = "election_id")
private String election_id;

@Column(name="party_name")
private String party_name;



public ElectionPartyEntity() {
	super();
}



public ElectionPartyEntity(String election_id, String party_name) {
	super();
	this.election_id = election_id;
	this.party_name = party_name;
}



public String getElection_id() {
	return election_id;
}



public void setElection_id(String election_id) {
	this.election_id = election_id;
}



public String getParty_name() {
	return party_name;
}



public void setParty_name(String party_name) {
	this.party_name = party_name;
}



@Override
public String toString() {
	return "ElectionPartyEntity [election_id=" + election_id + ", party_name=" + party_name + "]";
}




	
}
