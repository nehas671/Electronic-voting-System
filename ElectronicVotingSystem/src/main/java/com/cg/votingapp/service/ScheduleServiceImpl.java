package com.cg.votingapp.service;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.ScheduleDAO;
import com.cg.votingapp.dao.ScheduleDAOImpl;
import com.cg.votingapp.entity.ScheduleEntity;

public class ScheduleServiceImpl implements ScheduleService {
	private static Logger logger;

	ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
	public void addSchedule(ScheduleEntity entity) {
		logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
		logger.info("adding data into Schedule");

		scheduleDAO.addSchedule(entity);
		
	}

}
