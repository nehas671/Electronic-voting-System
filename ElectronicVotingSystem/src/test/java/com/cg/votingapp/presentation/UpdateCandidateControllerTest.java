package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.exceptions.NullValueFoundException;

public class UpdateCandidateControllerTest {

	private static UpdateCandidateController updatecandidateController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(UpdateCandidateControllerTest.class.getName());
		updatecandidateController = new UpdateCandidateController();
	}
	
	@Test
	public void updateCandidateName(){
		logger.info("[START] updateCandidateName()");
		//updatecandidateController.updateCandidateName(1, "Abha");
		try {
			assertEquals("Candidate name updated succssfully!!", updatecandidateController.updateCandidateName(1, "Abha"));
		} catch (NullValueFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("[END] updateCandidateSuccess()");
	}
	
	@Test
	public void updateCandidateAddress() {
		logger.info("[START] updateCandidateAddress");
		try {
			assertEquals("Address updated succssfully!!", updatecandidateController.updateAddress(1, "Reshimbag, Nagpur"));
		} catch (NullValueFoundException e) {
			e.printStackTrace();
			
		}
		logger.info("[END] updateCandidateSuccess");
	}
	
	@Test
	public void updateCandidateAge() {
		logger.info("[START] updateCandidateAge");
		try {
			assertEquals("Age updated succssfully!!", updatecandidateController.updateAge(1, 37));
		} catch (NullValueFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("[END] updateCandidateAge");
	}
	
	
	@Test
	public void updateCandidateContactDetails() {
		logger.info("[START] updateCandidateContactDetails");
		try {
			assertEquals("Contact updated succssfully!!", updatecandidateController.updateContactDetails(1, 9453) );
		} catch (NullValueFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	
}
