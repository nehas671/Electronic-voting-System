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
	public void testCastVoteCandidateIdSearchSuccess() throws CandidateNotFoundException
	{	
		logger.info("[START] testCastVoteCandidateIdSearchSuccess()");
		assertEquals(true,votingAppController.castVote(12));
		logger.info("[END] testCastVoteCandidateIdSearchSuccess()");
	}
	
	@Test(expected=CandidateNotFoundException.class)
	public void testCastVoteCandidateIdSearchFailure() throws CandidateNotFoundException
	{
		logger.info("[START] testCastVoteCandidateIdSearchFailure()");
		votingAppController.castVote(11);
		logger.info("[END] testCastVoteCandidateIdSearchFailure()");
	}
}