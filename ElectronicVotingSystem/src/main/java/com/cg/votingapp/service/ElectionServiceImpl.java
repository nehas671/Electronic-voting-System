package com.cg.votingapp.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cg.votingapp.dao.ElectionDAO;
import com.cg.votingapp.dao.ElectionDAOImpl;
import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.presentation.ElectionController;
import com.cg.votingapp.utils.ElectionUtils;
import com.cg.votingapp.exceptions.ItemNotFoundException;



public class ElectionServiceImpl implements ElectionService {
	
	private static Logger logger;
	


ElectionDAO electionDAO = new ElectionDAOImpl();

public void addElection(ElectionEntity entity) throws ElectionNotFoundException
{
	logger = LogManager.getLogger(ElectionServiceImpl.class.getName());
	logger.info("addddiggg");
	
	 electionDAO.addElection(entity);
	//logger.info("ElectionEntity: " + Electionentity);
	//return ElectionUtils.convertElectionEntityIntoElection(Electionentity);
}


public Election findById(int ElectionId) throws ItemNotFoundException {
	ElectionEntity electionEntity;

	electionEntity = electionDAO.findById(ElectionId);
		logger.info("ElectionEntity: " + electionEntity);
	
	
	return ElectionUtils.convertElectionEntityIntoElection(electionEntity);
}


}