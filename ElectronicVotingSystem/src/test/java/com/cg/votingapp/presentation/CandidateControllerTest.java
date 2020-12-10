package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CandidateControllerTest {

	private static CandidateController candidateController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(CandidateControllerTest.class.getName());
		candidateController = new CandidateController();
	}
	@Test
	public void addCandidateSuccess(){
		logger.info("[START] addCandidateSuccess()");
		Candidate cand=new Candidate(111,"Ravi","Kolkata", 34, 9188889901L, 0);
		assertEquals(cand.getCandidate_id(), candidateController.addCandidate(cand).getCandidate_id());
		logger.info("[END] addCandidateSuccess()");
	}
	
	@Test
	public void testCandidateId() throws NullValueFoundException {
		
		logger.info("[START] testCandidateId");
		Candidate cand=new Candidate(222,"Komal","Mumbai", 25, 9188889700L, 0);
		int id= candidateController.addCandidate(cand).getCandidate_id();
		assertNotNull("Candidate_Id is not null", candidateController.checkId(id));
		logger.info("[END] testCandidateId");
	}
	
	@Test
	public void testCandidateName() throws NullValueFoundException {
		
		logger.info("[START] testCandidateName()");
		Candidate cand=new Candidate(333,"Raj","Pune", 30, 9188889299L, 0);
		String name= candidateController.addCandidate(cand).getCandidate_name();
		assertNotNull("Candidate_Name is not null", candidateController.checkName(name));
		logger.info("[END] testICandidateName");
	}
	@Test
	public void testCandidateAge() throws RecordNotFoundException
	{
		logger.info("[START] testCandidateAge()");
		Candidate cand=new Candidate(444,"Ram","Banglore", 33, 9188886211L, 0);
		int age= candidateController.addCandidate(cand).getAge();
		assertTrue("Age should be greater than or equal to 25", age>25);
	}
	
	@Test
	public void viewCandidateSuccess() throws RecordNotFoundException{
		logger.info("[START] viewCandidateSuccess()");
		assertNotNull("Candidate Entity", candidateController.viewCandidate(111));
		logger.info("[END] viewCandidateSuccess()");
	}
	
	@Test(expected = RecordNotFoundException.class)
	public void viewCandidateFail() throws RecordNotFoundException{
		logger.info("[START] viewCandidateFail()");
	    candidateController.viewCandidate(110);
		logger.info("[END] viewCandidateFail()");
	}
	
}





