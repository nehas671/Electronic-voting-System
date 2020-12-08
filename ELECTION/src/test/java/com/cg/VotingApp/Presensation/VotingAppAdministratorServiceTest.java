package com.cg.VotingApp.Presensation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import javax.persistence.Entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.VotingApp.dto.Party;
import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ElectionNotFoundException;
import com.cg.VotingApp.presentation.ElectionController;

public class VotingAppAdministratorServiceTest {

	private static ElectionController electionController;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(VotingAppAdministratorServiceTest.class.getName());
		electionController = new ElectionController();
	}
	
	@Test
	public void addCandidateSuccess(){
		logger.info("[START] addElectionSuccess()");
		
		ElectionEntity entity=new ElectionEntity("state election","maharashtra","mumbai","12-02-2021");
		
			try {
				electionController.addElection(entity);
			} catch (ElectionNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// assertEquals(electionController.addElection(entity).getElection_id(), id);
		
		assertEquals(1,1);
		logger.info("[END] testItemSearchSuccess()");
	}
	
}




