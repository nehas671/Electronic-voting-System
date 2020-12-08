package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import javax.persistence.Entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.VotingApp.dto.Election;

import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ElectionNotFoundException;

import com.cg.VotingApp.presentation.ElectionController;
import com.cg.VotingApp.exception.ItemNotFoundException;


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
	public void addCandidateSuccess() throws ElectionNotFoundException, ItemNotFoundException{
		logger.info("[START] addElectionSuccess()");
		
		ElectionEntity entity=new ElectionEntity(3,"state election","maharashtra","mumbai","12-02-2021");
		
			
				electionController.addElection(entity);
				int id =entity.getElection_id();
				
		
		assertEquals(electionController.findItemById(id).getElection_id(),id);
		logger.info("[END] testItemSearchSuccess()");
	}
	
	
	
	
	
	
	@Test(expected = ItemNotFoundException.class)
	public void testItemSearchFailed() throws ItemNotFoundException{
		logger.info("[START] testItemSearchFailed()");
		electionController.findItemById(2);
		logger.info("[END] testItemSearchFailed()");
	}
	
}




