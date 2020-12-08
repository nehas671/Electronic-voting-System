package com.cg.votingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.service.ScheduleServiceImpl;

@Entity
@Table(name="schedule")
public class ScheduleEntity {
	@Id
	@GeneratedValue
@Column(name="schedule_id")
private int schedule_id;

@Column(name="date")
private String date;

@Column(name="election_id")
private int election_id;

@Column(name="election_name")
private String election_name;

@Column(name="state")
private String state;

@Column(name="constituency")
private String constituency;

private static Logger logger;
public ScheduleEntity() {
	super();
}

public ScheduleEntity(int schedule_id, String date, int election_id, String election_name, String state,
		String constituency) {
	super();
	
	this.schedule_id = schedule_id;
	this.date = date;
	this.election_id = election_id;
	this.election_name = election_name;
	this.state = state;
	this.constituency = constituency;
}

public ScheduleEntity(String date, int election_id, String election_name, String state, String constituency) {
	super();
	logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
	logger.info("adding data into schedule");
	this.date = date;
	this.election_id = election_id;
	this.election_name = election_name;
	this.state = state;
	this.constituency = constituency;
}

public int getSchedule_id() {
	return schedule_id;
}

public void setSchedule_id(int schedule_id) {
	this.schedule_id = schedule_id;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
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

@Override
public String toString() {
	return "ScheduleEntity [schedule_id=" + schedule_id + ", date=" + date + ", election_id=" + election_id
			+ ", election_name=" + election_name + ", state=" + state + ", constituency=" + constituency + "]";
}


}
