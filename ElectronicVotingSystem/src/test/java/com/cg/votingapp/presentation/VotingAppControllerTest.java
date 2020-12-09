package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.CandidateNotFoundException;

public class VotingAppControllerTest
{	
	private static  VotingAppController votingAppController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp()
	{
		logger = LogManager.getLogger(VotingAppControllerTest.class.getName());
		votingAppController = new VotingAppController();
	}
	
	@Test
	public void testCastVoteSuccess() throws CandidateNotFoundException
	{	
		logger.info("[START] testCastVoteSuccess()");
		assertEquals(true,votingAppController.castVote(12));
		logger.info("[END] testCastVoteSuccess()");
	}
	
	@Test(expected=CandidateNotFoundException.class)
	public void testCastVoteFailure() throws CandidateNotFoundException
	{
		logger.info("[START] testCastVoteFailure()");
		votingAppController.castVote(11);
		logger.info("[END] testCastVoteFailure()");
	}
}