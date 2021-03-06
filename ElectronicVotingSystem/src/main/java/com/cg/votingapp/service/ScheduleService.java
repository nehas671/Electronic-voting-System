package com.cg.votingapp.service;



import java.util.List;


import com.cg.votingapp.dto.Schedule;

import com.cg.votingapp.entity.ElectionEntity;


import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;


public interface ScheduleService {

	boolean addSchedule();

	 boolean viewSchedule();
	Schedule viewScheduleById(int election_id) throws ScheduleNotFound;
	// Schedule viewScheduleByState(String state) throws ScheduleNotFound;
	
}
