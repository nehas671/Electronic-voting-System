package com.cg.votingapp.service;

import java.util.List;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.ScheduleDAO;
import com.cg.votingapp.dao.ScheduleDAOImpl;
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
import com.cg.votingapp.utils.ScheduleUtils;

public class ScheduleServiceImpl implements ScheduleService {
	private static Logger logger;

	ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
	public void addSchedule() {
		logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
		logger.info("adding data into Schedule");

		scheduleDAO.addSchedule();
		
	}
<<<<<<< HEAD
	
=======
>>>>>>> branch 'master' of https://github.com/nehas671/Electronic-voting-System
	public void viewSchedule() {
		logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
		logger.info("viewing data from Schedule");
		scheduleDAO.viewSchedule();
		
	}

	/*public Schedule viewScheduleById(int election_id) throws ScheduleNotFound {
		// TODO Auto-generated method stub
	
		logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
		ScheduleEntity scheduleEntity=scheduleDAO.viewScheduleById(election_id);
		logger.info("view Schedule by id:  "+scheduleEntity);

		
		return ScheduleUtils.convertScheduleEntityIntoSchedule(scheduleEntity);
	}*/

}
