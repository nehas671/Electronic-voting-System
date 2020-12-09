package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.ReqNotFoundException;
import com.cg.votingapp.exceptions.UserNotFoundException;

public class VoterRequestControllerTest {
	private static  VoterRequestController voterRequestController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(VoterRequestControllerTest.class.getName());
		voterRequestController = new VoterRequestController();
	}
	@Test
	public void CheckByConstituency() throws RecordNotFoundException 
	{	
		logger.info("[START] CheckByConstituency()");
		assertEquals(true,voterRequestController.viewVoterRequest("bel"));
		logger.info("[END] testCastVoteSuccess()");
	}

}
