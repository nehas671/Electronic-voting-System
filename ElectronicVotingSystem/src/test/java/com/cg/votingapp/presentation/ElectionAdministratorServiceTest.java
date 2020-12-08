package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.entity.ElectionEntity;



import com.cg.votingapp.exceptions.RecordNotFoundException;


public class ElectionAdministratorServiceTest {

	private static ElectionController electionController;
	//private static ElectionServiceImpl electionService;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ElectionAdministratorServiceTest.class.getName());
		electionController = new ElectionController();
	}
	
	
	@Test
	public void addElectionSuccess() throws RecordNotFoundException{
		logger.info("[START] addElectionSuccess()");
		
		ElectionEntity entity=new ElectionEntity(4,"state election","maharashtra","mumbai","12-02-2021");
		
			
				electionController.addElection(entity);
				int id =entity.getElection_id();
				
		
		assertEquals(electionController.findItemById(id).getElection_id(),id);
		logger.info("[END] testItemSearchSuccess()");
	}
	
	
	@Test
	public void viewElectionSuccess() throws RecordNotFoundException{
		logger.info("[START] addElectionSuccess()");
		
		
		
		//assertEquals(electionController.findItemById(id).getElection_id(),id);
		logger.info("[END] testItemSearchSuccess()");
	}
	
	
	
	
	
	
	
	@Test
	public void testItemSearchSuccess() throws RecordNotFoundException {
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", electionController.findItemById(1));
		logger.info("[END] testItemSearchSuccess()");
	}
	
	
	
	@Test(expected = RecordNotFoundException.class)
	public void testItemSearchFailed() throws RecordNotFoundException{
		logger.info("[START] testItemSearchFailed()");
		electionController.findItemById(-2);
		logger.info("[END] testItemSearchFailed()");
	}
	
}




