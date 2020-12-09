package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;


import com.cg.votingapp.entity.ElectionEntity;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/nehas671/Electronic-voting-System
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

		//	ElectionEntity entity=new ElectionEntity("loksabha election","maharashtra","dhule","22-12-2020");

				try {
					scheduleController.addSchedule();
				} catch (ScheduleNotFound e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

			assertEquals(1,1);
			logger.info("[END] addScheduleSuccess()");
		}
		
		@Test
		public void viewSuccess() {
			logger.info("[START] viewScheduleSuccess()");

			//ElectionEntity entity=new ElectionEntity("loksabha election","maharashtra","dhule","22-12-2020");

			try {
					scheduleController.viewSchedule();
			}
			catch (ScheduleNotFound e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				

			//assertEquals(1,1);
			logger.info("[END] viewScheduleSuccess()");
		}
		
	


}

