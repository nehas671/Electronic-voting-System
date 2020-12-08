package com.cg.votingapp.service;

import com.cg.votingapp.entity.ElectionEntity;

public interface ScheduleService {

	void addSchedule(ElectionEntity entity);

	 void viewSchedule();
	
}
