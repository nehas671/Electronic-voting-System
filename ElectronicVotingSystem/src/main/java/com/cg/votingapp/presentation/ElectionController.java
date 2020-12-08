package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.dto.Election;
import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ElectionNotFoundException;
import com.cg.VotingApp.service.ElectionService;
import com.cg.VotingApp.service.ElectionServiceImpl;
import com.cg.VotingApp.dto.Election;
import com.cg.VotingApp.exception.ItemNotFoundException;

public class ElectionController {

	
	private static Logger logger = LogManager.getLogger(ElectionController.class.getName());
	ElectionService electionService = new ElectionServiceImpl();
	
	public void addElection(ElectionEntity entity ) throws ElectionNotFoundException {
		logger.info("Inserting election for id: " + entity.getElection_id());
		 
		try {
			electionService.addElection(entity);
		}
		catch(Exception e) {
			logger.error("ElectionNotFoundException: " + e);
			throw new ElectionNotFoundException(e.getMessage());
		}
		
	}
	
	
	public Election findItemById(int itemId) throws ItemNotFoundException {
		logger.info("Finding item for id: " + itemId);
		Election election = null;
		try {
			election = electionService.findById(itemId);
		}
		catch(Exception e) {
			logger.error("ItemNotFoundException: " + e);
			throw new ItemNotFoundException(e.getMessage());
		}
		return election;
	}
}