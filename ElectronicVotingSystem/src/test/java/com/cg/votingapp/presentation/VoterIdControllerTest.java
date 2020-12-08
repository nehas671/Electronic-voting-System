package com.cg.votingapp.presentation;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.UserNotFoundException;
//import com.cg.VotingApp.presentation.VoterIdController;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class VoterIdControllerTest {
	private static  VoterIdController voterIdController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(VoterIdControllerTest.class.getName());
		voterIdController = new VoterIdController();
	}
	
	@Test
	public void testvoterIdSearchSuccess() throws UserNotFoundException {
		logger.info("[START] testvoterIdSearchSuccess()");
		assertNotNull("Voter id Found", voterIdController.findByUserId(1));
		logger.info("[END] testvoterIdSearchSuccess()");
	}
	
	@Test(expected = UserNotFoundException.class)
	public void testvoterIdSearchFailed() throws UserNotFoundException {
		logger.info("[START] testvoterIdSearchFailed()");
		voterIdController.findByUserId(-5);
		logger.info("[END] testvoterIdSearchFailed()");
	}
}
