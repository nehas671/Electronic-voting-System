package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.dto.Party;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.presentation.VotingAppAdministratorService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class VotingAppAdministratorServiceTest {

	private static VotingAppAdministratorService votingAppAdministratorService;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(VotingAppAdministratorServiceTest.class.getName());
		votingAppAdministratorService = new VotingAppAdministratorService();
	}
	
	@Test
	public void addCandidateSuccess(){
		logger.info("[START] addCandidateSuccess()");
		Party party=new Party("Bhartya Janta Party", "PM Narendra Modi", "Lotus");
		Candidate candidate=new Candidate("Ravi","Kolkata", 34, 91888899, 0, party);
		int id=votingAppAdministratorService.addCandidate(candidate).getCandidate_id();
		assertEquals(candidate.getCandidate_id(), id);
		logger.info("[END] addCandidateSuccess()");
	}
	
}


