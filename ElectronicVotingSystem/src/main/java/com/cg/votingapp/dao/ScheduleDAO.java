package com.cg.votingapp.dao;


import java.util.List;

import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;

public interface ScheduleDAO {
	public boolean addSchedule();
	public boolean viewSchedule();
	public ScheduleEntity viewScheduleById(int election_id) throws ScheduleNotFound;
	//public ScheduleEntity viewScheduleByState(String state) throws ScheduleNotFound;
}
