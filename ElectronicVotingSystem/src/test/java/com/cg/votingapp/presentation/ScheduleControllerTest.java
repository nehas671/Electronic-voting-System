package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;


import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.entity.ScheduleEntity;
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
			scheduleController.viewSchedule();
			assertEquals(true,scheduleController.viewSchedule());
			logger.info("[END] viewScheduleSuccess()");
		}
		
	/*	@Test
		public void viewIdSuccess() {
			logger.info("[START] viewIdScheduleSuccess()");

			//ElectionEntity entity=new ElectionEntity("loksabha election","maharashtra","dhule","22-12-2020");

			try {
					assertNotNull(scheduleController.viewScheduleById(102));
			}
			catch (ScheduleNotFound e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				

			//assertEquals(1,1);
			logger.info("[END] viewIdScheduleSuccess()");
		}*/

		
	


}

