package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.ResultNotFoundException;

public class ViewResultControllerTest {
	
	private static ViewResultController viewresultController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ViewResultControllerTest.class.getName());
		viewresultController = new ViewResultController();
	
	}
	
	@Test
	public void viewResult() throws ResultNotFoundException{
		logger.info("[Start] viewResult()");
		assertEquals(true,viewresultController.ViewResult());
		logger.info("[End] viewResult()");
	}
	
}
