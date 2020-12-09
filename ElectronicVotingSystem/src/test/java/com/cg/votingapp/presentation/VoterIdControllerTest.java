package com.cg.votingapp.presentation;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.ReqNotFoundException;
import com.cg.votingapp.exceptions.UserNotFoundException;
import com.cg.votingapp.presentation.VoterIdController;
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
	@Test
	public void testvoterIdbyreqidSearchSuccess()throws ReqNotFoundException{
		logger.info("[START] testvoterIdbyreqidSearchSuccess()");
		assertNotNull("Voter id Found", voterIdController.findByreqId(1));
		logger.info("[END] testvoterIdbyreqidSearchSuccess()");
	}
	
	
	@Test(expected = UserNotFoundException.class)
	public void testvoterIdSearchFailed() throws UserNotFoundException {
		logger.info("[START] testvoterIdSearchFailed()");
		voterIdController.findByUserId(-5);
		logger.info("[END] testvoterIdSearchFailed()");
	}
	@Test(expected = ReqNotFoundException.class)
	public void testvoterIdbyreqidSearchFailed() throws ReqNotFoundException{
		logger.info("[START] testvoterIdbyreqidSearchFailed()");
		assertNotNull(voterIdController.findByreqId(-2));
		logger.info("[END] testvoterIdbyreqidSearchFailed()");
		
	}	
}
