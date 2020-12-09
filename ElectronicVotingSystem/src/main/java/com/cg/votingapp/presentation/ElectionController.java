package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.InvalidStateException;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.ElectionService;
import com.cg.votingapp.service.ElectionServiceImpl;


public class ElectionController {

	
	private static Logger logger = LogManager.getLogger(ElectionController.class.getName());
	ElectionService electionService = new ElectionServiceImpl();
	
	public void addElection(ElectionEntity entity ) throws  InvalidStateException, RecordNotFoundException {
		logger.info("Inserting election for id: " + entity.getElection_id());
		 
		try {
			electionService.addElection(entity);
		}
		catch(InvalidStateException e) {
			logger.error("InvalidNotFoundException: " + e);
			throw new InvalidStateException(e.getMessage());
		}
		catch(RecordNotFoundException e) {
			logger.error("InvalidNotFoundException: " + e);
			throw new  RecordNotFoundException(e.getMessage());
		}
		
		
	}
	
	
	public Election findItemById(int itemId) throws RecordNotFoundException {
		logger.info("Finding item for id: " + itemId);
		Election election = null;
		try {
			election = electionService.findById(itemId);
		}
		catch(Exception e) {
			logger.error("ItemNotFoundException: " + e);
			throw new RecordNotFoundException(e.getMessage());
		}
		return election;
	}
	
	
	public Boolean viewElection() throws RecordNotFoundException{
		
		Boolean viewelection = null;
		try {
			viewelection = electionService.viewElection();
		}
		catch(Exception e) {
			logger.error("RecordNotFoundException: " + e);
			throw new RecordNotFoundException(e.getMessage());
		}
		return viewelection;
		
		
		
	}


	public Boolean  viewElectionById(int election_id) throws  NullValueFoundException {
		
		logger.info("Finding election for id: " + election_id);
		Boolean election = null;
		try {
			election = electionService.viewElectionById(election_id);
		}
		catch(Exception e) {
			logger.error("ItemNotFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return election;
		
	}
}