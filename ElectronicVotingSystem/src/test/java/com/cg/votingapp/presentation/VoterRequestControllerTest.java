package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.ReqNotFoundException;
import com.cg.votingapp.exceptions.UserNotFoundException;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class VoterRequestControllerTest {
	private static  VoterRequestController voterRequestController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(VoterRequestControllerTest.class.getName());
		voterRequestController = new VoterRequestController();
	}
	@Test
	public void CheckByUserId() throws RecordNotFoundException 
	{	
		logger.info("[START] CheckByUserId()");
		assertNotNull("Voter id Found", voterRequestController.viewVoterRequest(1));
		logger.info("[END] CheckByUserId()");
	}
	@Test
	public void approveVoterRequestSuccess() throws UserNotFoundException, NullValueFoundException
	{	
		logger.info("[START] approveVoterRequestSuccess()");
		assertEquals(true,voterRequestController.approveVoterRequest(1));
		logger.info("[END] approveVoterRequestSuccess()");
	}
	@Test
	public void addVoterRequestSuccess(){
		logger.info("[START] addVoterRequestSuccess()");
		//VoterRequest voter=new VoterRequest(9871,"Ambikapur","AW43215");
		//assertEquals(voter.getUser_id(), voterRequestController.addVoterRequest(voter).getUser_id());
		logger.info("[END] addVoterRequestSuccess()");
	}

}
