package com.cg.votingapp.service;

import java.util.List;

import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.ScheduleEntity;

public interface ScheduleService {

	void addSchedule(ElectionEntity entity);

	 void viewSchedule();
	
}
