package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.entity.ScheduleEntity;
import com.cg.VotingApp.exception.ScheduleNotFound;
import com.cg.VotingApp.service.ScheduleService;
import com.cg.VotingApp.service.ScheduleServiceImpl;

public class ScheduleController {
	private static Logger logger = LogManager.getLogger(ScheduleController.class.getName());
	ScheduleService electionService = new ScheduleServiceImpl();
	
	public void addElection(ScheduleEntity entity ) throws ScheduleNotFound {
		logger.info("Inserting schedule for id: " + entity.getSchedule_id());

		try {
			electionService.addSchedule(entity);
		}
		catch(Exception e) {
			logger.error("ScheduleNotFoundException: " + e);
			throw new ScheduleNotFound(e.getMessage());
		}

	}
}