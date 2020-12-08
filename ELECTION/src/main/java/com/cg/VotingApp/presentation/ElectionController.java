package com.cg.VotingApp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.dto.Election;
import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ElectionNotFoundException;
import com.cg.VotingApp.service.ElectionService;
import com.cg.VotingApp.service.ElectionServiceImpl;


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

}
