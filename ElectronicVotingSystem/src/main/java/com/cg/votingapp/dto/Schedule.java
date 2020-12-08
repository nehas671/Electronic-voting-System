package com.cg.votingapp.dto;


public class Schedule {
	private int schedule_id;
	private String date;
	private int election_id;
	private String election_name;
	private String state;
	private String constituency;


	public Schedule() {
		super();
	}

	public Schedule(int schedule_id, String date, int election_id, String election_name, String state,String constituency) {
		super();
		this.schedule_id = schedule_id;
		this.date = date;
		this.election_id = election_id;
		this.election_name = election_name;
		this.state = state;
		this.constituency = constituency;
	}

	public Schedule(String date, int election_id, String election_name, String state, String constituency) {
		super();
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
