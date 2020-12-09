package com.cg.votingapp.service;

import java.util.List;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.ScheduleDAO;
import com.cg.votingapp.dao.ScheduleDAOImpl;

import com.cg.votingapp.dto.Schedule;

import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;
import com.cg.votingapp.utils.ScheduleUtils;

public class ScheduleServiceImpl implements ScheduleService {
	private static Logger logger;

	ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
	public boolean addSchedule() {
		boolean s=false;
		logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
		logger.info("adding data into Schedule");

		s=scheduleDAO.addSchedule();
		return s;
		
	}
	public boolean viewSchedule() {
		boolean s=false;
		logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
		logger.info("viewing data from Schedule");
		s=scheduleDAO.viewSchedule();
		return s;
	}

	/*public Schedule viewScheduleById(int election_id) throws ScheduleNotFound {
		// TODO Auto-generated method stub
	
		logger = LogManager.getLogger(ScheduleServiceImpl.class.getName());
		ScheduleEntity scheduleEntity=scheduleDAO.viewScheduleById(election_id);
		logger.info("view Schedule by id:  "+scheduleEntity);

		
		return ScheduleUtils.convertScheduleEntityIntoSchedule(scheduleEntity);
	}*/

}
