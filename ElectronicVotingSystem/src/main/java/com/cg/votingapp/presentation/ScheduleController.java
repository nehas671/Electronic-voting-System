package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


import com.cg.votingapp.dto.Schedule;


import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;
import com.cg.votingapp.service.ScheduleService;
import com.cg.votingapp.service.ScheduleServiceImpl;

public class ScheduleController {
	private static Logger logger = LogManager.getLogger(ScheduleController.class.getName());
	ScheduleService scheduleService = new ScheduleServiceImpl();
	
	public boolean addSchedule()  throws ScheduleNotFound {
		//logger.info("Inserting schedule for id: " + entity.getElection_id());
		boolean s=false;
		try {
			s=scheduleService.addSchedule();
		}
		catch(Exception e) {
			logger.error("ScheduleNotFoundException: " + e);
			throw new ScheduleNotFound(e.getMessage());
		}
		return s;

	}
	public boolean viewSchedule() throws ScheduleNotFound{
		logger.info(" viewing schedule of lection:   ");
		boolean s=false;
		try {
		s=scheduleService.viewSchedule();
		}
		catch(Exception e) {
			logger.error("ScheduleNotFoundException: " + e);
			throw new ScheduleNotFound(e.getMessage());
		}
		return s;
		}
	/*public Schedule viewScheduleById(int election_id) throws ScheduleNotFound{
	
		logger.info("Finding schedule for id: " + election_id);
		Schedule schedule=null;
		try {
			schedule=scheduleService.viewScheduleById(election_id);
		}
		catch(Exception e) {
			logger.error("ScheduleNotFoundException: " + e);
			throw new ScheduleNotFound(e.getMessage());
		}
		return schedule;
	}*/
	
}
