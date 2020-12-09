package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.InvalidStateException;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.PartysEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;


public class ElectionAdministratorServiceTest {

	private static ElectionController electionController;
	
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ElectionAdministratorServiceTest.class.getName());
		electionController = new ElectionController();
	}
	
	
	@Test
	public void addElectionSuccess() throws RecordNotFoundException, InvalidStateException{
		logger.info("[START] addElectionSuccess()");
		
		PartysEntity p2 = new PartysEntity("congress","rahul gandhi","hand");
		PartysEntity p1 = new PartysEntity("bjp","modiji","lotus");
	
		Set<PartysEntity> parties = new HashSet<PartysEntity>();
		parties.add(p1);
		parties.add(p2);
		
		
		ElectionEntity entity=new ElectionEntity(10,"xyz","Mizoram","nashik","12-02-2021",parties);
		//ElectionEntity entity=new ElectionEntity(8,"xyz","Maharashtra","nashik","12-02-2021");
			
				electionController.addElection(entity);
				int id = entity.getElection_id();
				
		
		assertEquals(electionController.findItemById(id).getElection_id(),id);
		logger.info("[END] addElectionSuccess()");
	}
	
	
	
	@Test(expected =InvalidStateException.class)
	public void addStateFails() throws InvalidStateException, RecordNotFoundException{
		logger.info("[START] addStateFails()");
		
		ElectionEntity entity=new ElectionEntity(9,"xyz","usa","nashik","12-02-2021");
		
			
				electionController.addElection(entity);
				int id = entity.getElection_id();
				
		
		assertNotEquals(electionController.findItemById(id),id);
		logger.info("[END] addStateFails()");
	}
	
	
	
	
	@Test
	public void viewElectionSuccess() throws RecordNotFoundException{
		logger.info("[START] viewElectionSuccess()");
		
		assertEquals(true,electionController.viewElection());
		logger.info("[END] viewElectionSuccess()");
	}
	
	
	
	
	@Test
	public void viewElectionByIdSuccess() throws  NullValueFoundException{
		logger.info("[START] viewElectionByIdSuccess()");
		
		assertEquals(true,electionController.viewElectionById(3));
		logger.info("[END] viewElectionByIdSuccess()");
	}
	
	@Test (expected = NullValueFoundException.class)
	public void viewElectionByIdFail() throws NullValueFoundException{
		logger.info("[START] viewElectionByIdSuccess()");
		
		assertEquals(true,electionController.viewElectionById(-3));
		logger.info("[END] viewElectionByIdSuccess()");
	}
	
	
	
	
	
}




