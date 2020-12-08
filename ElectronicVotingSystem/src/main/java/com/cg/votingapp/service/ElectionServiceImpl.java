package com.cg.votingapp.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cg.votingapp.dao.ElectionDAO;
import com.cg.votingapp.dao.ElectionDAOImpl;
import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.InvalidStateException;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;

import com.cg.votingapp.utils.ElectionUtils;




public class ElectionServiceImpl implements ElectionService {
	
	private static Logger logger;
	


ElectionDAO electionDAO = new ElectionDAOImpl();

public void addElection(ElectionEntity entity) throws  InvalidStateException
{
	logger = LogManager.getLogger(ElectionServiceImpl.class.getName());
	logger.info("addddiggg");
	
	 electionDAO.addElection(entity);
	//logger.info("ElectionEntity: " + Electionentity);
	//return ElectionUtils.convertElectionEntityIntoElection(Electionentity);
}


public Election findById(int ElectionId) throws RecordNotFoundException {
	ElectionEntity electionEntity;

	electionEntity = electionDAO.findById(ElectionId);
		logger.info("ElectionEntity: " + electionEntity);
	
	
	return ElectionUtils.convertElectionEntityIntoElection(electionEntity);
}



public Boolean viewElection() {
	// TODO Auto-generated method stub
	
	

	 electionDAO.viewElection();
		//logger.info("ElectionEntity: " + electionEntity);
	
	
		return true;
	
	
}


public Boolean viewElectionById(int election_id) throws  NullValueFoundException {
	// TODO Auto-generated method stub
	 electionDAO.viewElectionById(election_id);

	
	return true;
}


}