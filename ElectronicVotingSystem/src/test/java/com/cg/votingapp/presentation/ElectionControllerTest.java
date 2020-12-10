package com.cg.votingapp.presentation;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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



public class ElectionControllerTest {

	private static ElectionController electionController;
	
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ElectionControllerTest.class.getName());
		electionController = new ElectionController();
	}
	
	
	
	/*----add Election Success----*/
	@Test
	public void addElectionSuccess() throws  InvalidStateException, RecordNotFoundException, NullValueFoundException{
		logger.info("[START] addElectionSuccess()");
		
		PartysEntity party1 = new PartysEntity("congress","rahul gandhi","hand");
		PartysEntity party2 = new PartysEntity("bjp","modiji","lotus");
	
		Set<PartysEntity> parties = new HashSet<PartysEntity>();
		parties.add(party1);
		parties.add(party2);
		
		
		ElectionEntity entity=new ElectionEntity(5,"loksabha","Punjab","nashik","12-02-2021",parties);
		electionController.addElection(entity);
		int id = entity.getElection_id();
				
		
		assertEquals(electionController.findElectionById(id).getElection_id(),id);
		logger.info("[END] addElectionSuccess()");
	}
	
	
	
	
	/*-----adding valid State Success-----*/
	@Test
	public void addStateSuccess() throws InvalidStateException, NullValueFoundException, RecordNotFoundException{
		logger.info("[START] addStateSuccess()");
		
		ElectionEntity entity=new ElectionEntity(9,"State Election","Maharashtra","nashik","12-02-2021");
		
			
		electionController.addElection(entity);
		int id = entity.getElection_id();
				
		
		assertNotEquals(electionController.findElectionById(id),id);
		logger.info("[END] addStateSuccess()");
	}
	
	
	
	
	/*-----add State Fails----*/
	
	@Test(expected =InvalidStateException.class)
	public void addStateFails() throws InvalidStateException, NullValueFoundException, RecordNotFoundException{
		logger.info("[START] addStateFails()");
		
		ElectionEntity entity=new ElectionEntity(9,"xyz","usa","nashik","12-02-2021");
			
		electionController.addElection(entity);
		int id = entity.getElection_id();
				
		assertNotEquals(electionController.findElectionById(id),id);
		logger.info("[END] addStateFails()");
	}
	
	
	
	/*------View AllElectionSuccess-----*/
	@Test
	public void viewElectionSuccess() throws RecordNotFoundException{
		logger.info("[START] viewElectionSuccess()");
		assertEquals(true,electionController.viewElection());
		logger.info("[END] viewElectionSuccess()");
	}
	
	
	
	/*-----View Election By Id Success-------*/
	@Test
	public void viewElectionByIdSuccess() throws  NullValueFoundException{
		logger.info("[START] viewElectionByIdSuccess()");
		assertEquals(true,electionController.viewElectionById(5));
		logger.info("[END] viewElectionByIdSuccess()");
	}
	
	
	/*-----View Election By Id Fail-------*/
	
	@Test (expected = NullValueFoundException.class)
	public void viewElectionByIdFail() throws NullValueFoundException{
		logger.info("[START] viewElectionByIdFail()");
		assertEquals(true,electionController.viewElectionById(-3));
		logger.info("[END] viewElectionByIdFail()");
	}
	
	
	
	
	
}





