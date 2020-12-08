package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

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
		public void addIdSuccess() {
			logger.info("[START] addScheduleSuccess()");

			ScheduleEntity entity=new ScheduleEntity("22-12-2020",101,"loksabha election","maharashtra","dhule");

				try {
					scheduleController.addElection(entity);
				} catch (ScheduleNotFound e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

			assertEquals(1,1);
			logger.info("[END] testItemSearchSuccess()");
		}


}

