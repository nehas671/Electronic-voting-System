package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;


import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ResultNotFoundException;
import com.cg.votingapp.exceptions.ScheduleNotFound;

public class ScheduleControllerTest {
	private static ScheduleController scheduleController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ScheduleControllerTest.class.getName());
		scheduleController = new ScheduleController();
	}
		@Test
		public void addSuccess() throws ScheduleNotFound {
			logger.info("[START] addScheduleSuccess()");
			assertEquals(true,scheduleController.addSchedule());
			logger.info("[END] addScheduleSuccess()");
		}
		
		@Test
		public void viewSuccess() throws ScheduleNotFound {
			logger.info("[START] viewScheduleSuccess()");
			assertEquals(true,scheduleController.viewSchedule());
			logger.info("[END] viewScheduleSuccess()");
		}
		
		@Test
		public void viewIdSuccess() throws ScheduleNotFound {
			logger.info("[START] viewIdScheduleSuccess()");
					scheduleController.viewScheduleById(102);
				
			logger.info("[END] viewIdScheduleSuccess()");
		}
		
		@Test(expected=ScheduleNotFound.class)   				
		public void viewIdFailure() throws ScheduleNotFound
		{
			logger.info("[Start] testDeclareResultIdSearchFailure()");
			scheduleController.viewScheduleById(-10);
			logger.info("[END] estDeclareResultIdSearchFailure()");	
		}
		
		
		
		
		
		
	/*	@Test
		public void viewStateSuccess() throws ScheduleNotFound{
			logger.info("[START] viewStateScheduleSuccess()");
			scheduleController.viewScheduleByState("maharashtra");
			logger.info("[END] viewStateScheduleSuccess()");
		}*/

		
	


}

