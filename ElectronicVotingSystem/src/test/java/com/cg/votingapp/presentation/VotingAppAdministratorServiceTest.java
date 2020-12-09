package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
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
		Candidate cand=new Candidate(111,"Ravi","Kolkata", 34, 91888899, 0);
		assertEquals(cand.getCandidate_id(), votingAppAdministratorService.addCandidate(cand).getCandidate_id());
		logger.info("[END] addCandidateSuccess()");
	}
	
	@Test
	public void testICandidateId() throws NullValueFoundException {
		
		logger.info("[START] testICandidateId");
		Candidate cand=new Candidate(222,"Komal","Mumbai", 25, 91888897, 0);
		int id= votingAppAdministratorService.addCandidate(cand).getCandidate_id();
		assertNotNull("Candidate_Id is not null", votingAppAdministratorService.checkId(id));
		logger.info("[END] testICandidateId");
	}
	
	@Test
	public void testCandidateName() throws NullValueFoundException {
		
		logger.info("[START] testCandidateName()");
		Candidate cand=new Candidate(333,"Raj","Pune", 30, 91888892, 0);
		String name= votingAppAdministratorService.addCandidate(cand).getCandidate_name();
		assertNotNull("Candidate_Name is not null", votingAppAdministratorService.checkName(name));
		logger.info("[END] testICandidateName");
	}
	@Test
	public void testCandidateAge()
	{
		logger.info("[START] testCandidateAge()");
		Candidate cand=new Candidate(444,"Ram","Banglore", 23, 91888862, 0);
		int age= votingAppAdministratorService.addCandidate(cand).getAge();
		assertTrue("Age should be greater than or equal to 25", age>25);
	}
	
}





