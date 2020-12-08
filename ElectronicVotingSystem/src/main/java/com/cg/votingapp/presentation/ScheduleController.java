package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;
import com.cg.votingapp.service.ScheduleService;
import com.cg.votingapp.service.ScheduleServiceImpl;

public class ScheduleController {
	private static Logger logger = LogManager.getLogger(ScheduleController.class.getName());
	ScheduleService electionService = new ScheduleServiceImpl();
	
	public void addSchedule(ElectionEntity entity ) throws ScheduleNotFound {
		logger.info("Inserting schedule for id: " + entity.getElection_id());

		try {
			electionService.addSchedule(entity);
		}
		catch(Exception e) {
			logger.error("ScheduleNotFoundException: " + e);
			throw new ScheduleNotFound(e.getMessage());
		}
		

	}
	public void viewSchedule() {
		electionService.viewSchedule();
		}
}
