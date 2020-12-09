package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;

public class UpdateCandidateControllerTest {

	private static UpdateCandidateController updatecandidateController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(UpdateCandidateControllerTest.class.getName());
		updatecandidateController = new UpdateCandidateController();
	}
	
	
}
