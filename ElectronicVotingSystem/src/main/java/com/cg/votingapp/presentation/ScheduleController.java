package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

<<<<<<< HEAD
import com.cg.votingapp.dto.Schedule;
=======
>>>>>>> branch 'master' of https://github.com/nehas671/Electronic-voting-System
import com.cg.votingapp.entity.ElectionEntity;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/nehas671/Electronic-voting-System
import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;
import com.cg.votingapp.service.ScheduleService;
import com.cg.votingapp.service.ScheduleServiceImpl;

public class ScheduleController {
	private static Logger logger = LogManager.getLogger(ScheduleController.class.getName());
	ScheduleService scheduleService = new ScheduleServiceImpl();
	
	public void addSchedule()  throws ScheduleNotFound {
		//logger.info("Inserting schedule for id: " + entity.getElection_id());

		try {
			scheduleService.addSchedule();
		}
		catch(Exception e) {
			logger.error("ScheduleNotFoundException: " + e);
			throw new ScheduleNotFound(e.getMessage());
		}
		

	}
	public void viewSchedule() throws ScheduleNotFound{
		logger.info(" viewing schedule of lection:   ");
		try {
		scheduleService.viewSchedule();
		}
		catch(Exception e) {
			logger.error("ScheduleNotFoundException: " + e);
			throw new ScheduleNotFound(e.getMessage());
		}
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
