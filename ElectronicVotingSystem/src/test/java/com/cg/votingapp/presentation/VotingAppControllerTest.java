package com.cg.votingapp.presentation;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.exceptions.InvalidInputException;

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
	
	//Test case to check negative electionID input
	@Test(expected=InvalidInputException.class)
	public void testNegativeElectionIDInput() throws InvalidInputException, CandidateNotFoundException, ElectionNotFoundException
	{
		logger.info("[START] testNegativeElectionIDInput()");
		votingAppController.castVote(-5, 10);
		logger.info("[END] testNegativeElectionIDInput()");
	}
	
	//Test case to check negative candidateID input
	@Test(expected=InvalidInputException.class)
	public void testNegativeCandidateIDInput() throws InvalidInputException, CandidateNotFoundException, ElectionNotFoundException
	{
		logger.info("[START] testNegativeCandidateIDInput()");
		votingAppController.castVote(10, -10);
		logger.info("[END] testNegativeCandidateIDInput()");
	}
	
	//Test case to check if election with electionID exists
	@Test(expected=ElectionNotFoundException.class)
	public void testElectionNotExists() throws InvalidInputException, CandidateNotFoundException, ElectionNotFoundException
	{
		logger.info("[START] testElectionNotExists()");
		votingAppController.castVote(100, 10);
		logger.info("[END] testElectionNotExists()");
	}
	
	//Test case to check if candidate with candidateID exists
	@Test(expected=CandidateNotFoundException.class)
	public void testCandidateNotExists() throws InvalidInputException, CandidateNotFoundException, ElectionNotFoundException
	{
		logger.info("[START] testCandidateNotExists()");
		votingAppController.castVote(10, 100);
		logger.info("[END] testCandidateNotExists()");
	}
	
	//Test case for successful vote cast
	@Test
	public void testCastVoteSuccess() throws CandidateNotFoundException, ElectionNotFoundException, InvalidInputException
	{	
		logger.info("[START] testCastVoteSuccess()");
		assertEquals(true,votingAppController.castVote(10,12));
		logger.info("[END] testCastVoteSuccess()");
	}
}
