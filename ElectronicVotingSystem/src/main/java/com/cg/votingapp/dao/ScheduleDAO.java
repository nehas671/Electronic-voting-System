package com.cg.votingapp.dao;


import java.util.List;

import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;

public interface ScheduleDAO {
	public void addSchedule();
	public void viewSchedule();
//	public ScheduleEntity viewScheduleById(int election_id) throws ScheduleNotFound;
}
